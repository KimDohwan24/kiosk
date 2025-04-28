package kiosk.mission_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 전체 총괄 List
        List<Menu> menus = new ArrayList<>();

        // 버거 메뉴 List
        Menu burgerMenu = new Menu("Burger");
        burgerMenu.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 메뉴 List
        Menu drinkMenu = new Menu("Drink");
        drinkMenu.addItem(new MenuItem("Coke", 0.3, "시원한 콜라"));
        drinkMenu.addItem(new MenuItem("Sprite", 0.3, "짜릿한 사이다"));
        drinkMenu.addItem(new MenuItem("Fanta", 0.3, "오렌지 환타"));
        drinkMenu.addItem(new MenuItem("Water", 0.1, "물"));

        // 디저트 메뉴 List
        Menu DessertsMenu = new Menu("Desserts");
        DessertsMenu.addItem(new MenuItem("Cake", 0.6, "달콤한 초코 케이크"));
        DessertsMenu.addItem(new MenuItem("Icecream", 0.7, "바닐라 아이스크림"));
        DessertsMenu.addItem(new MenuItem("Bread", 0.4, "모닝빵"));

        // 전체 List에 추가
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(DessertsMenu);

        // Kiosk 실행
        Kiosk kiosk = new Kiosk(menus);
        Basket basket = new Basket();

        kiosk.start();
    }
}
