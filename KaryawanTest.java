public class KaryawanTest{
	public static void main(String[] args){
		System.out.println("Macam - macam gaji karyawan perusahaan XYZ");
		System.out.println(" ");
		Desaigner a = new Desaigner();
		a.setNama("ani");
		a.setAlamat("Bandung");
		a.setGaji(80);

		System.out.println(" ");
		Pm b = new Pm();
		b.setNama("Fany");
		b.setAlamat("jakarta");
		b.setGaji(90);

		System.out.println(" ");
		Programmer c = new Programmer();
		c.setNama("kiki");
		c.setAlamat("surabaya");
		c.setGaji(80);

	}
}