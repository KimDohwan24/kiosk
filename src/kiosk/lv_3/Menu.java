package kiosk.lv_3;

public class Menu {
    // 속성
    private String name;
    private double price;
    private String description;


    // 생생자
    Menu(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 기능
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getDescription(){
        return this.description;
    }


}
