import java.util.Scanner;
public class Main{
	public static void main(String []args) {
		int n, count = 0;
		int result = (int ) (Math.random() * 100 + 1);
		do {
			count ++;
			System.out.print("Enter your answer (1 - 100): ");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			if (n > result) {
				System.out.println("Your answer is greater than the result");
			}
			else if (n < result) {
				System.out.println("Your answer is smaller than the result");
			}
			else {
				System.out.println("You're correct!");
				break;
				}
			}while (n != result);
		System.out.println("Times: " + count);
	}
}
