package median_and_arithmetic_mean;

public class main_func {

	public static void main(String[] args) {
		System.out.println(median(18, 15, 17));
		System.out.println(median(18, 20, 30));
		System.out.println(median(21, 15, 34));
		System.out.println(median2(18, 15, 17));
		System.out.println(median2(18, 20, 30));
		System.out.println(median2(21, 15, 34));

		int number_arr[] = { 1, 23, 56, 6766, 876 };

		System.out.println(mean(number_arr));
		/*
		 * Olabilecek hatalar:
		 * 
		 * Tamsayı bölmesi (Tamsayı bölme işlemi, ondalık kısmı kaybettirebilir) Taşma
		 * (Overflow) (Toplam değeri int sınırlarını aşabilir) Boş dizi (Sıfıra bölme
		 * hatası veya hesaplanacak değer olmaması) Yuvarlama hatası (Ondalıklı sayılar,
		 * hassasiyet kaybına neden olabilir)
		 */
		/*
		 * Mögliche Probleme:
		 * 
		 * Ganzzahlige Division (Integer-Division kann Nachkommastellen abschneiden)
		 * Überlauf (Summe kann den Wertebereich von int überschreiten) Leeres Array
		 * (Division durch Null oder keine Werte zum Berechnen) Rundungsfehler
		 * (Gleitkommazahlen können Präzisionsprobleme verursachen)
		 */


	}

	public static int median(int a, int b, int c) {
		if ((a >= b && a <= c) || (a <= b && a >= c)) {

			return a;

		} else if ((b >= a && b <= c) || (b <= a && b >= c)) {

			return b;

		} else {

			return c;

		}


	}

	public static int median2(int a, int b, int c) {
		int arr[] = { a, b, c };
		java.util.Arrays.sort(arr);
		return arr[1];


	}

	public static int mean(int numbers[]) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {

			sum += numbers[i];

		}

		return sum / numbers.length;


	}

}
