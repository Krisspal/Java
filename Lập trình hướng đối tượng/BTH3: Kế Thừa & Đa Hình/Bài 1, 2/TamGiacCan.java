
public class TamGiacCan extends TamGiac{
	TamGiacCan(double ab, double c) throws Exception{
		super(ab, ab, c);
	}
	
	public String layTenLop() {
		return "Tam Giac Can\n";
	}
	
	@Override
	public String toString() {
		return this.layTenLop() + "Dien tich: " + this.tinhDienTich() + "\n" + "Chu vi: " + this.tinhChuVi();
	}
}
