//3. Write a program which define class Product with data member as id, name and price. 
//Store the information of 5 products and display the name of product having minimum price 
//(Use array of object).

import java.util.*;

public class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("\nProduct Id: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

    public static void main(String args[]) {
        Product[] pro = new Product[5];
        
        pro[0] = new Product(1, "Product 1", 10.0);
        pro[1] = new Product(2, "Product 2", 15.0);
        pro[2] = new Product(3, "Product 3", 5.0);
        pro[3] = new Product(4, "Product 4", 20.0);
        pro[4] = new Product(5, "Product 5", 8.0);
        System.out.println("\nProduct Details:");
        for(int i=0;i<pro.length;i++)
       {
        pro[i].display();
        }


        // Find the product with the minimum price
		Product LowestPriceProduct=pro[0];
	for(int i=1;i<5;i++)
	 {
		if(pro[i].price<LowestPriceProduct.price)
		{
			LowestPriceProduct=pro[i];
		}
	}
	System.out.println("\n The Product With Lowest Price : "+LowestPriceProduct.name);
	}
    }


