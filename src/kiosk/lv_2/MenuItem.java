package kiosk.lv_2;


import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    // 속성
    private List<Menu> menuItems;

    // 생성자
    MenuItem() {
        this.menuItems = new ArrayList<>();
    }

    // 기능

    // add문 ( List<Menu>에 담기 )
    public void addList(Menu name, Menu price, Menu description) {
        menuItems.add(name);
        menuItems.add(price);
        menuItems.add(description);
    }

    // 출력
    public String printList(Menu menu) {
        return menu.getName() + " | " + "$ " + menu.getPrice() + " | " + menu.getDescription();
    }
}

