package corejava.ch01.chendachao_Ex;

public class Pyramid {

	int n = 10;
	int a = 10;

	public static void main(String[] args) {

		for (int n = 1; n <= 10; n++) {
			for (int j = 10; j > n; j--) {
				System.out.print(" ");
			}
			for (int a = 1; a <= n; a++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		for (int i = 0; i < 20; i+=2) {
			System.out.println(i+"=");
		}

	}

}
