
public class Practice1 {
	public static void main(String[] args) {
		DoanThang D1 = new DoanThang(new Diem(1, 2), new Diem(3, 4));
		DoanThang D2 = new DoanThang(new Diem(5, 6), new Diem(7, 8));

		System.out.println("Do dai doan D1: " + D1.tinhDoDai());
		System.out.println("Trung diem D2 " + D2.timTrungDiem(D2));

		System.out.println(DoanThang.ktSongSong(D1, D2));

		HinhChuNhat A = new HinhChuNhat(new Diem(6, 7), new Diem(1, 2));
		System.out.println("Dien tich hinh chu nhat la " + A.tinhChuVi());
	}
}
