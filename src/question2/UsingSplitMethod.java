package question2;

public class UsingSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "100 Queen Street, Toronto, M5V 3E3";
		
		String[] address = str.split(",");
		
		String streetAddress = address[0];
		System.out.println("Street address : " + streetAddress);
		
		String city = address[1];
		System.out.println("City :	 " + city);
		
		String zip = address[2];
		System.out.println("Zip :	 " + zip);

		
	}

}
