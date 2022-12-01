
public class HinhVuong extends HinhChuNhat {
	HinhVuong(double canh){
		super(canh, canh);
	}
	
	public String toString() {
		String s = "Hinh vuong\n" + "Dien tich: " + this.tinhDienTich() + "\n" + "Chu vi: " + this.tinhChuVi();
		return s;
	}
}
