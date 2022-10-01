import java.util.Scanner;
public class Main{
	public static void main(String []args) {
		int count = 0;
		String str;
		System.out.print("Enter string: ");
		Scanner input = new Scanner(System.in);
		str = input.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				count++;
			}
			else {
				continue;
			}
		}
		System.out.println("Number of uppercase letter in string is: " + count);
	}
}
