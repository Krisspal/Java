public class Diem {
	private double hoanhDo;
	private double tungDo;

	Diem(double x, double y) {
		this.hoanhDo = x;
		this.tungDo = y;
	}

	public double getHoanhDo() {
		return hoanhDo;
	}

	public void setHoanhDo(double hoanhDo) {
		this.hoanhDo = hoanhDo;
	}

	public double getTungDo() {
		return tungDo;
	}

	public void setTungDo(double tungDo) {
		this.tungDo = tungDo;
	}

	public static double tinhKhoangCach(Diem a, Diem b) {
		return Math.sqrt(Math.pow(b.hoanhDo - a.hoanhDo, 2) + Math.pow(b.tungDo - a.tungDo, 2));
	}
	
	public String toString() {
		return "(" + this.hoanhDo + ", " + this.tungDo + ")";
	}
	

}
