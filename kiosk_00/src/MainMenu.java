public class MainMenu {
    public static void menuheader() {
        System.out.println("------------------------------------");
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
    }

    public static void displayMenus(Category[] categories) {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i].getName() + "\t| " + categories[i].getDesc());
        }
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println((categories.length + 1) + ". Order\t| 장바구니를 확인 후 주문합니다.");
        System.out.println((categories.length + 2) + ". Cancel\t| 진행중인 주문을 취소합니다.");
    }
}
