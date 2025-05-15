package payment;

	//import com.person.Createperson;

	public class DisplayPayment {
		public void Display() {
			if(PaymentMode.person==null) {
				System.out.println("No payment submited");
			}else {
				for(int i=0; i<PaymentMode.person.length; i++) {
					System.out.println(PaymentMode.person[i]);

		}
			}
		}
		}
	                          


