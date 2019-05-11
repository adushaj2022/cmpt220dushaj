package dushajProj2final;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
 
	 List<Product> cartItems = new ArrayList<Product>();
//add item	    
	    public void addProductToCartByProductID(int productID) {
	        Product product = getProductByProductID(productID);
	        addToCart(product);
	    }
// get product ID, to then remove or add
	    private Product getProductByProductID(int productID) {
	        Product product = null;
	        List<Product> products = new Products().getProducts();
	        for (Product prod: products) {
	            if (prod.getProductID() == productID) {
	                product = prod;
	                break;
	            }
	        }
	        return product;
	    }
//add item (array list method 'add')
	    private void addToCart(Product product) {
	        cartItems.add(product);
	   
	    }
//remove item (array list method 'remove')
	    public void removeProductByProductID(int productID) {
	        Product prod = getProductByProductID(productID);
	        removeFromCart(prod);
	    }
	    
	    private void removeFromCart(Product product) {
	    	cartItems.remove(product);
	    }
	    
	    public int totalPrice() {
	    	int sum = 0;
	    	for (int k = 0; k < cartItems.size(); k++) {
	    		sum += cartItems.get(k).getProductPrice();
	    	}
	    	return sum;
	    }
	    
	    public int getTotalItemCount() {
	    	return cartItems.size();
	    }
	    
	    public String getMostExpensiveItem() {
	    	double min = 1000;
	    	int index1 = 0;
	    	for (int j = 0; j < cartItems.size(); j++) {
	    		if (cartItems.get(j).getProductPrice() < min) {
	    			min = cartItems.get(j).getProductPrice();
	    			index1 = j;
	    		}
	    		
	    	}
	    	return "Most Expensive: " + cartItems.get(index1);
	    }
	    

		//The cart will be printed, with all its contents
	    void printCartItems() {
	    	int i = 1;
	        for (Product prod: cartItems) {
	            System.out.println("Item #:  " + i + " " + prod.getProductName());
	            i++; 
	        }
	      
	    }
	    
	    
	}


