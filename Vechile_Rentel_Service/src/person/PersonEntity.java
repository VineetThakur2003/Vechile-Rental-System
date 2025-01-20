package person;

	public class PersonEntity {
		private String CarName;
		private String Cityname;
		private int Phoneno;
		private int Personid;
		private int Model;
		private String Name;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getCityname() {
			return Cityname;
		}
		public void setCityname(String cityname) {
			Cityname = cityname;
		}
		public int getPhoneno() {
			return Phoneno;
		}
		public void setPhoneno(int phoneno) {
			Phoneno = phoneno;
		}
		public int getPersonid() {
			return Personid;
		}
		public void setPersonid(int personid) {
			Personid = personid;
		}
		public int getCarModel() {
			return Model;
		}
		public void setCarModel(int carModel) {
			Model = Model;
		}
		public String getCarName() {
			return Name;
		}
		public void setCarName(String carName) {
			CarName = CarName;
		}
		@Override
		public String toString() {
			return "PersonEntity [Name=" + Name + ", Cityname=" + Cityname + ", Phoneno=" + Phoneno + ", Personid="
					+ Personid + ", CarModel=" + Model + ", CarName=" + CarName + "]";
		}
		
		
		
		
		
		

	}



