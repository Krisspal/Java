import java.util.Scanner;
public class Main{
	public static void main(String []args) {
		String email;
		System.out.print("Enter your mail: ");
		Scanner input = new Scanner(System.in);
		email = input.nextLine();
		int index = email.indexOf('@');
		System.out.println(email.substring(0, index));
	}
}
