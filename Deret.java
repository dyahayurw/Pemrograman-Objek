import java.util.Scanner;
public class deret {
	int x, y, z;
	Scanner scan = new Scanner(System.in);
	
	deret(){
		System.out.print("Nilai Awal : ");
		x = scan.nextInt();
		System.lineSeparator();
		
		System.out.print("Beda : ");
		y = scan.nextInt();
		System.lineSeparator();
		
		System.out.print("Jumlah Deret yang ditampilkan : ");
		z = scan.nextInt();
		System.lineSeparator();		
	}
	
	void arithPro() {
		int temp;
		temp = x;
		for(int i=1; i<=z; i++) {
			System.out.print(temp + " ");
			temp = temp + y;
		}
	}
	
	public static void main(String[] args) {
		deret obj = new deret();
		obj.arithPro();
	}
}