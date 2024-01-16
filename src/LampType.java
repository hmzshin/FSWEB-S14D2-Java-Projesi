public enum LampType {

    ARCHED(100),
    CLUB(120),
    DOWNBRIDGE(90),
    PHARMACY(110),
    ;

    private int price;

    LampType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
