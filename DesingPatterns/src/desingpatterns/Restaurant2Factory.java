package desingpatterns;

public class Restaurant2Factory extends RestaurantAbstractFactory {

    @Override
    public FastFood getFastfood(String type) {
        switch(type){
           case "pizza":return new Pizza();
           default:return null;
        }
    }

    @Override
    public Drink getDrink(String type) {
         switch(type){
            case "juice":return new Juice();
            case "beer":return new Beer();
            default:return null;
        }
    }
    
}
