package pepcoding_oops;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product[] products = new Product[5];
    
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<5; i++)
        {
            int productId = sc.nextInt(); sc.nextLine();
            String productName = sc.nextLine();
            int qty = sc.nextInt(); 
            int price = sc.nextInt(); 

            products[i] = new Product(productId, productName, qty, price);
        }    
        
        
        int totalCartPrice = calculateTotalCartPrice(products);
        System.out.println("Total Cart Price : " + totalCartPrice);

        System.out.println("\n");
        
        Product[] productsWithDescendingPrice = arrangeProductsByPriceDescending(products);
        System.out.println("---- PRODUCTS WITH DESCENDING PRICE ----");
        for (Product p : productsWithDescendingPrice) {
            System.out.println(p.getProductName() + " \t\t: " + p.getPrice());
        }
    }
    
    //implement business methods here
   public static int calculateTotalCartPrice(Product[] products)
   {
       int totalPrice=0;
       for(Product p:products)
       {
           totalPrice=totalPrice+p.getPrice();
       }
       return totalPrice;
   }
   
   public static Product[] arrangeProductsByPriceDescending(Product[] products)
   {
        for(int i=1;i<products.length;i++)
        {
            for(int j=0;j<products.length-i;j++)
            {
                if(products[j+1].getPrice()>products[j].getPrice())
                {
                    // swap
                    Product temp=products[j+1];
                    products[j+1]=products[j];
                    products[j]=temp;
                }
            }
        }
       return products;
   }

}

class Product
{
  private int productId, qty, price;
   private String productName;
    public Product(int productId,String productName,int qty,int price)
    {
        this.productId=productId;
        this.productName=productName;
        this.qty=qty;
        this.price=price;
    }
    
    public int getProductId()
    {
        return this.productId;
    }
    public String getProductName()
    {
        return this.productName;
    }
    public int getProductQty()
    {
        return this.qty;
    }
    public int getPrice()
    {
        return this.price;
    }
    
    public void setProductId(int productId)
    {
        this.productId=productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
     public void setProductQty(int qty)
    {
        this.qty=qty;
    }
    
    public void setProductPrice(int price)
    {
        this.price=price;
    }
    
    
    
}

