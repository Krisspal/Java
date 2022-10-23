
public class HinhChuNhat {
	private Diem DiemTrenTrai;
	private Diem DiemDuoiPhai;

	HinhChuNhat(Diem trenTrai, Diem duoiPhai) {
		DiemTrenTrai = trenTrai;
		DiemDuoiPhai = duoiPhai;
	}

	public Diem getDiemTrenTrai() {
		return DiemTrenTrai;
	}

	public void setDiemTrenTrai(Diem d) {
		DiemTrenTrai = d;
	}

	public Diem getDiemDuoiPhai() {
		return DiemDuoiPhai;
	}

	public void setDiemDuoiPhai(Diem d) {
		DiemDuoiPhai = d;
	}

	public double tinhDienTich() {
		double a = (Diem.tinhKhoangCach(DiemTrenTrai, new Diem(DiemDuoiPhai.getHoanhDo(), DiemTrenTrai.getTungDo())));
		double b = (Diem.tinhKhoangCach(DiemDuoiPhai, new Diem(DiemDuoiPhai.getHoanhDo(), DiemTrenTrai.getTungDo())));
		return a * b;
	}

	public double tinhChuVi() {
		double a = (Diem.tinhKhoangCach(DiemTrenTrai, new Diem(DiemDuoiPhai.getHoanhDo(), DiemTrenTrai.getTungDo())));
		double b = (Diem.tinhKhoangCach(DiemDuoiPhai, new Diem(DiemDuoiPhai.getHoanhDo(), DiemTrenTrai.getTungDo())));
		return (a + b) * 2;
	}

}
