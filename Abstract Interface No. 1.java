public abstract class Robot {
  protected String nama;
  protected String pemilik;
  protected int tahun;
  public void setTahunPembuatan(int tahun) {
    this.tahun = tahun;
  }
  public abstract void setNama(String nama);
  public abstract void displayData();
}

public class DoraMiniAbs extends Robot {
  public void sayDora() {
    System.out.println("Halo, Saya Dora Mini");
  }
  public void setNama(String nama) {
    super.nama = nama;
  }
  public void displayData() {
    System.out.println("Nama: " + super.nama);
    System.out.println("Pemilik: " + super.pemilik);
    System.out.println("Tahun Produksi: " + super.tahun);
  }
}

public class MainAbstrak{
	public static void main(String args[]){
	//Robot r = new Robot();
	dm.setNama("Dora Mini Satu");
	dm.settahunPembuatan(2014);
	dm.displayData();
	dm.sayDora;
	}
}