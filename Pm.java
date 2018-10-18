public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji Project Manager Sebesar = "+gaji);
		}else{
			System.out.println("maaf gaji melebihi maksimum gaji Project Manager");
		}
	}
}