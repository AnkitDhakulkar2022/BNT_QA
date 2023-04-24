package Rupesh_23;

public class ReturnMonth {

	String date(String date1){
		
		String str = date1;
		String[] a = str.split("-");
		String cc = a[1];
		System.out.println("month is"+cc);
		return cc;
	}
	public static void main(String[] args) {
		ReturnMonth rm = new ReturnMonth();
		rm.date("23-07-2009");
	}
	
}
