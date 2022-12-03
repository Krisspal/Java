package CongTySach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String moTa;
//	private Date ngaySanXuat;
	private String nhaSX;
	private double giaBan;

	final private static Scanner sc = new Scanner(System.in);

	final private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

	public SanPham() {
	
	}

	public SanPham(String maSP, String tenSP, String moTa, String nhaSX, double giaBan) throws ParseException {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.moTa = moTa;
//		this.ngaySanXuat = SDF.parse(ngaySanXuat);
		this.nhaSX = nhaSX;
		this.giaBan = giaBan;
	}

	public String layTenLop() {
		return "San Pham";
	}

//	public void nhapSP(Scanner scanner) throws ParseException {
//		System.out.print("Nhap ma san pham: ");
//		this.maSP = scanner.nextLine();
//		System.out.print("Nhap ten san pham: ");
//		this.tenSP = scanner.nextLine();
//		System.out.print("Nhap mo ta san pham: ");
//		this.moTa = scanner.nextLine();
//		System.out.print("Nhap ngay san xuat: ");
//		String ngaySX = scanner.nextLine();
//		this.ngaySanXuat = SDF.parse(ngaySX);
//		System.out.print("Nhap gia ban: ");
//		this.giaBan = scanner.nextDouble();
//	}

	public void nhapSP(Scanner scanner) throws ParseException {
		System.out.print("Nhap ma " + this.layTenLop() + ": ");
		this.maSP = scanner.nextLine();
		System.out.print("Nhap ten " + this.layTenLop() + ": ");
		this.tenSP = scanner.nextLine();
		System.out.print("Nhap mo ta " + this.layTenLop() + ": ");
		this.moTa = scanner.nextLine();
		System.out.print("Nhap nha san xuat: ");
		this.nhaSX = scanner.nextLine();
		System.out.print("Nhap gia ban: ");
		this.giaBan = scanner.nextDouble();
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getNhaSX() {
		return nhaSX;
	}

	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

//	public String toString() {
//		return this.layTenLop() + "\n" + "Ma san pham : " + this.maSP + "\n" + "Ten san pham: " + this.tenSP + "\n"
//				+ "Mo ta san pham: " + this.moTa + "\n" + "Nha san xuat: " + this.nhaSX + "\n" + "Gia ban: "
//				+ this.giaBan;
//	}
	
	public void hienThi() {
		System.out.println(this.layTenLop());
		System.out.println("Ma SP: " + this.maSP);
		System.out.println("Ten SP: " + this.tenSP);
		System.out.println("Mo ta: " + this.moTa);
		System.out.println("Nha SX: "+ this.nhaSX);
		System.out.println("Gia ban: " + this.giaBan);
		
	}
}
