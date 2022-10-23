
public class Diem {
	private double hoanhDo;
	private double tungDo;

	Diem(double hd, double td) {
		hoanhDo = hd;
		tungDo = td;
	}

	public double getHoanhDo() {
		return hoanhDo;
	}

	public double getTungDo() {
		return tungDo;
	}

	public void setHoanhDo(double toado) {
		hoanhDo = toado;
	}

	public void setTungDo(double tungdo) {
		tungDo = tungdo;
	}

	public String toString() {
		return "(" + hoanhDo + ", " + tungDo + ")";
	}

	static public double tinhKhoangCach(Diem D1, Diem D2) {
		return Math.sqrt(Math.pow(D1.hoanhDo - D2.hoanhDo, 2) + Math.pow(D1.tungDo - D2.tungDo, 2));
	}
}
