package dushajProj2final;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	ShoppingCart cart = new ShoppingCart();
    private int userNum = 0;
    int itemCount = 0;
    
    public UserInterface() {
        menu();
    }
    
    public void startScreen () {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Products in Shopping Cart");
        System.out.println("0. Exit");
    }
    
    public void storeProductsMenu() {
        System.out.println("1. Add Item to Cart (by ID)");
        System.out.println("2. Remove Item From Cart (by ID");
        System.out.println("3. Item Count");
        System.out.println("4. Total Price of Items in Cart");
        System.out.println("0. Exit Program + '\n");
    }
    
    public void menu () {
        do {
            startScreen();
            getUserInput();
            
            switch (userNum) {
                case 1: 
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    choice1Inner();
                    
                    break;
                case 2:
                    showCart();
                    
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    
                    break;
            }
        } while (userNum != 0);
    }



	private void choice1Inner() {
        switch (userNum) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                
                break;
            case 3:
            	printItemCount();
            	
            	break;
            case 4:
            	total_Price();
            	
                break;
	

            default:
                
                break;
        }
    }



	private int getUserInput() throws NumberFormatException {
        Scanner input = new Scanner (System.in);
        userNum = Integer.parseInt(input.nextLine());
        return userNum;
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getProductID() + "- " +
                            prod.getProductName() + "  " + "Price: $" +
                            prod.getProductPrice() + "  " + "Stock: " +
                            prod.getProductStock()
            );
        }
    }

    private void addProductToCart() {
        int prodID = getUserInput();
        cart.addProductToCartByProductID(prodID);      
    }

    private void showCart() {
        cart.printCartItems();
    }


    private void removeProductFromCart() {
        int prodID = getUserInput();
        cart.removeProductByProductID(prodID);
       
    }
    
    private void printItemCount() {
    	
    	System.out.println("The total number of products in the Shopping Cart are: " + cart.getTotalItemCount() + "\n");
    }
    
    private void total_Price() {
    	System.out.println("Total Price of products in the Shopping Cart: " + "$"+cart.totalPrice());
    }
    
  

}
