package CongTySach;

import java.text.ParseException;
import java.util.Scanner;

public class BangDia extends SanPham {
	private double thoiGianPhat;

	public BangDia() {
	}

	public BangDia(String maSP, String tenSP, String moTa, String nhaSX, double giaBan, float thoiGianPhat)
			throws ParseException {
		super(maSP, tenSP, moTa, nhaSX, giaBan);
		this.thoiGianPhat = thoiGianPhat;
	}

	public double getThoiGianPhat() {
		return thoiGianPhat;
	}

	public void setThoiGianPhat(double thoiGianPhat) {
		this.thoiGianPhat = thoiGianPhat;
	}
	
	@Override
	public void nhapSP(Scanner scanner) throws ParseException {
		System.out.println("Nhap thong tin bang dia");
		super.nhapSP(scanner);
		System.out.print("Nhap thoi gian phat: ");
		this.thoiGianPhat = scanner.nextFloat();
	}
	
	@Override
	public String layTenLop() {
		return "Bang Dia";
	}

//	@Override
//	public String toString() {
//		return this.layTenLop() + "\n" + "Ma san pham : " + this.getMaSP() + "\n" + "Ten san pham: " + this.getTenSP()
//				+ "\n" + "Mo ta san pham: " + this.getMoTa() + "\n" + "Ngay san xuat: " + this.getNhaSX() + "\n"
//				+ "Thoi gian phat: " + this.thoiGianPhat + "\n" + "Gia ban: " + this.getGiaBan();
//	}
	
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("So trang: " + this.thoiGianPhat);
		System.out.println("===================================");
	}
}
