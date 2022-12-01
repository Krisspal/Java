package CongTySach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String moTa;
	private Date ngaySanXuat;
	private double giaBan;

	// private static Scanner sc = new Scanner(System.in);

	private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

	public SanPham() {
	}

	public SanPham(String maSP, String tenSP, String moTa, String ngaySanXuat, double giaBan) throws ParseException {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.moTa = moTa;
		this.ngaySanXuat = SDF.parse(ngaySanXuat);
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
		System.out.print("Nhap ngay san xuat: ");
		String ngaySX = scanner.nextLine();
		this.ngaySanXuat = SDF.parse(ngaySX);
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

	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public String toString() {
		return this.layTenLop() + "\n" + "Ma san pham : " + this.maSP + "\n" + "Ten san pham: " + this.tenSP + "\n"
				+ "Mo ta san pham: " + this.moTa + "\n" + "Ngay san xuat: " + this.ngaySanXuat + "\n" + "Gia ban: "
				+ this.giaBan;
	}

}
