import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Practice2 {

	public static void main(String[] args) {
		
		
		String [] line = new String[4000];
		
		try {
			File f = new File("DSSV.txt");
			Scanner input = new Scanner(f); 
			while (input.hasNextLine()) {
				String data = input.nextLine();
				for (int i = 0; i< line.length; i++) {
			import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Practice2 {

	public static void main(String[] args) {
		
		
		String [] line = new String[4000];
		
		try {
			File f = new File("DSSV.txt");
			Scanner input = new Scanner(f); 
			while (input.hasNextLine()) {
				String data = input.nextLine();
				for (int i = 0; i< line.length; i++) {
					line[i] = data;
				}
				for (int i = 0; i< line.length; i++) {
					System.out.println(line[i]);
				}
				//System.out.println(data);
			}
			input.close();
		} catch(FileNotFoundException e) {
			System.out.println("Loi mo file.");
		      e.printStackTrace();
		}
	}

}
		line[i] = data;
				}
				for (int i = 0; i< line.length; i++) {
					System.out.println(line[i]);
				}
				//System.out.println(data);
			}
			input.close();
		} catch(FileNotFoundException e) {
			System.out.println("Loi mo file.");
		      e.printStackTrace();
		}
	}

}
