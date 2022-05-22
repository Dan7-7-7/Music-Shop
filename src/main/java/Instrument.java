public class Instrument {
    private instrumentType type;
    private int costPrice;
    private int salePrice;

    public Instrument(instrumentType type, int costPrice, int salePrice) {
        this.type = type;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }
}
