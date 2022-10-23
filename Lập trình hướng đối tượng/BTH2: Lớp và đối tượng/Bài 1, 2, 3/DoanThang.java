public class DoanThang {
	private Diem diemDau;
	private Diem diemCuoi;

	DoanThang(Diem dau, Diem cuoi) {
		diemDau = dau;
		diemCuoi = cuoi;
	}

	public Diem getDiemDau() {
		return diemDau;
	}

	public Diem getDiemCuoi() {
		return diemCuoi;
	}

	public void setDiemDau(Diem v) {
		diemDau = v;
	}

	public void setDiemCuoi(Diem v) {
		diemCuoi = v;
	}

	public String toString() {
		return "[(" + diemDau.getHoanhDo() + ", " + diemDau.getTungDo() + ")], (" + diemCuoi.getHoanhDo() + ", "
				+ diemCuoi.getHoanhDo() + ")]";
	}

	public double tinhDoDai() {
		return Math.sqrt(Math.pow(diemDau.getHoanhDo() - diemCuoi.getHoanhDo(), 2)
				+ Math.pow(diemDau.getTungDo() - diemCuoi.getTungDo(), 2));
	}

	public Diem timTrungDiem(DoanThang D) {
		Diem trungDiem = new Diem((diemDau.getHoanhDo() + diemCuoi.getHoanhDo()) / 2,
				(diemDau.getTungDo() + diemCuoi.getTungDo()) / 2);
		return trungDiem;
	}

	static boolean ktSongSong(DoanThang D1, DoanThang D2) {
		double a = ((D1.diemDau.getHoanhDo() - D1.diemCuoi.getHoanhDo())
				/ (D1.diemDau.getTungDo() - D1.diemCuoi.getTungDo()));
		
		double b = ((D2.diemDau.getHoanhDo() - D2.diemCuoi.getHoanhDo())
				/ (D2.diemDau.getTungDo() - D2.diemCuoi.getTungDo()));
		
		if (a == b) {
			return true;
		}
		else {
			return false;
		}
	}

}
