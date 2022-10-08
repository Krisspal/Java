import java.util.Scanner;
public class Main{
	public static void main(String []args) {
		int n, count = 0;
		int result = (int ) (Math.random() * 100 + 1);
		do {
			count ++;
			System.out.print("Nhap dap an cua ban (1 - 100): ");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			if (n > result) {
				System.out.println("Dap an cua ban lon hon ket qua");
			}
			else if (n < result) {
				System.out.println("Dap an cua ban nho hon ket qua");
			}
			else {
				System.out.println("Ban da tra loi dung!");
				break;
				}
			}while (n != result);
		System.out.println("So lan doan: " + count + " lan");
	}
}
