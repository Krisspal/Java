public class Diem {
	private double x ,y;
	
	Diem (double toado, double tungdo){
		x = toado;
		y = tungdo;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double toado) {
		x = toado;
	}
	
	public void setY(double tungdo) {
		y = tungdo;
	}
	
	public String toString() {
		String s = "Hoanh do: " + x + ", tung do: " + y;
		return s;
	}
	
	static public double khoangCach(Diem D1, Diem D2) {
		return Math.sqrt(Math.pow(D1.x - D2.x,2) + Math.pow(D1.y - D2.y, 2));
	}
}
