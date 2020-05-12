package desingpatterns;

public class Restaurant {
    
    public static void main(String[] args) {
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        RestaurantAbstractFactory restaurantAbstractFactory;
        restaurantAbstractFactory = restaurantFactoryProducer.getRestaurantAbstractFactory(1);
        
        System.out.println(restaurantAbstractFactory.getDrink("beer") );
    }  
    
}
