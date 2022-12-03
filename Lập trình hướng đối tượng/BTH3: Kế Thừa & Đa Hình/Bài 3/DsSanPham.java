package CongTySach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DsSanPham {
	private ArrayList<SanPham> DsSanPham;
	final private static Scanner sc = new Scanner(System.in);

	public DsSanPham() {
		DsSanPham = new ArrayList<SanPham>();
	}

	public boolean themSanPham(SanPham sp) {
		return DsSanPham.add(sp);
	}

	public ArrayList<SanPham> getDsSanPham() {
		return DsSanPham;
	}

	public void setDsSanPham(ArrayList<SanPham> DsSanPham) {
		this.DsSanPham = DsSanPham;
	}

	public void themSanPham(String loaiSP) throws ParseException {
		SanPham sp = new SanPham();
		if (loaiSP.equals("Sach"))
			sp = new Sach();
		else if (loaiSP.equals("Bang Dia"))
			sp = new BangDia();

		sp.nhapSP(sc);
		this.themSanPham(sp);

//		Class myClass = Class.forName(loaiSP);
//		sp = new (SanPham) myClass.getDeclaredConstructor(null).newInstance(null);
	}

	public boolean xoaSanPham(SanPham sp) {
		for (SanPham i : DsSanPham) {
			int index = DsSanPham.indexOf(sp);
			DsSanPham.remove(index);
			return true;
		}
		return false;
	}

	public boolean xoaSanPham(String maSp) {
		for (SanPham sp : DsSanPham) {
			if (sp.getMaSP().contains(maSp)) {
				DsSanPham.remove(sp);
				return true;
			}
		}
		return false;
	}

	public boolean capNhatSanPham(String maSP, String tenSP, String moTa, String nhaSX, double giaBan)
			throws ParseException {
		for (SanPham sp : DsSanPham) {
			if (sp.getMaSP().contains(maSP)) {
				sp.setTenSP(tenSP);
				sp.setMoTa(moTa);
//				SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
//				sp.set(SDF.parse(ngaySanXuat));
				sp.setNhaSX(nhaSX);
				sp.setGiaBan(giaBan);
				return true;
			}
		}
		return false;
	}

	public List<SanPham> timKiem(String tuKhoa) {
//		List<SanPham> kqTimKiem = new ArrayList<>();
//		for (SanPham sp : DsSanPham) {
//			if (sp.getMaSP().contains(tuKhoa) || sp.getTenSP().contains(tuKhoa) || sp.getMoTa().contains(tuKhoa)) {
//				kqTimKiem.add(sp);
//			}
//		}

		return DsSanPham.stream().filter(
				sp -> sp.getMaSP().contains(tuKhoa) || sp.getTenSP().contains(tuKhoa) || sp.getMoTa().contains(tuKhoa))
				.collect(Collectors.toList());
	}

	public List<SanPham> timKiem(double tuGia, double toiGia) {
		List<SanPham> kqTimKiem = new ArrayList<>();
//		for (SanPham sp : DsSanPham) {
//			if (sp.getGiaBan() >= tuGia && sp.getGiaBan() <= toiGia) {
//				kqTimKiem.add(sp);
//			}
//		}
		return DsSanPham.stream().filter(sp -> sp.getGiaBan() >= tuGia && sp.getGiaBan() <= toiGia)
				.collect(Collectors.toList());
	}

	public List<SanPham> timKiemLoaiSP(String loaiSP) {
//		ArrayList<SanPham> kqTimKiem = new ArrayList<SanPham>();
//		if (loaiSP.equals("Sach")) {
//			for (SanPham sp : DsSanPham) {
//				if (sp instanceof Sach) {
//					kqTimKiem.add(sp);
//				}
//			}
//		} else if (loaiSP.equals("Bang Dia")) {
//			for (SanPham sp : DsSanPham) {
//				if (sp instanceof BangDia) {
//					kqTimKiem.add(sp);
//				}
//			}
//			
//		}
//		return kqTimKiem;
		
		return DsSanPham.stream().filter(sp -> {
			if (loaiSP.equals("Sach"))
				return sp instanceof Sach;
			else if (loaiSP.equals("Bang Dia"))
				return sp instanceof BangDia;
			return false;
		}).collect(Collectors.toList());
	}

	public void sapXep() {
		DsSanPham.sort((sp1, sp2) -> {
			return sp1.getGiaBan() == sp2.getGiaBan() ? 0 : (sp1.getGiaBan() < sp2.getGiaBan() ? -1 : 1);
		});
	}

	public void hienThi() {
		DsSanPham.forEach(sp -> sp.hienThi());
	}
}
