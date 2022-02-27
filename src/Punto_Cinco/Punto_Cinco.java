package Punto_Cinco;

import java.io.IOException;
import java.util.Scanner;

public class Punto_Cinco {
	
	public static String Var_nombre;
	
	public void menu() {
		System.out.println("Menu usuario");
		System.out.println("1-- Capturar nombre");
		System.out.println("2-- Saludar persona");
		System.out.println("3-- SALIR");
	}
	
	
	
	public static boolean Evaluandoopciones(int num) throws Exception {
		switch (num) {
		case 1:
			Scanner nombre = new Scanner(System.in);
			System.out.println("Ingresa tu Nombre");
			Var_nombre = nombre.next();
			
			return true;
			
		case 2:
			System.out.println("Hola "+ Var_nombre +" Bienvenido ");
			return true;
			
		case 3:
			return false;
		default:
			System.out.println("Opcion incorrecta");
			System.in.read();
		}
		return true;
	}
	

	
	

}
