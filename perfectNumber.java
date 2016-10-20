
import java.util.Scanner;
public class perfectNumber {
	public static void main(String[] args){
		int DoYouWantToStop = 0;
		long kindOfCheck;
		long FirstNum;
		long SecondNum;
		boolean IsEnded = false;
		Scanner scan = new Scanner(System.in);
	
		while (IsEnded == false) {
			System.out.println("What kind of check do you want?");
			System.out.println("0 = Checking if a number is perfect" );
			System.out.println("1 = Checking what numbers in a range are perfect");
			kindOfCheck = scan.nextLong();
			if(kindOfCheck == 0){
				System.out.println("what number do you want to check?");
				long num = scan.nextLong();
				if (IsPerfectNumber(num)) {
					System.out.println(num + " is perfect");
				}
				else{
					System.out.println(num + " isn't perfect");
				}
			}
			else{
				System.out.println("what is the first number in your range?");
				FirstNum =  scan.nextInt();
				System.out.println("what is the last number in your range?");
				SecondNum = scan.nextInt();
				RangeClaculator(FirstNum , SecondNum);
			}
			
			System.out.println("Do you want to exit?");
			System.out.println("1 = yes");
			System.out.println("0 = no");
			
			DoYouWantToStop = scan.nextInt();
			if (DoYouWantToStop == 1) {
				IsEnded = true;
				System.out.println("The perfect number calculator has stopped");
				
			}
			
			}
		
		

	
	}

	
	public static boolean IsPerfectNumber(long num){
		
		long Sum = 0;
		
		for(long i = num / 2; i >= 1; i --){
			if (num % i  == 0) {
				Sum  = Sum + i;
				
			}
		}
		 if(Sum == num) {
			 return true;
		 }
			 else {
				 return false;
			 }
		 
		
	}
	
	public static void RangeClaculator(long FirstNum , long SecondNum){
		for(long i = FirstNum; i <= SecondNum; i++){
			if(IsPerfectNumber(i))
			{
				System.out.println(i);
			}
		}
	}
}