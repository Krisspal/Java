import java.util.Scanner;
import java.util.Random;
public class Bai3{
	
	static Scanner input = new Scanner(System.in);
	
	static void input(int []a, int n) {
		for (int i = 0; i < n; i++) {
			/*System.out.print("Nhap phan tu " + i + ": ");
			int x = input.nextInt();*/
			Random rand = new Random();
			a[i] = rand.nextInt(100 + 100) - 100;
		}
	}
	
	static void output(int []a , int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
			if (i % 10 == 0 && i != 0) {
				System.out.print("\n");
			}
		}
	}
	
	static void find_max_and_min(int []a, int n) {
		int MAX = 0, MIN = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > MAX && a[i] > 0) {
				MAX = a[i];
			}
			if (a[i] < MIN && a[i] < 0) {
				MIN = a[i];
			}
		}
		if (MAX != 0) {
			System.out.println("So duong lon nhat: " + MAX);
		}
		else {
			System.out.println("So duong lon nhat: *");
		}
		
		if (MIN != 0) {
			System.out.println("So am nho nhat: " + MIN);
		}
		else {
			System.out.println("So am nho nhat: *");
		}
	}
	
	static boolean isPrime(int a) {
		boolean isPrime = true;
		if (a < 2) {
			isPrime = false;
		}
		else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	
	static void print_prime_and_max_prime(int []a, int n) {
		int MAX = 0;
		System.out.println("\nSo nguyen to trong day: ");
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i])) {
				System.out.println(a[i] + "\t");
				if (a[i] > MAX) {
					MAX = a[i];
				}
			}
		}
		System.out.println("So nguyen to lon nhat: " + MAX);
	}
	
	static int sum_prime(int []a, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i])) {
				sum += a[i];
			}
		}
		return sum;
	}
	
	static void selection_sort(int []a, int n) {
		for (int i = 0; i < n; i++) {
			int max = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] > a[max]) {
					max = j;
				}
			}
			//swap
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
	}
	
	public static void main(String []args) { 
		int n;
		System.out.print("Nhap so phan tu cua mang: ");
		n = input.nextInt();
		int []a = new int[n];
		input(a, n);
		output(a, n);
		
		print_prime_and_max_prime(a, n);
		
		System.out.println("Tong cac so nguyen to trong day: " + sum_prime(a, n));
		find_max_and_min(a, n);
		selection_sort(a, n);
		output(a, n);
	}
}
