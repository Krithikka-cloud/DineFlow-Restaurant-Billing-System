package com.dineflow;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========== DineFlow Restaurant ==========");
		
		System.out.print("\nEnter Customer Name: ");
		String custName = sc.nextLine(); 
		System.out.println();
		
		Restaurant r1 = new Restaurant();
		r1.restaurantList();
		
		System.out.print("\nEnter Choice: ");
		int choice = sc.nextInt();
		System.out.println();
		
		r1.restaurantChoice(choice);
		System.out.println();
		
		r1.menuItems(choice);
		
		ArrayList<CartItems> cart = new ArrayList<>();

		while(true) {

		    System.out.print("\nEnter Item ID (1-5) or 6 to Exit: ");
		    sc.nextLine();
		    int itemID = sc.nextInt();

		    if(itemID == 6) {
		        break;
		    }

		    MenuItem selectedItem = r1.getMenuItem(choice, itemID);

		    if(selectedItem == null) {
		        System.out.println("Invalid Item!");
		        continue;
		    }

		    System.out.print("\nEnter Quantity: ");
		    int qty = sc.nextInt();

		    System.out.println(selectedItem.getName() + " added to cart.");

		    cart.add(
		        new CartItems(
		            selectedItem.getName(),
		            qty,
		            selectedItem.getPrice()
		        )
		    );
		}
		
		System.out.println();
		System.out.println("--------------- CART SUMMARY ---------------");
		System.out.printf("%-20s %-8s %-10s %-10s%n",
		        "Item Name", "Qty", "Price", "Total");

		int subtotal = 0;

		for(CartItems item : cart) {

		    System.out.printf("%-20s %-8d %-10d %-10d%n",
		            item.getItemName(),
		            item.getQty(),
		            item.getPrice(),
		            item.getTotal());

		    subtotal += item.getTotal();
		}

		System.out.println("--------------------------------------------");
		System.out.println("Subtotal: Rs." + subtotal);
		System.out.println();
		
		double gst = subtotal * 0.05;

		System.out.println("GST 5%: Rs." + (int)gst);

		System.out.print("\nDo you have a coupon code? (yes/no): ");
		String answer = sc.next();
		System.out.println();


		int discount = 0;

		if(answer.equalsIgnoreCase("yes")) {

		    System.out.print("\nEnter coupon code:");
		    String coupon = sc.next();

		    if(coupon.equalsIgnoreCase("FOOD50")) {
		        discount = 50;
		        System.out.println("Coupon Applied: Rs.50 Discount");
		    }
		    else {
		        System.out.println("Invalid Coupon Code");
		    }
		}
		
		double finalAmount = subtotal + gst - discount;

		System.out.println("------------------------------");
		System.out.println("Subtotal : Rs." + subtotal);
		System.out.println("GST      : Rs." + (int)gst);
		System.out.println("Discount : Rs." + discount);
		System.out.println("------------------------------");
		System.out.println("Final Bill: Rs." + Math.round(finalAmount));
		
		System.out.println();
		Payment payMent = new Payment();
		payMent.paymentMethod();
		System.out.print("\nChoose a Payment Method: ");
		int pay = sc.nextInt();
		
		Payment p = new Payment();
		p.payChoice(pay);
		
		Restaurant res = new Restaurant();
		String resName = res.restaurantName(choice);
		
		System.out.println();
		System.out.println("=========================================");
		System.out.println("            ORDER RECEIPT");
		System.out.println("=========================================");

		System.out.println("Customer Name : " + custName);
		System.out.println("Restaurant    : " + resName);

		System.out.println();

		for(CartItems item : cart) {

		    System.out.printf(
		        "%-20s x %-3d Rs.%d%n",
		        item.getItemName(),
		        item.getQty(),
		        item.getTotal()
		    );
		}
		
		Payment payee = new Payment();
		String paymentMethod = payee.payMethod(pay);

		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.printf("%-20s Rs.%d%n", "Subtotal", subtotal);
		System.out.printf("%-20s Rs.%f%n", "GST (5%)", gst);
		System.out.printf("%-20s Rs.%d%n", "Discount", discount);
		System.out.println("-----------------------------------------");
		System.out.printf("%-20s Rs.%f%n", "Final Amount", finalAmount);
		System.out.println("-----------------------------------------");

		System.out.println();
		System.out.println("Payment Method : " + paymentMethod);
		System.out.println("Status         : SUCCESS");

		System.out.println();

		String orderId = "ORD1001";
		String txnId = "TXN56789";

		System.out.println("Order ID       : " + orderId);
		System.out.println("Transaction ID : " + txnId);

		System.out.println();
		System.out.println("Thank You For Ordering!");
		System.out.println("=========================================");
	}

}
