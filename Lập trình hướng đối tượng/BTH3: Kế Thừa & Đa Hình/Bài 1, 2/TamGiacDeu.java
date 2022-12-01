
public class TamGiacDeu extends TamGiacCan {
	TamGiacDeu(double abc) throws Exception {
		super(abc, abc);
	}
	
	public String layTenLop() {
		return "Tam Giac Deu\n";
	}
	
	@Override
	public String toString() {
		return this.layTenLop() + "Dien tich: " + this.tinhDienTich() + "\n" + "Chu vi: " + this.tinhChuVi();
	}
}
