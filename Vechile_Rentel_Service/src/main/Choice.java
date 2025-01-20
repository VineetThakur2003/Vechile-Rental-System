package main;

	import java.util.Scanner;

import payment.DisplayPayment;
import payment.PaymentMode;
import person.CreatePerson;
import person.DisplayPerson;
import vechile.AddVechile;
import vechile.DisplayVechile;


	public class Choice {
		public void UserChoice() {
			
			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Choose any option");
				System.out.println("Enter 1 for Rent Vechile ");
				System.out.println("Enter 2 for Person deatils");
				System.out.println("Enter 3 for Vechile records");
				System.out.println("Enter 4 for Exit ");
				int choice = sc.nextInt();
				
				if(choice==1) {
					while(true) {
						System.out.println("Enter 1 for payment Mode");
						System.out.println("Enter 2 for Display payment");
						System.out.println("Enter 3 for back to Menu");
						int n = sc.nextInt();
						if(n==1) {
							PaymentMode a = new PaymentMode();
							a.Createperson();
							
						}
						else if(n==2) {
							DisplayPayment m = new DisplayPayment();
							m.Display();
						}
						else if(n==3) {
							System.out.println("Back to Menu");
							break;
							
						}
						else {
							System.out.println("!! Invaild Choice !!");
						}
					}
					
					
				}
				else if(choice==2) {
					while(true) {
						System.out.println("Enter 1 for Create person");
						System.out.println("Enter 2 for Display person");
						System.out.println("Enter 3 for back to menu");
						
						int c = sc.nextInt();
						if(c==1) {
							CreatePerson j = new CreatePerson();
							j.Createperson();
						}
						else if(c==2) {
							DisplayPerson j = new DisplayPerson();
							j.Display();
						}
						else if(c==3) {
							System.out.println("Back to menu");
							break;
						}
						else {
							System.out.println("!! ");
						}
					}
					
					
				}
				else if(choice==3) {
					while(true) {
						System.out.println("Enter 1 for Add Vechile");
						System.out.println("Enter 2 for Display Vechile");
						System.out.println("Enter 3 for Back to menu");
						int d = sc.nextInt();
						if(d==1) {
							AddVechile x = new AddVechile();
							x.AddVechile();
						    
						}
						else if(d==2) {
							DisplayVechile a = new DisplayVechile();
							a.Display();
						}
						else if(d==3) {
							System.out.println("Back to Menu");
							break;
						}
						else {
							System.out.println("!! Invaild choice !!");
						}
					}
					
				}
				else if(choice==4) {
					System.out.println("!! Exit successfully !!");
					break;
				}
				else{
					System.out.println("Invaild choice");
					
				}
			}
		}
		
		

	}



