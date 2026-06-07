package com.dineflow;

public class Restaurant {
	public void restaurantList() {
		System.out.println("Choose Restaurant:");
		System.out.println("1. A2B (Adyar Ananda Bhavan)");
		System.out.println("2. KFC");
		System.out.println("3. Pizza Hut");
	}
	
	public void restaurantChoice(int choice) {
		switch(choice) {
		case 1:{
			System.out.println("You selected: A2B (Adyar Ananda Bhavan)");
		    break;
		}
		case 2:{
			System.out.println("You selected: KFC");
			break;
		}
		case 3:{
			System.out.println("You selected: Pizza Hut");
			break;
		}
		default:{
			System.out.println("Invalid Restaurant");
			break;
		}
		}
	}
	
	 public String restaurantName(int choice) {
	    	String restName = "";
	    	switch(choice) {

	        case 1:
	        	return "A2B";
	           
	        case 2:
	        	return "KFC";

	        case 3:
	        	return "Pizza Hut";                     

	        default:
	        	return "Invalid Restaurant Name";
	        }
	    }
	
	public void menuItems(int choice) {
		switch(choice) {
		case 1:{
			MenuItem[] a2bMenu = {
					new MenuItem(1, "Masala Dosa", 120),
					new MenuItem(2, "Mini Meal", 180),
				    new MenuItem(3, "Pongal", 90),
				    new MenuItem(4, "Poori Set", 100),
				    new MenuItem(5, "Filter Coffee", 40)
			};
			System.out.println("---------------- MENU ----------------");
			System.out.printf("%-5s %-20s %-10s%n","ID","Item Name","Price");
			for(MenuItem item : a2bMenu) {
				System.out.printf("%-5d %-20s Rs.%-10d%n",
						item.getId(),
				        item.getName(),
				        item.getPrice()
				);
			}
			System.out.println("--------------------------------------");
			
			break;
		}
		
		case 2:{
			MenuItem[] kfcMenu = {
					new MenuItem(1, "Bucket Chicken", 499),
					new MenuItem(2, "Zinger Burger", 199),
				    new MenuItem(3, "French Fries", 99),
				    new MenuItem(4, "Chicken Popcorn", 179),
				    new MenuItem(5, "Pepsi", 50)
			};
			System.out.println("---------------- MENU ----------------");
			System.out.printf("%-5s %-20s %-10s%n","ID","Item Name","Price");
			for(MenuItem item : kfcMenu) {
				System.out.printf("%-5d %-20s Rs.%-10d%n",
						item.getId(),
				        item.getName(),
				        item.getPrice()
				);
			}
			System.out.println("--------------------------------------");
			
			break;
		}
		
		case 3:{
			MenuItem[] pizzaHutMenu = {
					new MenuItem(1, "Margherita Pizza", 199),
					new MenuItem(2, "Veg Supreme Pizza", 299),
				    new MenuItem(3, "Garlic Bread", 129),
				    new MenuItem(4, "Choco Lava Cake", 109),
				    new MenuItem(5, "Coke", 50)
			};
			System.out.println("---------------- MENU ----------------");
			System.out.printf("%-5s %-20s %-10s%n","ID","Item Name","Price");
			
			for(MenuItem item : pizzaHutMenu) {
				System.out.printf("%-5d %-20s Rs.%-10d%n",
						item.getId(),
				        item.getName(),
				        item.getPrice()
				);
			}
			System.out.println("--------------------------------------");
			break;
		}
		}
	}
	
	public MenuItem getMenuItem(int choice, int itemID) {
		MenuItem[] selectedMenu = null;
		switch(choice) {
		case 1:{
			selectedMenu = new MenuItem[] {
		            new MenuItem(1, "Masala Dosa", 120),
		            new MenuItem(2, "Mini Meal", 180),
		            new MenuItem(3, "Pongal", 90),
		            new MenuItem(4, "Poori Set", 100),
		            new MenuItem(5, "Filter Coffee", 40)
		        };
		        break;
		}
		
		 case 2:
		        selectedMenu = new MenuItem[] {
		            new MenuItem(1, "Bucket Chicken", 499),
		            new MenuItem(2, "Zinger Burger", 199),
		            new MenuItem(3, "French Fries", 99),
		            new MenuItem(4, "Chicken Popcorn", 179),
		            new MenuItem(5, "Pepsi", 50)
		        };
		        break;

		    case 3:
		        selectedMenu = new MenuItem[] {
		            new MenuItem(1, "Margherita Pizza", 199),
		            new MenuItem(2, "Veg Supreme Pizza", 299),
		            new MenuItem(3, "Garlic Bread", 129),
		            new MenuItem(4, "Choco Lava Cake", 109),
		            new MenuItem(5, "Coke", 50)
		        };
		        break;
		    }

		    for(MenuItem item : selectedMenu) {

		        if(item.getId() == itemID) {
		            return item;
		        }
		    }

		    return null;
		}
	}

	
	
	

