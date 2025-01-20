package payment;

	import java.util.Scanner;

	public class PaymentMode extends PaymentEntity {
		public static PaymentEntity[] person;
		public void Createperson() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter payment number of custmor");
			int size = sc.nextInt();
			person = new PaymentEntity[size];
			for(int i=0; i<person.length; i++) {
				System.out.println("Enter payment Mode:");
				String a = sc.next();
				System.out.println("Enter Total payment vechile:");
				int x =sc.nextInt();
				
				
				PaymentEntity p = new PaymentEntity();
				p.setPaymentMode(a);
				p.setTotalpayment(x);
				
				person[i]=p;
				
				
			}
			
		}

	}



	