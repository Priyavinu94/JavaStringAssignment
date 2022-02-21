/* Given a string,  String str = "100 queen street,Toronto,M5V 3E3 "; 
 * Extract following words and store in 3 different variables as shown below:
 *	String streetAddress = "100 queen street";
 *	String city = "Toronto";
 *	String zip = "M5V 3E3";
 */
package question2;

public class StringExtract {

	public static void main(String[] args) {


		String str = "100 Queen Street, Toronto, M5V 3E3";
		
		String streetAddress = str.substring(0, str.indexOf(","));
		System.out.println("Street address : " + streetAddress);
		
		String city = str.substring(str.indexOf("T"), str.lastIndexOf(","));
		System.out.println("City : 	" + city);
		
		String zip = str.substring(str.lastIndexOf("M"));
		System.out.println("Zip : 	" + zip);

	}

}
