package buoi3;

public class SDDuongTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem d1 = new Diem(2,5);
		Diem d2 = new Diem(10,12);
		DuongTron dt1 = new DuongTron(d1 ,6);
		dt1.hienThi();
		DuongTron dt2 = new DuongTron();
		dt2.nhap();
		dt2.hienThi();
		dt2.doiDuongTron(1, 2);
		System.out.println("Duong tron sau khi doi: ");
		dt2.hienThi();
		System.out.println(dt2.catNhau(dt1));
		System.out.println(dt1.trongDuongTron(d1));
		System.out.println(dt1.dienTich());
		System.out.println(dt1.chuVi());

	}

}
