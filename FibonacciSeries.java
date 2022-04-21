package week1.day1.assignments;

public class FibonacciSeries {
	//To find Fibonacci Series for a given range
public static void main(String[] args) {
	int r = 8, firstNum = 0, secNum = 1, sum;
	for (int i = 1; i <= r; i++) {
		System.out.println(firstNum);
		sum = firstNum + secNum;
		firstNum = secNum;
		secNum = sum;
}
} 
}