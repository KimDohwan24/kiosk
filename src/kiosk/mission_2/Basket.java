package kiosk.mission_2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    // 속성
    private List<MenuItem> items;

    // 생성자
    public Basket() {
        this.items = new ArrayList<>();
    }

    // 기능
    // 장바구니에 아이템 추가
    public void addItem(MenuItem item) {
        items.add(item);
        System.out.println(item + " 을(를) 장바구니에 추가했습니다.");
    }

    // 장바구니에 담긴 아이템 보여주기
    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        System.out.println("=== 장바구니 목록 ===");
        items.stream()
                .map(items -> " - " + items.getName() + " : " + items.getPrice() + "원")
                .forEach(System.out::println);
//        for (MenuItem item : items) {
//            System.out.println("- " + item.getName() + ": " + item.getPrice() + "원");
//        }
        System.out.println("총 금액: " + getTotalPrice() + "원");
    }

    // 총 가격 계산
    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();
//        for (MenuItem item : items) {
//            total += item.getPrice();
//        }
    }

    // 장바구니 비우기
    public void clear() {
        items.clear();
        System.out.println("장바구니를 비웠습니다.");
    }

    // 결제하기
    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다. 결제할 수 없습니다.");
            return;
        }

        System.out.println("=== 결제 내역 ===");
        showItems();
        clear(); // 결제 후 장바구니 비우기
    }

    public List<MenuItem> getItems() {
        return items;
    }


}
