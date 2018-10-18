public class Desaigner extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji desaigner Sebesar = "+gaji);
		}else{
			System.out.println("maaf gaji melebihi maksimum gaji desaigner");
		}
	}
}