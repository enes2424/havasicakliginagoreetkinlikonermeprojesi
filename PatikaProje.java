import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sıcaklık giriniz: ");
		int sicaklik = input.nextInt();
		
		if (sicaklik < 5) System.out.println("Kayak yapabilirsiniz.");
		else {
			if (sicaklik <= 15) System.out.println("Sinemaya  gidebilirsiniz.");
			if (sicaklik >= 10 && sicaklik <= 25) System.out.println("Pikniğe gidebilirsiniz.");// videodaki gibi 10'u kullandım diğer türlü basit oluyordu
			else if (sicaklik > 25) System.out.println("Yüzmeye gidebilirsiniz.");
		}
	}

}
