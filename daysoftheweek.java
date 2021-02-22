package homework4;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		int day;
		Scanner entrance= new Scanner(System.in);
		System.out.print("Insert number of the week days");
		day= entrance.nextInt();
		switch(day) {
		case 1:
			System.out.print("The day is Monday");
			break;
		case 2:
			System.out.print("The day is Tuesday");
			break;
		case 3:
			System.out.print("The day is Wednesday");
			break;
		case 4:
			System.out.print("The day is Thursday");
			break;
		case 5:
			System.out.print("The day is Friday");
			break;
		case 6:
			System.out.print("The day is Saturday");
			break;
		case 7:
			System.out.print("The day is Sunday");
			break;
			default:System.out.print("The number of the day is not a day of the week");
			break;
		}
		

	}

}
