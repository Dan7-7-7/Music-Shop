import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        stock.remove(item);
    }

    public int getStockCount(){
        return stock.size();
    }
}
