package week1.day1.assignments;

public class PrimeNumber {
//To find whether a number is Prime or not
	public static void main(String[] args) {
		int n = 13;
				boolean flag=false;
				for (int i = 2;i <= n/2; i++)
				{
					if(n%i==0)
					{
						flag=true;
						break;
					}
					}
				if(!flag)
				{
					System.out.println(n + " is a Prime");
				}
				else
				{
					System.out.println(n + " is not a Prime");
					
				}
	

	}

}
