import java.util.Scanner;
enum days{Monday,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}

class GuessTheDay{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to guess the day");
	int n = sc.nextInt();
	switch(n%7){
	case 1:
		System.out.println(days.Monday);
		break;
	case 2:
		System.out.println(days.TUESDAY);
		break;
	case 3:
		System.out.println(days.WEDNESDAY);
		break;
	case 4:
		System.out.println(days.THURSDAY);
		break;
	case 5:
		System.out.println(days.FRIDAY);
		break;
	case 6:
		System.out.println(days.SATURDAY);
		break;
	case 7:
		System.out.println(days.SUNDAY);
		break;
	}
    }
}
	