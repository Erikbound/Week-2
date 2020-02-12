import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -45°F and 40°F: ");
		int temperature = input.nextInt();
		if ((temperature < -45) || (temperature > 40))
		{
			System.out.print("Invalid Input");
		}
		else
		{
			System.out.print("Enter the wind speed (at least 5 and no more than 60) in miles per hour: ");
			int windSpeed = input.nextInt();
			double windChillIndex = 35.74 + (0.6215 * (double) temperature) - (35.75 * (Math.pow(windSpeed,0.16))) + (0.4275 * temperature * (Math.pow(windSpeed,0.16)));
			System.out.print("The wind chill index is: " + windChillIndex + "\n");
			System.out.print("Programmer: Erik Umoh");
		}
	}

}
