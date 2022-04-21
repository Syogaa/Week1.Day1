package week1.day1.assignments;

public class Factorial {
	//To find the Factorial of a given number
	public static void main(String[] args) {
		int n = 5, fact = 1;
				
				for (int i = 1; i <= n; i++) 
		{
			fact = fact * i;
		}
		System.out.println(fact);
		}

}
