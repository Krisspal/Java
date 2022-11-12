
public class PhanSo {
	private int mauSo;
	private int tuSo;

	static int Dem = 0;
	{
		Dem++;
	}

	PhanSo() {
		this.tuSo = 0;
		this.mauSo = 1;
	}

	PhanSo(int ts, int ms) {
		this.tuSo = ts;
		this.mauSo = ms;
	}

	static int timUCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public static int getDem() {
		return Dem;
	}

	public static void setDem(int dem) {
		Dem = dem;
	}

	public PhanSo rutGonPhanSo() {
		PhanSo rg = new PhanSo();
		rg.setTuSo(this.getTuSo() / timUCLN(this.getTuSo(), this.getMauSo()));
		rg.setMauSo(this.getMauSo() / timUCLN(this.getTuSo(), this.getMauSo()));

		return rg;
	}

	public PhanSo cong(PhanSo khac) {
		int ts = this.tuSo * khac.mauSo + khac.tuSo * this.mauSo;
		int ms = this.mauSo * khac.mauSo;
		PhanSo kq = new PhanSo(ts, ms);
		return kq.rutGonPhanSo();
	}

	public PhanSo tru(PhanSo khac) {
		int ts = tuSo * khac.mauSo - khac.tuSo * mauSo;
		int ms = mauSo * khac.mauSo;
		PhanSo kq = new PhanSo(ts, ms);
		kq.rutGonPhanSo();
		return kq;
	}

	public PhanSo nhan(PhanSo khac) {
		int ts = tuSo * khac.tuSo;
		int ms = mauSo * khac.mauSo;
		PhanSo kq = new PhanSo(ts, ms);
		kq.rutGonPhanSo();
		return kq;
	}

	public PhanSo chia(PhanSo khac) {
		int ts = tuSo * khac.mauSo;
		int ms = mauSo * khac.tuSo;
		PhanSo kq = new PhanSo(ts, ms);
		kq.rutGonPhanSo();
		return kq;
	}

	public String toString() {
		return this.tuSo + "/" + this.mauSo;
	}

	public int soSanh(PhanSo khac) { // 0: a > b; 1: a < b; 2: a = b
		double a = tuSo / mauSo;
		double b = khac.tuSo / khac.mauSo;
		PhanSo q = new PhanSo(tuSo, mauSo);
		if (a > b) {
			return 0;
		} else if (a < b) {
			return 1;
		} else {
			return 2;
		}
	}
}
