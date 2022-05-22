public class GuitarStrings implements ISell {
    private int costPrice;
    private int SalePrice;

    public GuitarStrings(int costPrice, int salePrice) {
        this.costPrice = costPrice;
        SalePrice = salePrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSalePrice() {
        return SalePrice;
    }

    public int calculateMarkup() {
        return getSalePrice() - getCostPrice();
    }
}
