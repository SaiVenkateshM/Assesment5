package com.assesment5;


import com.assesment5.dao.*;
import com.assesment5.modal.*;
import com.assesment5.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDao dao = new ProductDao();
		Product product = new Product();
		product.setPrname("Chocolate");
		product.setDisc("this is tasty");
		product.setPrice(24);
		product.setQuantity(10);
		dao.addProduct(product);
	
	
	
	
	
    int option = 0;
    do {
           System.out.println("1.Add Products");
           System.out.println("2.Delete a product");
           System.out.println("3.Update Product");
           System.out.println("0.Exit");
           
           System.out.println("Select an option");
           Scanner sc = new Scanner(System.in);
           int choice = sc.nextInt();
           sc.nextLine();
           
           switch(choice) {
           case 1:
               System.out.println("Enter Product Name");
               String pName = sc.next();
               
               System.out.println("Enter Product Description");
               String pDesc = sc.next();
              
               System.out.println("Enter price");
               int price = sc.nextInt();
               sc.nextLine();
               System.out.println("Enter Quantity");
               int quan = sc.nextInt();
               Product p = new Product(pName,pDesc,price,quan);
               dao.addProduct(p);
               
                 break;
          
           case 2:
               System.out.println("Enter name of product to delete");
               String dName = sc.next();
               Product p1 = dao.findOne(dName);
               dao.deleteProduct(p1);

               
                 break;
           case 3:
               System.out.println("Enter name of the product to update");
               String uName = sc.next();
               Product p2 = dao.findOne(uName);
         
               System.out.println("Enter Product Name");
              p2.setName(sc.next()); 
               System.out.println("Enter Product Description");
               p2.setDescription(sc.next());
               System.out.println("Enter price");
               p2.setPrice(sc.nextInt());
               sc.nextLine();
               System.out.println("Enter Quantity");
               p2.setQuantity(sc.nextInt());
               dao.updateProduct(p2);

                 break;
           case 0:
                 option = -1;
                 break;
           }
           
    }while(option != -1);

}

	}


