package vechile;

	public class VechileEntity {
		private String color;
		private int Model;
		private int Rate;
		private String Name;
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getModel() {
			return Model;
		}
		public void setModel(int Model) {
			this.Model = Model;
		}
		public int getRate() {
			return Rate;
		}
		public void setRate(int rate) {
			Rate = rate;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		@Override
		public String toString() {
			return "VechileEntity [color=" + color + ", Model=" + Model + ", Rate=" + Rate + ", Name=" + Name + "]";
		}
		

		
	}



