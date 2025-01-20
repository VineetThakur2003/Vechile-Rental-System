package person;

	import java.util.Scanner;

	public class CreatePerson extends PersonEntity {
		public static PersonEntity[] person;
		public void Createperson() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter person size in store");
			int size = sc.nextInt();
			person = new PersonEntity[size];
			for(int i=0; i<person.length; i++) {
				System.out.println("Enter Person id");
				int a = sc.nextInt();
				System.out.println("Enter Person Name");
				String x =sc.next();
				System.out.println("Enter Person Phno");
				int y = sc.nextInt();
				System.out.println("Enter Person Cityname");
				String d = sc.next();
				System.out.println("Stored Successfully");
				
				PersonEntity p = new PersonEntity();
				p.setCityname(d);
				p.setName(x);
				p.setPersonid(i);
				p.setPhoneno(y);
				person[i]=p;
				
				
			}
			
		}

	}


