import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double real, m, p1 = 0, p2 = 0, p3 = 0;

		for (int i = 0; i < n; i++) {
			real = sc.nextDouble();
			if (i == 0) {
				p1 = 2 * real;
			}
			if (i == 1) {
				p2 = 3 * real;
			}
			if (i == 2) {
				p3 = 5 * real;
			}

		}

		m = (p1 + p2 + p3) / 10;
		System.out.printf("%.1f", m);
		sc.close();

	}

}
