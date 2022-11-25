package model;

public class VendingMachine {

	
	   private final static String products[] = {"Coke", "Orange Juice", "Kitkat Chunky Bar", "Lay's Classic Chips" };
	  
	   
	   private int quantity[];
	   private String status;
	     
	   
	   public VendingMachine()
	   {
	       
	       quantity = new int[products.length];
	      
	       for(int i=0;i<quantity.length;i++)
	           quantity[i] = 0;
	       status = "Empty VM Started"; 
	   }
	  
	  
	   public String checkStatus()
	   {
	       return status;
	   }
	  
	   
	   public String checkStock()
	   {
	       String str = "Stock:";
	       
	       for(int i=0;i<products.length;i++)
	       {
	           str += " "+products[i]+" ("+quantity[i]+")";
	           if(i < products.length-1)
	               str += ",";
	       }
	      
	       return str;
	   }
	  
	   
	   public String checkStock(String items)
	   {
	      
	       for(int i=0;i<products.length;i++)
	       {
	           if(products[i].equals(items)) 
	               return products[i]+" ("+quantity[i]+")";
	       }
	      
	       return "Invalid product: "+items; 
	   }
	  
	   
	   public void add(String thing, int q)
	   {
	       
	       for(int i=0;i<products.length;i++)
	       {
	           if(products[i].equals(thing)) 
	           {
	               quantity[i] += q; 
	               status = "Product added: "+thing+" ("+q+")";
	               return;
	           }
	       }
	      
	       status = "Invalid product: "+thing; 
	   }
	  
	  
	   public void dispense(String item, int q)
	   {
	       
	       for(int i=0;i<products.length;i++)
	       {
	           if(products[i].equals(item)) 
	           {
	               quantity[i] -= q; 
	               status = "Product removed: "+item+" ("+q+")";
	               return;
	           }
	       }
	      
	       status = "Invalid product: "+item; 
	   }
	}

