package com.learning.core.day3session1;
public class Product {
    private String productId;
    private String productName;
 
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
 
    public String getProductId() {
        return productId;
    }
 
    public String getProductName() {
        return productName;
    }
 
    @Override
    public int hashCode() {
        return productId.hashCode();
    }
@Override
public String toString() {
	   return "ProductID: " + productId + ", ProductName: " + productName ;
}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return productId.equals(other.productId);
    }
}