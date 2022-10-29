import java.util.Scanner;

public class Practice2 {

	static void tinhTongDong(int arr[][], int m, int n) {
		for (int i = 0; i < m; i++) {
			int tong = 0;
			for (int j = 0; j < n; j++) {
				tong += arr[i][j];
			}
			System.out.println("Tong dong " + i + " la: " + tong);
		}
	}

	static void tinhTongCot(int arr[][], int m, int n) {
		for (int i = 0; i < n; i++) {
			int tong = 0;
			for (int j = 0; j < m; j++) {
				tong += arr[j][i];
			}
			System.out.println("Tong cot " + i + " la: " + tong);
		}
	}

	static void timTongDongLonNhat(int arr[][], int m, int n) {
		int max = -2147483647;
		int vitridong = 0;
		for (int i = 0; i < m; i++) {
			int tong = 0;
			for (int j = 0; j < n; j++) {
				tong += arr[i][j];
			}
			if (tong > max) {
				max = tong;
				vitridong = i;
			}

		}
		System.out.println("Dong co tong lon nhat la dong: " + vitridong);
	}

	static void timTongCotNhoNhat(int arr[][], int m, int n) {
		int min = 2147483647;
		int vitricot = 0;
		for (int i = 0; i < n; i++) {
			int tong = 0;
			for (int j = 0; j < m; j++) {
				tong += arr[j][i];
			}
			if (tong < min) {
				min = tong;
				vitricot = i;
			}
		}
		System.out.println("Cot co tong nho nhat la cot: " + vitricot);
	}

	static void tinhTongDongTimMinDong(int arr[][], int m, int n, int d) {
		int tong = 0;
		int min = 2147483647;

		for (int j = 0; j < n; j++) {
			tong += arr[d][j];
			if (min > arr[d][j]) {
				min = arr[d][j];
			}
		}
		System.out.println("Tong dong " + d + " la: " + tong);
		System.out.println("Min dong " + d + " la: " + min);
	}

	static void tinhTongCotTimMaxCot(int arr[][], int m, int n, int c) {
		int tong = 0;
		int max = -2147483647;

		for (int j = 0; j < m; j++) {
			tong += arr[j][c];
			if (max < arr[j][c]) {
				max = arr[j][c];
			}
		}
		System.out.println("Tong cot " + c + " la: " + tong);
		System.out.println("Max cot " + c + " la: " + max);
	}

	public static void main(String[] args) {
		System.out.println("* Bai tap 4 - Bai Thuc Hanh 1 *");
		System.out.println("Chi so dong va cot bat dau tu 0");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dong cua mang: ");
		int m = scanner.nextInt();
		System.out.print("Nhap so cot cua mang: ");
		int n = scanner.nextInt();
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.print("arr[" + i + "][" + j + "]: ");
				//arr[i][j] = scanner.nextInt();
				arr[i][j] = (int ) (Math.random() * 100 + 1);
			}
		}

		System.out.println("Cac phan tu cua mang la: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		tinhTongDong(arr, m, n);
		tinhTongCot(arr, m, n);
		timTongDongLonNhat(arr, m, n);
		timTongCotNhoNhat(arr, m, n);
		System.out.println("Nhap chi so dong muon tinh tong va tim min: ");
		int d = scanner.nextInt();
		tinhTongDongTimMinDong(arr, m, n, d);
		System.out.println("Nhap chi so cot muon tinh tong va tim max: ");
		int c = scanner.nextInt();
		tinhTongCotTimMaxCot(arr, m, n, c);

	}

}
