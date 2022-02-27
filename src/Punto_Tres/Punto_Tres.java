package Punto_Tres;

public class Punto_Tres {

	public void arbolito() {
		int n; int i; int j; int ancho;int espacio;int ancho_b; int i_b;
		String c ="*";
		n=1;
		ancho=1;
		do {
			espacio=11;
			i=0;
			do {
				System.out.print(" ");
				espacio--;
			} while (espacio>n);
			do {
				System.out.print(c);
				i++;
			} while (i<ancho);
			System.out.println(" ");
			ancho=ancho+2;
			n++;
		} while (n<11);
		
		j=0;
		ancho_b=3;
		i_b=0;
		int l;
		do {
			l=9;
			do {
				System.out.print(" ");
				l--;
			} while (l>j);
			do {
				System.out.print(c);
				i_b++;
			} while (i_b<ancho_b);
			
			ancho_b++;
			j++;
			System.out.println(" ");
		} while (j<0);		
	}
	
	public void tronco() {
		int j_c;int ancho_c;int i_c;int l_c;int ancho_e;int cont;
		String c ="*";
		j_c=1;
		ancho_c=3;
		ancho_e=3;
		i_c=0;
		cont=3;
		
		do {
			l_c=12;
			do {
				System.out.print(" ");
				l_c--;
			} while (l_c>ancho_e);
			do {
				System.out.print(c);
				i_c++;
			} while (i_c<ancho_c);
			cont=cont+2;
			ancho_c=ancho_c+cont;
			ancho_e++;
			j_c++;
			System.out.println(" ");
		} while (j_c<4);
	
	
	}
	
	
	
}
