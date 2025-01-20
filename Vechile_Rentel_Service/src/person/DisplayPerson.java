package person;

	import java.util.Arrays;



	public class DisplayPerson {
		public void Display() {
			if(CreatePerson.person==null) {
				System.out.println("No person register");
			}else {
				for(int i=0; i<CreatePerson.person.length; i++) {
					System.out.println(CreatePerson.person[i]);
			
				}
			
		}

		}
	}



