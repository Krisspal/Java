public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;

	public boolean kiemTra(Diem a, Diem b, Diem c) {
		double ab = Diem.tinhKhoangCach(a, b);
		double ac = Diem.tinhKhoangCach(a, c);
		double bc = Diem.tinhKhoangCach(b, c);

		if ((ab + bc > ac) && (ac + bc > ab) && (bc + ac > ab)) {
			return true;
		} else
			return false;
	}

	public TamGiac(Diem a, Diem b, Diem c) throws Exception {
		if (kiemTra(a, b, c)) {
			this.A = a;
			this.B = b;
			this.C = c;
		} else
			throw new Exception("Ba canh khong tao thanh hinh tam giac\n");
	}

	public double tinhDienTich() {
		double ab = Diem.tinhKhoangCach(A, B);
		double ac = Diem.tinhKhoangCach(A, C);
		double bc = Diem.tinhKhoangCach(B, C);

		double p = (ab + bc + ac) / 2;
		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
	}

	public double tinhChuVi() {
		double ab = Diem.tinhKhoangCach(A, B);
		double ac = Diem.tinhKhoangCach(A, C);
		double bc = Diem.tinhKhoangCach(B, C);

		return ab + bc + ac;
	}

	public String layTenLop() {
		return "Tam giac\n";
	}

	public String toString() {
		return this.layTenLop() + "Diem A : " + A.toString() + "\n" + "Diem B : " + B.toString() + "\n" + "Diem C : "
				+ C.toString() + "\n" + "Dien tich: " + this.tinhDienTich() + "\n" + "Chu vi: " + this.tinhChuVi();
	}

}
