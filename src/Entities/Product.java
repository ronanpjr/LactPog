package Entities;

public interface Product {
     int quantity = 0;
     float price = 0;
     String name = "Product";

     void setQuantity(int quantity);
     void setPrice(float price);
     void setName(String name);
     int getQuantity();
     float getPrice();
     String getName();
     float getTotal();
}

