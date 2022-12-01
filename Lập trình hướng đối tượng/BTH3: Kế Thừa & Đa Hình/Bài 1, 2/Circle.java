
class Circle extends Ellipse{

	public Circle(double bk) {
		super(bk, bk);
		// TODO Auto-generated constructor stub
	}
		
	public String layTenLop() {
		return "Hinh Circle";
	}
	
	@Override
	public String toString() {
		String s = this.layTenLop()
				+ "Dien tich: " + this.tinhDienTich() + "\n" 
				+ "Chu vi: " + this.tinhChuVi();
	return s;
	}
}
