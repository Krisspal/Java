import java.lang.Math;

public class TamGiac {
	private double a;
	private double b;
	private double c;

	TamGiac(double a, double b, double c) throws Exception {
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new Exception("Ba canh khong tao thanh hinh tam giac\n");
		}
	}

	public double tinhDienTich() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public double tinhChuVi() {
		return a + b + c;
	}
	
	public String layTenLop() {
		return "Tam Giac\n"; 
	}
	
	@Override
	public String toString() {
		return this.layTenLop() + "Dien tich: " + this.tinhDienTich() + "\n" + "Chu vi: " + this.tinhChuVi();
	}
}
