package enums;

public enum Enums {

    DOLLAR(84.93),
    EURO(89.25),
    RUB(1.35),
    POUND(103.76);

    public final double currency;

    Enums(double currency) {
        this.currency = currency;
    }

}
