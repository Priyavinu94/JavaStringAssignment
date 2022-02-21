/* Part1 : Create a String array which stores names of cities using initialization block. 
 * Part2 : Add code to take a city name as input and search that city name is array created. If
 *         a match is found, then print “City name found” else print “City not found in the list”
 * Part 3: Replace a city which starts with ‘T’with new city name. New city name = “Mississauga”
 */
package question1;

import java.util.Scanner;

public class CityList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Part 1 : Creating array
		String[] cityList = { "Brampton", "Toronto", "Hamilton", "London", "Ottawa", "Vaughan", "Burlington" };

		// Part 2 : Asking user to enter a city name to search in the list
		System.out.println("Enter the city name that you want to search");
		String searchCity = scanner.next();
		boolean isCityInList = false;
		System.out.print("Checks if the city " + searchCity + " is in the citylist :  ");
		for (String city : cityList) {
			if (city.equalsIgnoreCase(searchCity)) {
				isCityInList = true;
				break;
			}
		}
		System.out.println(isCityInList ? "City name found\n" : "City not found in the list\n");

		// Part 3 : Replace cityname starting with T with "Mississauga"
		for (int i = 0; i < cityList.length; i++) {
			if (cityList[i].startsWith("T")) {
				cityList[i] = cityList[i].replaceAll(cityList[i], "Mississauga");
				break;
			}
		}

		System.out.println("New List of Cities are : ");
		for (String city : cityList) {
			System.out.print(city + "  ");
		}
		
		scanner.close();
	}

}
