package vechile;

public class DisplayVechile {
	public void Display() {
		if(AddVechile.arr==null) {
			System.out.println("No vechile Available");
		}else {
			for(int i=0; i<AddVechile.arr.length; i++) {
				System.out.println(AddVechile.arr[i]);
		
			}
			
		}
	}

}


