import entity.Cart;
import entity.Catalogue;
import entity.Item;
import entity.User;

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

    public EShop(){
        this.currentUser = null;
        this.currentCart = new Cart();
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

    public void showCart() {
        List<Item> cartItems = currentCart.getItems();
        System.out.println("Ваша корзина: ");
        cartItems.forEach(item -> System.out.println(item.getName() + " - " + item.getPrice()));
        System.out.println("--------------------------------------");
        System.out.println("Сумма: " + currentCart.getTotalPrice());
    }

    public void buyCart() {
        System.out.println("Вы купили товары на " + currentCart.getTotalPrice() +" руб.");
        currentCart = new Cart();
    }

    public void addToCart(int itemId, int catalogueId) {
        currentCart.add(catalogues.get(catalogueId).getItems().get(itemId));
    }
}
