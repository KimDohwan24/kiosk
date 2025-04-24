package kiosk.lv_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        List<Menu> menus = new ArrayList<>();

        menus.add(new Menu("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menus.add(new Menu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menus.add(new Menu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menus.add(new Menu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        // Main의 List<Menu> menus를 Kiosk의 List<Menu> menus로 전달
        Kiosk kiosk = new Kiosk(menus);

        // Kiosk 시작
        kiosk.start();
    }
}
