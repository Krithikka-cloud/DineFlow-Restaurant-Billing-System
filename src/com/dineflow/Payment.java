package com.dineflow;

import java.util.Scanner;

public class Payment {
	Scanner sc = new Scanner(System.in);

    public void paymentMethod() {

        
        System.out.println("--------------- PAYMENT ---------------"); 
        System.out.println("\nChoose a Payment Method:");
        System.out.println("1. Google Pay");
        System.out.println("2. PhonePe");
        System.out.println("3. Paytm");
        System.out.println("4. Amazon Pay");
        System.out.println("5. BHIM");
    }
    
    public void payChoice(int pay) {

          switch(pay) {

          case 1:
              System.out.println("Opening Google Pay...");
              break;

          case 2:
              System.out.println("Opening PhonePe...");
              break;

          case 3:
              System.out.println("Opening Paytm...");             
              break;

          case 4:
              System.out.println("Opening Amazon Pay...");             
              break;

          case 5:
              System.out.println("Opening BHIM...");             
              break;

          default:
              System.out.println("Invalid Payment Method");
          }
          System.out.print("\nEnter UPI PIN: ");
          int pin = sc.nextInt();

          System.out.println("\nPayment Processing...");

          try {
              Thread.sleep(3000); 
          }
          catch(Exception e) {
          }

          System.out.println("Payment Successful!");
    }
    
    public String payMethod(int pay) {
    	String paymentMethod = "";
    	switch(pay) {

        case 1:
        	return "Gogle Pay";
           
        case 2:
        	return "Phone Pe";

        case 3:
        	return "Paytm";           

        case 4:
        	return "Amazon Pay";             

        case 5:
        	return "BHIM";             

        default:
        	return "Invalid Payment Method";
        }
    }
}
