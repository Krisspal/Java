package CongTySach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DsSanPham {
	public ArrayList<SanPham> DsSanPham;

	DsSanPham() {
		this.DsSanPham = new ArrayList<SanPham>();
	}

	public boolean themSanPham(SanPham sp) {
		return DsSanPham.add(sp);
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
	
	public boolean capNhatSanPham(String maSP, String tenSP, String moTa, String ngaySanXuat, double giaBan) throws ParseException {
		for (SanPham sp : DsSanPham) {
			if (sp.getMaSP().contains(maSP)) {
				sp.setTenSP(tenSP);
				sp.setMoTa(moTa);
				SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
				sp.setNgaySanXuat(SDF.parse(ngaySanXuat));
				sp.setGiaBan(giaBan);
				return true;
			}
		}
		return false;
	}
	
	public List<SanPham> timKiem(String tuKhoa){
		List<SanPham> kqTimKiem = new ArrayList<>();
		for (SanPham sp : DsSanPham) {
			if (sp.getMaSP().contains(tuKhoa) || sp.getTenSP().contains(tuKhoa) || sp.getMoTa().contains(tuKhoa)) {
				kqTimKiem.add(sp);
			}
		}
		
		return DsSanPham.stream().filter(sp -> sp.getMaSP().contains(tuKhoa) || sp.getTenSP().contains(tuKhoa) || sp.getMoTa().contains(tuKhoa)).collect(Collectors.toList());
	}
	
	public List<SanPham> timKiem(double tuGia, double toiGia){
		List<SanPham> kqTimKiem = new ArrayList<>();
		for (SanPham sp : DsSanPham) {
			if (sp.getGiaBan() >= tuGia && sp.getGiaBan() <= toiGia) {
				kqTimKiem.add(sp);
			}
		}
		
		return DsSanPham.stream().filter(sp -> sp.getGiaBan() >= tuGia && sp.getGiaBan() <= toiGia).collect(Collectors.toList());
	}
	
	public void sapXepGiaBan() {
		Collections.sort(DsSanPham, new Comparator<SanPham>() {
			@Override
			public int compare(SanPham sp1, SanPham sp2) {
				return (int) (sp1.getGiaBan() - sp1.getGiaBan());
			}
		});
	}
	
	public void hienThiDSSP() {
		for (SanPham sp : DsSanPham) {
			System.out.println(sp);
		}
	}

}
