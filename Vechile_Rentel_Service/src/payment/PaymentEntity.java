package payment;


	public class PaymentEntity   {
		private String PaymentMode;
		private int Totalpayment;
		
		
		
		
		public String getPaymentMode() {
			return PaymentMode;
		}




		public void setPaymentMode(String paymentMode) {
			PaymentMode = paymentMode;
		}




		public int getTotalpayment() {
			return Totalpayment;
		}




		public void setTotalpayment(int totalpayment) {
			Totalpayment = totalpayment;
		}




		@Override
		public String toString() {
			return "PaymentEntity [PaymentMode=" + PaymentMode + ", Totalpayment=" + Totalpayment + "]";
		}
		
		
		

	}
	



