
public class Angkapengulangan {

	public static void main (String[] args) {
		int n = 5;
		int i, j;
		for (i = 0; i < n ; i++) {
			for (j = n; j > i; j--) {
				System.out.print(" ");
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
