import entity.Cart;
import entity.Catalogue;
import entity.Item;
import entity.User;

import java.io.*;
import java.util.List;
import java.util.Map;

public class EShop {
    static Map<String, String> users = Map.of("User","Pass1", "Admin", "1234");
    static List<Catalogue> catalogues = List.of(
        new Catalogue("Техника", List.of(new Item("Компьютер", 45000, "2 ядра, 2 гига, игровая видеокарта"))),
        new Catalogue("Посуда", List.of(
            new Item("Тарелки", 500, "5 синих тарелок"),
            new Item("Стакан", 150, "250мл стакан стекло"))
        )
    );
    User currentUser;
    Cart currentCart;
    Cart lastBoughtCart;

    public EShop(){
        this.currentUser = null;
        this.currentCart = new Cart();
        this.lastBoughtCart = loadLastCart();
    }

    public User auth(String login, String pass) {
        this.currentUser = (users.containsKey(login) && users.get(login).equals(pass)) ? new User(login, pass) : new User();
        return currentUser;
    }

    public void showCatalogues() {
        for (int i = 0; i<catalogues.size(); i++) {
            System.out.println((i+1)+". "+catalogues.get(i).getName());
        }
    }

    public void showCatalogueItems(int catalogueId) {
        List<Item> items = catalogues.get(catalogueId).getItems();
        for (int i = 0; i<items.size(); i++) {
            Item item = items.get(i);
            System.out.println((i+1)+". "+item.getName() + " " + item.getPrice() + " руб.\nОписание: " + item.getDescription());
        }

    }


    public void showCurrentCart() {
        showCart(currentCart);
    }
    public void showCart(Cart cart) {
        List<Item> cartItems = cart.getItems();
        System.out.println("Ваша корзина: ");
        cartItems.forEach(item -> System.out.println(item.getName() + " - " + item.getPrice()));
        System.out.println("--------------------------------------");
        System.out.println("Сумма: " + cart.getTotalPrice());
    }

    public void showLastCart() {
        showCart(lastBoughtCart);
    }

    public void buyCart() {
        System.out.println("Вы купили товары на " + currentCart.getTotalPrice() +" руб.");
        saveCheckToFile(currentCart);
        serializeLastCart(currentCart);
        lastBoughtCart = currentCart;
        currentCart = new Cart();
    }

    public Cart loadLastCart() {
        File cartObjFile = new File("./last_cart.bin");
        try {
            try (FileInputStream fIn = new FileInputStream(cartObjFile)) {
                ObjectInputStream oos = new ObjectInputStream(fIn);
                return (Cart) oos.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {} catch (IOException e) {}
        return null;
    }
    public void serializeLastCart(Cart cart) {
        File cartObjFile = new File("./last_cart.bin");
        try {
            try (FileOutputStream fOut = new FileOutputStream(cartObjFile)) {
                ObjectOutputStream oos = new ObjectOutputStream(fOut);
                oos.writeObject(cart);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveCheckToFile(Cart cart) {
        File cartFile = new File("./cart-last.txt");
        try (PrintWriter pw = new PrintWriter(cartFile)) {
            pw.println("Товары: ");
            for (Item item : cart.getItems())
                pw.println(item.getName() + " - " + item.getPrice() + " руб.");
            pw.println("-------------");
            pw.println("Сумма: " + cart.getTotalPrice() + " руб.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addToCart(int itemId, int catalogueId) {
        currentCart.add(catalogues.get(catalogueId).getItems().get(itemId));
    }
}
