public class Piano extends Instrument implements IPlay, ISell {
    private int numOfPedals;
    private String style;

    public Piano(int costPrice, int salePrice, int numOfPedals, String style) {
        super(instrumentType.KEYBOARD, costPrice, salePrice);
        this.numOfPedals = numOfPedals;
        this.style = style;
    }

    public String play(){
        return "tinkle tinkle";
    }

    public int calculateMarkup() {
        return getSalePrice() - getCostPrice();
    }
}
