import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //테스트
        Scanner sc          = new Scanner(System.in);
        Order   order       = new Order();
        double  totalAmount = 0;
        int     orderNumber = 0;
        int     menuStack   = 0;
        int     ordercheck; // 주문 확인, 취소

        Category Burgers = new Category("Burgers", "앵거스 비프 통살을 다져만든 버거");
        Burgers.addMenu(new Menu("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Burgers.addMenu(new Menu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        Burgers.addMenu(new Menu("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        Burgers.addMenu(new Menu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        Burgers.addMenu(new Menu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Category FrozenCustard = new Category("FrozenCustard", "매장에서 신선하게 만드는 아이스크림");
        FrozenCustard.addMenu(new Menu("shake of the Week", 6.5, "특별한 커스터드 플레이버"));
        FrozenCustard.addMenu(new Menu("Red Bean shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"));
        FrozenCustard.addMenu(new Menu("Floats", 5.9, "루트 비어, 퍼플 카우, 크림시클"));

        Category Drinks = new Category("Drinks", "매장에서 직접 만드는 음료");
        Drinks.addMenu(new Menu("Shake-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드"));
        Drinks.addMenu(new Menu("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티"));
        Drinks.addMenu(new Menu("Fountain Soda", 2.7, "콜라, 사이다, 환타"));

        Category Beer = new Category("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");
        Beer.addMenu(new Menu("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"));
        Beer.addMenu(new Menu("Magpie Brewing Co.", 6.8, ""));

        while (true) {
            // 카테고리 메뉴판
            MainMenu.menuheader();
            Category[] categories = {Burgers, FrozenCustard, Drinks, Beer};
            MainMenu.displayMenus(categories);

            System.out.print("번호를 입력해 주세요 : ");
            int categoryChoice = sc.nextInt();
            sc.nextLine();

            if (categoryChoice == 1) {
                // Burgers
                MainMenu.menuheader();
                // 메뉴판
                System.out.println("[ " + Burgers.getName() + " MENU ]");
                // Burgers 메뉴 출력
                for (Menu menu : Burgers.getMenus()) {
                    menuStack++;
                    System.out.println(menuStack + ". " + menu.getName() + "\t| W " + menu.getPrice() + " | " + menu.getDesc());
                }
                menuStack = 0;
                System.out.print("번호를 입력해 주세요 : ");
                int productChoice = sc.nextInt();
                sc.nextLine();
                System.out.println();
                // 구매 화면
                if (productChoice == 1 || productChoice == 2 || productChoice == 3 || productChoice == 4 || productChoice == 5) {
                    Menu selectMenu = Burgers.getMenus().get(productChoice - 1);
                    System.out.println("\"" + selectMenu.getName() + "\t| W " + selectMenu.getPrice() + " | " + selectMenu.getDesc() + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인\t2. 취소");
                    int orderCheck = sc.nextInt();
                    sc.nextLine();
                    if (orderCheck == 1) {
                        order.addMenuOrder(selectMenu);
                        System.out.println(selectMenu.getName() + " 가 장바구니에 추가되었습니다.");
                    } else if (orderCheck == 2) {
                        System.out.println("취소 하셨습니다.");
                    }
                }
            } else if (categoryChoice == 2) {
                // FrozenCustard
                MainMenu.menuheader();
                // 메뉴판
                System.out.println("[ " + FrozenCustard.getName() + " MENU ]");
                // FrozenCustard 메뉴 출력
                for (Menu menu : FrozenCustard.getMenus()) {
                    menuStack++;
                    System.out.println(menuStack + ". " + menu.getName() + "\t| W " + menu.getPrice() + " | " + menu.getDesc());
                }
                menuStack = 0;
                System.out.print("번호를 입력해 주세요 : ");
                int productChoice = sc.nextInt();
                sc.nextLine();
                System.out.println();
                // 구매 화면
                if (productChoice == 1 || productChoice == 2 || productChoice == 3) {
                    Menu selectMenu = FrozenCustard.getMenus().get(productChoice - 1);
                    System.out.println("\"" + selectMenu.getName() + "\t| W " + selectMenu.getPrice() + " | " + selectMenu.getDesc() + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인\t2. 취소");
                    int orderCheck = sc.nextInt();
                    sc.nextLine();
                    if (orderCheck == 1) {
                        order.addMenuOrder(selectMenu);
                        System.out.println(selectMenu.getName() + " 가 장바구니에 추가되었습니다.");
                    } else if (orderCheck == 2) {
                        System.out.println("취소 하셨습니다.");
                    }
                }
            } else if (categoryChoice == 3) {
                // Drinks
                MainMenu.menuheader();
                // 메뉴판
                System.out.println("[ " + Drinks.getName() + " MENU ]");
                // FrozenCustard 메뉴 출력
                for (Menu menu : Drinks.getMenus()) {
                    menuStack++;
                    System.out.println(menuStack + ". " + menu.getName() + "\t| W " + menu.getPrice() + " | " + menu.getDesc());
                }
                menuStack = 0;
                System.out.print("번호를 입력해 주세요 : ");
                int productChoice = sc.nextInt();
                sc.nextLine();
                System.out.println();
                // 구매 화면
                if (productChoice == 1 || productChoice == 2 || productChoice == 3) {
                    Menu selectMenu = Drinks.getMenus().get(productChoice - 1);
                    System.out.println("\"" + selectMenu.getName() + "\t| W " + selectMenu.getPrice() + " | " + selectMenu.getDesc() + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인\t2. 취소");
                    int orderCheck = sc.nextInt();
                    sc.nextLine();
                    if (orderCheck == 1) {
                        order.addMenuOrder(selectMenu);
                        System.out.println(selectMenu.getName() + " 가 장바구니에 추가되었습니다.");
                    } else if (orderCheck == 2) {
                        System.out.println("취소 하셨습니다.");
                    }
                }
            } else if (categoryChoice == 4) {
                // Beer
                MainMenu.menuheader();
                // 메뉴판
                System.out.println("[ " + Beer.getName() + " MENU ]");
                // FrozenCustard 메뉴 출력
                for (Menu menu : Beer.getMenus()) {
                    menuStack++;
                    System.out.println(menuStack + ". " + menu.getName() + "\t| W " + menu.getPrice() + " | " + menu.getDesc());
                }
                menuStack = 0;
                System.out.print("번호를 입력해 주세요 : ");
                int productChoice = sc.nextInt();
                sc.nextLine();
                System.out.println();
                // 구매 화면
                if (productChoice == 1 || productChoice == 2 || productChoice == 3) {
                    Menu selectMenu = Beer.getMenus().get(productChoice - 1);
                    System.out.println("\"" + selectMenu.getName() + "\t| W " + selectMenu.getPrice() + " | " + selectMenu.getDesc() + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인\t2. 취소");
                    int orderCheck = sc.nextInt();
                    sc.nextLine();
                    if (orderCheck == 1) {
                        order.addMenuOrder(selectMenu);
                        System.out.println(selectMenu.getName() + " 가 장바구니에 추가되었습니다.");
                    } else if (orderCheck == 2) {
                        System.out.println("취소 하셨습니다.");
                    }
                }
            } else if (categoryChoice == 5) {
                // 5. Order       | 장바구니를 확인 후 주문합니다.
                System.out.println("아래와 같이 주문 하시겠습니까?");
                System.out.println();
                System.out.println("[ Orders ]");
                for (Menu menu : order.getOrderMenus()) {
                    System.out.println(menu.getName() + "\t| W " + menu.getPrice() + " | " + menu.getDesc());
                    totalAmount += menu.getPrice();
                }
                System.out.println();
                System.out.println("[ Total ]");
                System.out.println("W " + totalAmount);
                System.out.println("1. 주문\t2. 메뉴판");
                ordercheck = sc.nextInt();
                sc.nextLine();
                if (ordercheck == 1) {
                    System.out.println("주문이 완료되었습니다!");
                    // 장바구니 초기화
                    order = new Order();
                    totalAmount = 0;
                    System.out.println();
                    orderNumber++;
                    System.out.println("대기번호는 " + "[ " + orderNumber + " ]");
                    System.out.println("3초후 메뉴판으로 돌아갑니다.");
                    try {
                        Thread.sleep(3000); // 3초 동안 일시 정지
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                } else if (ordercheck == 2) {
                }
            } else if (categoryChoice == 6) {
                // 6. Cancel      | 진행중인 주문을 취소합니다.
                System.out.println("진행하던 주문을 취소하시겠습니까?");
                System.out.println("1. 확인\t2. 취소");
                ordercheck = sc.nextInt();
                if (ordercheck == 1) {
                    order = new Order();
                    totalAmount = 0;
                    System.out.println("진행하던 주문이 취소되었습니다.");
                } else if (ordercheck == 2) {
                }
            }
        }
    }
}

