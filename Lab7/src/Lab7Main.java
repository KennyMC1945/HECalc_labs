import java.util.Scanner;

public class Lab7Main {
    public static void main(String[] args) {
        EShop shop = new EShop();
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            if (shop.currentUser == null) System.out.println("0. Авторизация");
            else {
                System.out.println("Здравствуйте, "+shop.currentUser.getLogin());
                System.out.println("1. Посмотреть каталоги");
                System.out.println("2. Посмотреть корзину");
                if (shop.lastBoughtCart != null) {
                    System.out.println("3. Последняя купленная корзина");
                }
            }
            input = sc.nextInt();
            switch (input) {
                case 0: {
                    System.out.println("Введите логин");
                    String login = sc.next();
                    System.out.println("Введите пароль");
                    String pass = sc.next();
                    shop.auth(login, pass);

                    break;
                }

                case 1: {
                    shop.showCatalogues();
                    System.out.println("Выберите какой каталог вы хотите рассмотреть: ");
                    int catalogueId = sc.nextInt();
                    int itemId;
                    if (catalogueId > 0) {
                        do {
                            System.out.println("0. Выйти в меню");
                            shop.showCatalogueItems(catalogueId-1);
                            System.out.println("Выберите какой товар вы хотите добавить в корзину\nИли введите 0 для выхода в меню: ");
                            itemId = sc.nextInt();
                            if (itemId > 0) shop.addToCart(itemId-1, catalogueId-1);
                        } while(itemId != 0);
                    }

                    break;
                }
                case 2: {
                    shop.showCurrentCart();
                    System.out.println("0. Выйти в меню");
                    System.out.println("1. Купить все");
                    int answer = sc.nextInt();
                    if (answer == 1) shop.buyCart();
                    break;
                }
                case 3: {
                    shop.showLastCart();
                    System.out.println("0. Выйти в меню");
                    sc.nextInt();
                    break;
                }
            }
        } while (input != -1);
    }
}
