package kiosk.lv_4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    Scanner scan = new Scanner(System.in);
    List<Menu> menus;

    // 생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // 기능
    public void start() {
        while (true) {
            System.out.println("=====================");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.println("=====================");
            System.out.println("카테고리를 골라주세요.");

            int categoryChoice = scan.nextInt();
            if (categoryChoice == 0) break;
            if (categoryChoice < 1 || categoryChoice > menus.size()) {
                System.out.println("존재하지 않는 카테고리입니다.");
                continue;
            }

            Menu selectedMenu = menus.get(categoryChoice - 1);
            List<MenuItem> items = selectedMenu.getItems();

            System.out.println("=== " + selectedMenu.getCategoryName() + " 메뉴 ===");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
            System.out.println("0. 뒤로가기");

            System.out.println("메뉴를 선택하세요:");
            int itemChoice = scan.nextInt();

            if (itemChoice == 0) continue;
            if (itemChoice < 1 || itemChoice > items.size()) {
                System.out.println("존재하지 않는 메뉴입니다.");
                continue;
            }

            System.out.println("선택한 메뉴: " + items.get(itemChoice - 1));
        }
    }
}
