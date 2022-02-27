package Punto_Dos;

public class Punto_Dos {

	public void piramide() {
		int n;int i;int l;int j;
		n=10;
		String c = "*";
		l=1;
		while (l<=n) {
			i=1;
			j=1;
			while (i<=(n-l)) {
				System.out.print(" ");
				i++;
			}
			while (j<=l) {
				System.out.print(c);
				j++;
			}
			l++;
			System.out.println();
		}
		
	}
}
