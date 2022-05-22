public class Guitar extends Instrument implements IPlay, ISell {
    private int numOfStrings;
    private String make;

    public Guitar(int costPrice, int salePrice, int numOfStrings, String make) {
        super(instrumentType.GUITAR, costPrice, salePrice);
        this.numOfStrings = numOfStrings;
        this.make = make;
    }

    public String play(){
        return "twang thrumm";
    }

    public int calculateMarkup() {
        return getSalePrice() - getCostPrice();
    }
}
