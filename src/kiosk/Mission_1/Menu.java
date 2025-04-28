package kiosk.Mission_1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 속성
    private String categoryName;
    private List<MenuItem> items;

    // 생성자
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    // 기능
    public void addItem(MenuItem item) {
        items.add(item);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
