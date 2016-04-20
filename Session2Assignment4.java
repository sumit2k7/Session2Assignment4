import java.util.Scanner;
public class Session2Assignment4 {
	public static void main (String args[])
	{
		int iMonth;
		System.out.println("Please Enter the Number of Month ");
		Scanner sc=new Scanner(System.in);
		iMonth=sc.nextInt();
		sc.close();
		
		switch (iMonth)
		{
			case  1 :
			System.out.println("First Month is January and Has 31 Days");
			break;
			case  2 :
				System.out.println("Second Month is February and Has 28 Days");
				break;
			case  3 :
				System.out.println("Third Month is March and Has 31 Days");
				break;
			case  4 :
				System.out.println("Fourth Month is April and Has 30 Days");
				break;
			case  5 :
				System.out.println("Fifth Month is May and Has 31 Days");
				break;
			case  6 :
				System.out.println("Sixth Month is June and Has 30 Days");
				break;
			case  7 :
				System.out.println("Seventh Month is July and Has 31 Days");
				break;
			case  8 :
				System.out.println("Eighth Month is August and Has 31 Days");
				break;
			case  9 :
				System.out.println("Ninth Month is September and Has 30 Days");
				break;
			case  10 :
				System.out.println("Tenth  Month is October and Has 31 Days");
				break;
			case  11 :
				System.out.println("Eleventh Month is November and Has 30 Days");
				break;
			case  12 :
				System.out.println("Twelth Month is December and Has 31 Days");
				break;
			default: 
				System.out.print("Please Enter correct Month Number");
		}}
	
}
