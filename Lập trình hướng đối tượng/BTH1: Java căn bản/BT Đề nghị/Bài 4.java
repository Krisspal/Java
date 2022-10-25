import java.util.Scanner;

public class main {

	static void tinhTongDong(int a[][], int m, int n) {

		for (int i = 0; i < m; i++) {
			int tong = 0;
			for (int j = 0; j < n; j++) {
				tong += a[i][j];
			}
			System.out.println("Tong hang " + i + " la: " + tong);
		}

	}

	static void tinhTongCot(int a[][], int m, int n) {

		for (int i = 0; i < m; i++) {
			int tong = 0;
			for (int j = 0; j < n; j++) {
				tong += a[j][i];
			}
			System.out.println("Tong cot " + i + " la: " + tong);
		}

	}

	static void timTongDongLonNhat(int a[][], int m, int n) {
		int max = 0;
		int chisodong = 0;
		for (int i = 0; i < m; i++) {
			int tong = 0;
			for (int j = 0; j < n; j++) {
				tong += a[i][j];
			}
			if (tong > max) {
				max = tong;
				chisodong = i;
			}
		}
		System.out.println("Dong co tong lon nhat la dong " + chisodong);
	}

	static void timTongCotNhoNhat(int a[][], int m, int n) {
		int min = 0;
		int chisocot = 0;
		for (int j = 0; j < n; j++) {
			int tong = 0;
			for (int i = 0; i < m; i++) {
				tong += a[j][i];
			}
			if (tong < min) {
				min = tong;
				chisocot = j;
			}
		}
		System.out.println("Cot co tong nho nhat la dong " + chisocot);
	}

	static void tinhTongDongTimMinDong(int a[][], int m, int n, int d) {
		int tong = 0;
		int min = 2147483647;

		for (int j = 0; j < n; j++) {
			tong += a[d][j];
			if (min > a[d][j]) {
				min = a[d][j];
			}
		}
		System.out.println("Tong hang " + d + " la: " + tong);
		System.out.println("Min dong " + d + " la " + min);
	}

	static void tinhTongCotTimMaxDong(int a[][], int m, int n, int c) {
		int tong = 0;
		int max = -2147483647;

		for (int j = 0; j < n; j++) {
			tong += a[j][c];
			if (max < a[j][c]) {
				max = a[j][c];
			}
		}
		System.out.println("Tong hang " + c + " la: " + tong);
		System.out.println("Min dong " + c + " la " + max);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();

		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Nhap phan tu a[" + i + "][" + j + "]:");
				a[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		tinhTongDong(a, m, n);
		tinhTongCot(a, m, n);
		timTongDongLonNhat(a, m, n);
		timTongCotNhoNhat(a, m, n);
		tinhTongDongTimMinDong(a, m, n, 2);
		tinhTongCotTimMaxDong(a, m, n, 1);

	}
}
