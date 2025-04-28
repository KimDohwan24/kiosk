package kiosk.mission_2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    Scanner scan = new Scanner(System.in);
    List<Menu> menus;
    Basket basket;

    // 생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.basket = new Basket(); // 장바구니 생성
    }

    // 기능
    public void start() {
        while (true) {
            System.out.println("=====================");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.println("-1. 장바구니 보기");
            System.out.println("-2. 결제하기");
            System.out.println("=====================");
            System.out.println("카테고리를 골라주세요:");

            int categoryChoice;

            try {
                categoryChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다. 정수만 입력 가능합니다.");
                scan.nextLine(); // 잘못된 입력을 비워줌
                continue;
            }

            if (categoryChoice == 0) break;
            if (categoryChoice == -1) {
                basket.showItems();
                continue;
            }
            if (categoryChoice == -2) {
                basket.checkout();
                continue;
            }
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

            int itemChoice;
            try {
                itemChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다. 정수만 입력 가능합니다.");
                scan.nextLine();
                continue;
            }

            if (itemChoice == 0) continue;
            if (itemChoice < 1 || itemChoice > items.size()) {
                System.out.println("존재하지 않는 메뉴입니다.");
                continue;
            }

            System.out.println("선택한 메뉴: " + items.get(itemChoice - 1));
            System.out.println("장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인          2. 취소");
            try {
                int selectNum = scan.nextInt();

                if (selectNum == 1) {
                    basket.addItem(items.get(itemChoice - 1));
                } else if (selectNum == 2) {
                    System.out.println("취소하셨습니다.");
                } else System.out.println("제대로 된 값을 입력하세요");
            } catch (InputMismatchException e){
                System.out.println("잘못 입력했습니다.");
                scan.nextLine(); // 잘못된 입력을 비워줌
                continue;
            }
        }

        // 프로그램 종료되기 전에 장바구니 보여주기
        basket.showItems();
    }
}
