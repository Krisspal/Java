package CongTySach;
import java.text.ParseException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		DsSanPham ds = new DsSanPham();
		SanPham a = new Sach("123", "oop", "hay", "12/03/2002", 6.7, 12 );
		SanPham b = new BangDia("567", "csdl", "tot", "13/09/2003", 100.0, 12);
//		SanPham c = new Sach();
//		c.nhapSP(sc);
//		ds.themSanPham(c);
		ds.themSanPham(a);
		ds.themSanPham(b);
		
		ds.hienThi();
		System.out.println("Ket qua tim kiem: ");
		ds.timKiem("oop").forEach(sp -> sp.hienThi());
		
		System.out.println("Ket qua sap xep: ");
		ds.sapXep();
		ds.hienThi();
		
		System.out.println("Tim kiem san pham co gia tu 1 toi 10:");
		ds.timKiem(1, 10).forEach(sp -> sp.hienThi());
		
		System.out.println("Tim kiem theo loai san pham: ");
		ds.timKiemLoaiSP("Bang Dia").forEach(sp -> sp.hienThi());
	}

}
