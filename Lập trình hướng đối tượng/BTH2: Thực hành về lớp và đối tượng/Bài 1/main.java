public class Practice1 {

	public static void main(String[] args) {
		Diem d1 = new Diem(6, 7);
		Diem d2 = new Diem(5, 9);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(Diem.khoangCach(d1,d2));
	}
}
