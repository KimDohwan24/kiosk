package kiosk.lv_3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    Scanner scan = new Scanner(System.in);
    List<Menu> menus = new ArrayList<>();
    MenuItem menuItem = new MenuItem();

    // 생성자
    Kiosk(List<Menu> menus) {
        this.menus = menus;
    }


    // 기능

    // getList
//    public void getList(List<Menu> menus){
//        this.menus = menus;
//    }

    // 시작
    public void start() {
        while (true) {
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
            System.out.println("0. 종료");

            // 선택한 음식 출력 후 종료
            System.out.println("무슨 음식을 고르시겠습니까?");
            int menuNum = scan.nextInt();

            if(menuNum == 0){
                break;
            }

            if (menuNum >= 1 && menuNum <= menus.size()) {
                System.out.println(menuItem.printList(menus.get(menuNum - 1)));
            } else System.out.println("존재하지 않는 메뉴 번호입니다.");
        }
    }
}
