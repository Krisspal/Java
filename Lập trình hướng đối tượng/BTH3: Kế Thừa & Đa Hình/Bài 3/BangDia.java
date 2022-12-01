package CongTySach;

import java.text.ParseException;
import java.util.Scanner;

public class BangDia extends SanPham {
	private float thoiGianPhat;

	BangDia() {
	}

	BangDia(String maSP, String tenSP, String moTa, String ngaySx, double giaBan, float thoiGianPhat)
			throws ParseException {
		super(maSP, tenSP, moTa, ngaySx, giaBan);
		this.thoiGianPhat = thoiGianPhat;
	}

	public float getThoiGianPhat() {
		return thoiGianPhat;
	}

	public void setThoiGianPhat(float thoiGianPhat) {
		this.thoiGianPhat = thoiGianPhat;
	}

	public void nhapSP(Scanner scanner) throws ParseException {
		System.out.println("Nhap thong tin bang dia");
		super.nhapSP(scanner);
		System.out.print("Nhap thoi gian phat: ");
		this.thoiGianPhat = scanner.nextFloat();
	}
	
	public String layTenLop() {
		return "Bang Dia";
	}

	@Override
	public String toString() {
		return this.layTenLop() + "\n" + "Ma san pham : " + this.getMaSP() + "\n" + "Ten san pham: " + this.getTenSP()
				+ "\n" + "Mo ta san pham: " + this.getMoTa() + "\n" + "Ngay san xuat: " + this.getNgaySanXuat() + "\n"
				+ "Thoi gian phat: " + this.thoiGianPhat + "\n" + "Gia ban: " + this.getGiaBan();
	}

}
