package dushajProj2final;

import java.util.Objects;

public class Product {
	
	private String productName;
	private double productPrice;
	private int productID;
	private int productStock;
	
	//Constructors for Product
	Product(){}
	Product(int productID, String productName, double productPrice, int productStock){
		this.productID = productID;
		
		this.productName = productName;
		
		this.productPrice = productPrice;
		
		this.productStock = productStock;
		
		
		
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	@Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.productID);
        hash = 29 * hash + Objects.hashCode(this.productName);
        hash = 29 * hash + Objects.hashCode(this.productPrice);
        hash = 29 * hash + Objects.hashCode(this.productStock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.productID, other.productID)) {
            return false;
        }
        if (!Objects.equals(this.productPrice, other.productPrice)) {
            return false;
        }
        if (!Objects.equals(this.productStock, other.productStock)) {
            return false;
        }
        return true;
    }
	
	
	
	
}


