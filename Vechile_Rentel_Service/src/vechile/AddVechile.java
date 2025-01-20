package vechile;

import java.util.Scanner;



public class AddVechile {
	public static VechileEntity[] arr;
	public void AddVechile() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many cars");
		int size = sc.nextInt();
		arr = new VechileEntity[size];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Vechile color");
			String a = sc.next();
			System.out.println("Enter Vechile Name");
			String x =sc.next();
			System.out.println("Enter Vechile Rate");
			int y = sc.nextInt();
			System.out.println("Enter Vechile Model");
			int d = sc.nextInt();
			
			VechileEntity o = new VechileEntity();
			o.setColor(a);
			o.setModel(d);
			o.setName(x);
			o.setRate(y);
			arr[i]=o;
			
		}
	}

}



