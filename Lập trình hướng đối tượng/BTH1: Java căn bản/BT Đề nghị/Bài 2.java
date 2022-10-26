import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Bai2 {
	public static void main(String[] args) throws FileNotFoundException {
		// Cau a
		String email;
		System.out.print("Nhap email: ");
		Scanner input = new Scanner(System.in);
		email = input.nextLine();
		System.out.println(email.substring(0, email.indexOf('@')));

		// Cau b
		System.out.print("Nhap chuoi can dem so chu cai in hoa: ");
		String str = input.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				count++;
			} else {
				continue;
			}
		}
		System.out.println("So ky tu in hoa trong chuoi la: " + count);

		// Cau c
		try {
			File f = new File("text.txt");
			Scanner scan = new Scanner(f);
			while (scan.hasNextLine()) {
				String data = scan.nextLine();
				data = data.replaceAll("file", "tập tin");
				FileWriter w = new FileWriter("text.txt");
				w.write(data);
				w.close();
				System.out.println("Ghi fie thanh cong");
			}
		}

		catch (IOException e) {
			System.out.println("Ghi file that bai");
			e.printStackTrace();
		}

		// Cau d
		System.out.print("Nhap chuoi can dem so tu: ");
		String s = input.nextLine();
		boolean dadem = true;
		int dem = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '.') {
				if (dadem) {
					dem++;
					dadem = false;
				}
			} else {
				dadem = true;
			}
		}
		String word = "", large = "";
		String[] words = new String[100];
		int length = 0;

		s = s + " ";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '.') {
				word = word + s.charAt(i);
			} else {

				words[length] = word;

				length++;

				word = "";
			}
		}

		large = words[0];
		for (int k = 0; k < length; k++) {
			if (large.length() < words[k].length())
				large = words[k];
		}
		System.out.println("Tu dai nhat la: " + large);
		System.out.println("So tu trong chuoi la: " + dem);
	}
}

