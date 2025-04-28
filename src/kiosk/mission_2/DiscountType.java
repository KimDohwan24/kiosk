package kiosk.mission_2;

public enum DiscountType {
    NATIONAL(10),  // 국가유공자 10% 할인
    SOLDIER(5),    // 군인 5% 할인
    STUDENT(3),    // 학생 3% 할인
    GENERAL(0);    // 일반 0% 할인

    private final int discountPercent;

    DiscountType(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public static DiscountType fromNumber(int number) {
        switch (number) {
            case 1: return NATIONAL;
            case 2: return SOLDIER;
            case 3: return STUDENT;
            case 4: return GENERAL;
            default: return GENERAL; // 기본 값은 일반
        }
    }
}
