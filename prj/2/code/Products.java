package dushajProj2final;

import java.util.ArrayList;
import java.util.List;

public class Products {
	//Products is a list of products
	private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initializeStoreItems();
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
  
    
    
    //Initialize store items allows new products to be added into an ArrayList
    public void initializeStoreItems() {
        String [] productNames = {"Dove Soap", "Ritz Crackers", "Gatorade", "Powerade", "Lays Chips", "Doritos", "Bread", "Milk (1/2) Gallon"
        		, "Cereal", "Banana", "Apple", "Orange Milk", "Strawberry Poptarts", "Wonderbread", "Mayo", "Ribeye Steak 16oz"};
        Double [] productPrices = {5.00d, 9.00d, 3.00d, 3.00d, 1.00d, 1.00d, 6.00d, 7.00d, 10.00d, 1.00d, 1.75d, 6.00d, 4.50d, 3.00d
        		, 4.00d, 40.00d};
        Integer [] productStocks = {7, 6, 8, 1, 8, 12, 14, 19, 22, 11, 30, 25, 9, 18, 40, 5};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrices[i],productStocks[i])); 
        }

        

    }

}
	


