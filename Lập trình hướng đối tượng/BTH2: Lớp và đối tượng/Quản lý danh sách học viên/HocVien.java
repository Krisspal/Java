import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class HocVien {
	private static int dem = 0;
	private static int SOMON = 3;
	private int MAHV;
	{
		MAHV = dem++;
	}
	private static Scanner SC = new Scanner(System.in);
	private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

	public int getMAHV() {
		return MAHV;
	}

	private String hoTen;
	private Date ngaySinh;
	private String gioiTinh;
	private String queQuan;
	private double diem[];
	{
		this.diem = new double[SOMON];
	}

	public HocVien(String hoTen, String ngaySinh, String gioiTinh, String queQuan) throws ParseException {
		this.hoTen = hoTen;
		this.ngaySinh = SDF.parse(ngaySinh);
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	
	public double getDiem(int index) {
		return this.diem[index];
	}
	
	public void nhapDiemHV() {
		for (int i = 0; i < SOMON; i++) {
			{
				System.out.print("Nhap diem mon thu " + i + " = ");
				double d = SC.nextDouble();
				this.diem[i] = d;
			}
		}
	}

	public double getDiemTB() {
		double kq = 0;
		for (int i = 0; i < SOMON; i++) {
			kq += this.diem[i];
		}
		return kq / 3;
	}
	
	public boolean isHocBong() {
		DanhSachHocVien ds = new DanhSachHocVien();
		for (int i = 0; i < SOMON; i++) {
			if (diem[i] < 5) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Ma hoc vien: " + MAHV + "\nHo ten hoc vien: " + hoTen + "\nNgay thang nam sinh hoc vien: "
				+ SDF.format(ngaySinh) + "\nGioi tinh hoc vien: " + gioiTinh + "\nQue quan hoc vien: " + queQuan
				+ "\nDiem 3 mon: " + Arrays.toString(diem);
	}
}
