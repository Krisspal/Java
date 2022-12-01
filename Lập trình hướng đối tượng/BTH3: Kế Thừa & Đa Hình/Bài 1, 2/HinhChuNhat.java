
public class HinhChuNhat {

	private double chieuDai;
	private double chieuRong;
	

	HinhChuNhat(double dai, double rong) {
		this.chieuDai = dai;
		this.chieuRong = rong;
	}

	public double tinhDienTich() {
		return this.chieuDai * this.chieuRong;
	}

	public double tinhChuVi() {
		return (this.chieuDai + this.chieuRong) * 2;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public String toString() {
		String s = "Hinh chu nhat\n" + "Dien tich: " + this.tinhDienTich() + "\n" + "Chu vi: " + this.tinhChuVi();
		return s;
	}
}
