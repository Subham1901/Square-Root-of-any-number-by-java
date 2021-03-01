@author Subham
/* here i have mentioned that how to print square root of any number b using Math class*/
import java.util.Scanner;
public class MathFunction{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		double sqrt=Math.sqrt(n);
		System.out.println("square root of " +n+ " is " +sqrt);
	}
}
