import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DsPhanSo {
	private ArrayList<PhanSo> ds = new ArrayList<PhanSo>();

	public void themPhanSo(PhanSo p) {
		ds.add(p);
	}

	public DsPhanSo() {
		this.ds = new ArrayList<PhanSo>();
	}

	public void xoaPhanSo(PhanSo p) {
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).soSanh(p) == 2) {
				ds.remove(i);
			}
		}
	}

	public PhanSo tinhTong() {
		PhanSo kq = new PhanSo();
		for (PhanSo phanSo : ds) {
			kq = kq.cong(phanSo);
		}

		return kq;
	}

	public void sapXep() {
		Collections.sort(ds, new Comparator<PhanSo>() {

			@Override
			public int compare(PhanSo ps1, PhanSo ps2) {
				return (int) ((double) (ps2.getTuSo() / ps2.getMauSo()) - (double) (ps1.getTuSo() / ps1.getMauSo()));
			}
		});
		for (PhanSo phanSo : ds) {
			System.out.print(phanSo + "\t");
		}
	}
	
	public void hienThi() {
		for (PhanSo phanSo : ds) {
			System.out.print(phanSo + "\t");
		}
		
	}
}
