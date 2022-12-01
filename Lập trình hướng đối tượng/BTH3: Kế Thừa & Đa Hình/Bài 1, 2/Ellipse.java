import java.lang.Math;

class Ellipse {
	private double bkTrucLon;
	private double bkTrucNho;

	private static final double PI = 3.14;
	
	public Ellipse() {
		
	}
	
	public Ellipse(double bkLon, double bkNho) {
		this.bkTrucLon = bkLon;
		this.bkTrucNho = bkNho;
	}

	public double tinhDienTich() {
		return PI * bkTrucLon * bkTrucNho;
	}

	public double tinhChuVi() {
		return 2 * PI * Math.sqrt((Math.pow(bkTrucLon, 2) + Math.pow(bkTrucNho, 2)) / 2);
	}

	public double getBkTrucLon() {
		return bkTrucLon;
	}

	public void setBkTrucLon(double bkTrucLon) {
		this.bkTrucLon = bkTrucLon;
	}

	public double getBkTrucNho() {
		return bkTrucNho;
	}

	public void setBkTrucNho(double bkTrucNho) {
		this.bkTrucNho = bkTrucNho;
	}

	public static double getPi() {
		return PI;
	}
	
	public String layTenLop() {
		return "Hinh Ellipse";
	}
	
	@Override
	public String toString() {
		String s = this.layTenLop()
					+ "Dien tich: " + this.tinhDienTich() + "\n" 
					+ "Chu vi: " + this.tinhChuVi();
		return s;
	}
}
