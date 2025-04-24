package kiosk.lv_2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MenuItem menuItem = new MenuItem();
        List<Menu> menus = new ArrayList<>();

        menus.add(new Menu("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menus.add(new Menu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menus.add(new Menu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menus.add(new Menu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        while (true) {
            // 메뉴판
            System.out.println("=====================");
            System.out.println("1. burger            ");
            System.out.println("=====================");
            System.out.println("메뉴를 골라주세요.");
            int choiceMenu = scan.nextInt();

            // 메뉴판 -> 음식 종류 출력
            if (choiceMenu == 1) {
                for (Menu a : menus) {
                    System.out.println(menus.indexOf(a) + 1 + ". " + menuItem.printList(a));
                }
            } else return;

            // 선택한 음식 출력 후 종료
            System.out.println("무슨 음식을 고르시겠습니까?");
            int menuNum = scan.nextInt();

            if (menuNum >= 1 && menuNum <= menus.size()) {
                System.out.println(menuItem.printList(menus.get(menuNum - 1)));
            } else {
                System.out.println("존재하지 않는 메뉴 번호입니다.");
            }
//            break;
        }
    }
}
