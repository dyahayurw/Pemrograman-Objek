import java.util.Scanner;
public class novelCollection {
	String judul, penulis, deskripsi;
	int tahun,h_beli, h_jual;
	Scanner scan = new Scanner(System.in);
	
	novelCollection(String j, String p, String d, int t, int h){
		this.judul = j;
		this.penulis = p;
		this.deskripsi = d;
		this.h_beli = h;
	}
	
	void showJudul() {
			System.out.println("Judul : " + this.judul);
	}
	
	void showItemData() {
		System.out.println("Judul : " + this.judul);
		System.out.println("Penulis : " + this.penulis);
		System.out.println("Deskripsi : " + this.deskripsi);
		System.out.println("Tahun Terbit : " + this.tahun);
		System.out.println("Harga Beli : " + this.h_beli);
	}
	
	public static void main(String[] args) {
		int n = 0, x, h, t;
		String j, p, d;
		
		Scanner scan = new Scanner(System.in);
		novelCollection[] obj = new novelCollection[4];
		
		while (n < 4){
			x = n+1;
			System.out.println("Data " + x);
			
			System.out.print("Judul : ");
			j = scan.next();
			System.lineSeparator();
			
			System.out.print("Penulis : ");
			p = scan.next();
			System.lineSeparator();
			
			System.out.print("Deskripsi : ");
			d = scan.next();
			System.lineSeparator();
			
			System.out.print("Tahun Terbit : ");
			t = scan.nextInt();
			System.lineSeparator();
			
			System.out.print("Harga Beli : ");
			h = scan.nextInt();
			System.lineSeparator();	
			obj [n] = new novelCollection(j, p, d, t, h);
			n++;
		}
		
		System.lineSeparator();
		System.out.println("Data List: ");
		for(int z = 0; z < 4; z++) {
			obj[z].showItemData();
		}
	}
}