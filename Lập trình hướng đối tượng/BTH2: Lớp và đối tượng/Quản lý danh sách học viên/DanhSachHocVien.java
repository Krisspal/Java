import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DanhSachHocVien {
	public ArrayList<HocVien> DSHV;

	public DanhSachHocVien() {
		this.DSHV = new ArrayList<HocVien>();
	}

	public void themHV(HocVien HV) {
		this.DSHV.add(HV);
	}

	public void nhapDiemDSHV(int stt) {
		for (int i = 0; i < this.DSHV.size(); i++) {
			if (i == stt) {
				this.DSHV.get(i).nhapDiemHV();
			}
		}
	}

	public void hienThiDSHV() {
		for (HocVien hocVien : DSHV) {
			System.out.println(hocVien);
		}
	}

//	public void timKiemTheoMaHV(int mshv) {
//		boolean timthay = false;
//		for (HocVien hocVien : DSHV) {
//			if (hocVien.getMAHV() == mshv) {
//				System.out.println(hocVien);
//				timthay = true;
//			}
//		}
//		if (timthay == false) {
//			System.out.println("Khong tim thay hoc vien");
//		}
//	}
//
//	public void timKiemTheoTen(String name) {
//		boolean timthay = false;
//		for (HocVien hocVien : DSHV) {
//			if (hocVien.getHoTen().compareTo(name) == 0) {
//				System.out.println(hocVien);
//				timthay = true;
//			} 
//		}
//		if (timthay == false) {
//			System.out.println("Khong tim thay hoc vien");
//		}
//	}
//
//	public void timKiemTheoQQ(String place) {
//		boolean timthay = false;
//		for (HocVien hocVien : DSHV) {
//			if (hocVien.getQueQuan().compareTo(place) == 0) {
//				System.out.println(hocVien);
//			}
//		}
//	}
	
	public List<HocVien> timKiem(String tuKhoa){
		List<HocVien> kqTimKiem = new ArrayList<>();
		for (HocVien hv : DSHV) {
			if (hv.getHoTen().contains(tuKhoa) || hv.getQueQuan().contains(tuKhoa)) {
				kqTimKiem.add(hv);
			}
		}
		
		return DSHV.stream().filter(hv -> hv.getHoTen().contains(tuKhoa) || hv.getQueQuan().contains(tuKhoa)).collect(Collectors.toList());
	}

	public void sapXepDiemTB() {
		Collections.sort(DSHV, new Comparator<HocVien>() {
			@Override
			public int compare(HocVien hv1, HocVien hv2) {
				return (int) (hv1.getDiemTB() - hv2.getDiemTB());
			}
		});
	}

	public ArrayList<HocVien> xetHocBong() {
		ArrayList<HocVien> ds = new ArrayList<HocVien>();
		for (HocVien hocVien : DSHV) {
			if (hocVien.isHocBong() == true) {
				ds.add(hocVien);
			}
		}
		
		return ds;
	}

}
