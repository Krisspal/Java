package CongTySach;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Sach extends SanPham {
	private int soTrang;

	public Sach() {

	}

	public Sach(String maSP, String tenSP, String moTa, String nhaSX, double giaBan, int soTrang) throws ParseException {
		super(maSP, tenSP, moTa, nhaSX, giaBan);
		this.soTrang = soTrang;
	}
	
	@Override
	public void nhapSP(Scanner scanner) throws ParseException {
//		System.out.print("Nhap ma san pham: ");
//		this.setMaSP(scanner.nextLine());
//		System.out.print("Nhap ten san pham: ");
//		this.tenSP = scanner.nextLine();
//		System.out.print("Nhap mo ta san pham: ");
//		this.moTa = scanner.nextLine();
//		System.out.print("Nhap ngay san xuat: ");
//		String ngaySX = scanner.nextLine();
//		this.ngaySanXuat = SDF.parse(ngaySX);
//		System.out.print("Nhap gia ban: ");
//		this.giaBan = scanner.nextDouble();
		System.out.println("Nhap thong tin sach");
		super.nhapSP(scanner);
		System.out.print("Nhap so trang sach: ");
		this.soTrang = scanner.nextInt();
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public String layTenLop() {
		return "Sach";
	}

//	@Override
//	public String toString() {
//		return this.layTenLop() + "\n" + "Ma san pham : " + this.getMaSP() + "\n" + "Ten san pham: " + this.getTenSP()
//				+ "\n" + "Mo ta san pham: " + this.getMoTa() + "\n" + "Ngay san xuat: " + this.getNhaSX() + "\n"
//				+ "So trang: " + this.soTrang + "\n" + "Gia ban: " + this.getGiaBan();
//	}
	
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("So trang: " + this.soTrang);
		System.out.println("===================================");
	}
}
