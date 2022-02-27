package com.canterauno;

import java.util.InputMismatchException;
import java.util.Scanner;

import Punto_Cinco.Punto_Cinco;
import Punto_Cuatro.Punto_Cuatro;
import Punto_Dos.Punto_Dos;
import Punto_Ocho.Alumno;
import Punto_Ocho.Escuela;
import Punto_Seis.Aplicacion;
import Punto_Seis.Contacto;
import Punto_Siete.Auto;
import Punto_Siete.Parqueadero;
import Punto_Tres.Punto_Tres;
import Punto_Uno.Punto_uno;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opc;
		Contacto aux;
		Auto auto;
		Alumno alum;
		Aplicacion agendatelefonica = new Aplicacion(3);
		Parqueadero invocarParqueadero = new Parqueadero(5);
		Escuela Escuelaauto = new Escuela(9);
		while (!salir) {
			System.out.println("================================");
			System.out.println("      TALLER DE CICLOS");
			System.out.println("================================");
			System.out.println("1. PIRAMIDE DE *");
			System.out.println("2. PIRAMIDE INVERTIDA");
			System.out.println("3. ARBOL DE *");
			System.out.println("4. TABLA DE MULTIPLICAR");
			System.out.println("5. SALUDO DE PERSONA");
			System.out.println("6. AGENDA DE CONTACTOS");
			System.out.println("7. PARQUEADERO");
			System.out.println("8. ESCUELA DE CONDUCCION");
			System.out.println("9. SALIR");
			
			try {
				System.out.println("Escoje la opcion");
				opc = sn.nextInt();
				
				switch (opc) {
				case 1:
					Punto_uno inf1 = new Punto_uno();
					System.out.println("Esta es la piramide");
					inf1.piramide();
					break;
				
				case 2:
					Punto_Dos inf2 =new Punto_Dos();
					System.out.println("Esta es la piramide");
					inf2.piramide();
					break;
					
				case 3:
					Punto_Tres inf3 = new Punto_Tres();
					inf3.arbolito();
					inf3.tronco();
					break;
					
				case 4:
					Punto_Cuatro inf4 = new Punto_Cuatro();
					int dato;
					Scanner dat = new Scanner(System.in);
					System.out.println("ingresa el numero a multiplicar");
					dato=dat.nextInt();
					inf4.tabla(dato);
					break;
					
				case 5:
					Punto_Cinco inf5 = new Punto_Cinco();
					boolean id=true;
					int datos;
					do {
						inf5.menu();
						Scanner variable = new Scanner(System.in);
						dato=variable.nextInt();
						id=inf5.Evaluandoopciones(dato);
					} while (id==true);
					break;
					
				case 6:
					Scanner dt = new Scanner(System.in);
					int ind = 0;
					String nom;
					int tel;
					String org;
					int num;
					do {
						System.out.println("Menu aplicacion Agenda");
						System.out.println("1-- Añadir");
						System.out.println("2-- Buscar");
						System.out.println("3-- Eliminar");
						System.out.println("4-- Salir");
						num=dt.nextInt();
					switch (num) {
					
					case 1:
						
						System.out.println("Ingrese el nombre");
						nom=dt.next();
						System.out.println("ingrese el telefono");
						tel=dt.nextInt();
						System.out.println("ingrese la organizacion");
						org=dt.next();
						aux = new Contacto(nom,tel,org);
						agendatelefonica.aniadircontacto(aux);
						agendatelefonica.mostrar();
						break;
						
					case 2:
						String nombre_B;
						System.out.println("Ingrese el nombre a buscar");
						nombre_B=dt.next();
						agendatelefonica.buscarcontacto(nombre_B);
						break;
					case 3:
						String nombre_E;
						System.out.println("Ingrese el nombre a buscar");
						nombre_E=dt.next();
						agendatelefonica.eliminarcontacto(nombre_E);
						break;	
						
					case 4:
						ind=4;
						break;
					default:
						System.out.println("Opcion incorrecta");
						System.in.read();
					}					
				} while (ind<=3);
					break;
				case 7:
					Parqueadero parqueo = new Parqueadero(5);
					Scanner parquero = new Scanner(System.in);
					int idsalir = 0;
					String nombre_cliente;
					int telefono_cliente;
					String placa;
					String marca;
					int numero;
					do {
						System.out.println("Menu Parqueadero");
						System.out.println("1-- Ingresar Vehiculo");
						System.out.println("2-- Consultar Vehiculo");
						System.out.println("3-- Sacar Vehiculo");
						System.out.println("4-- Salir");
						numero=parquero.nextInt();
					switch (numero) {
					
					case 1:
						
						System.out.println("Ingrese el nombre del propietario");
						nombre_cliente=parquero.next();
						System.out.println("ingrese el numero telefono del propietario");
						telefono_cliente=parquero.nextInt();
						System.out.println("ingrese la marca del vehiculo");
						marca=parquero.next();
						System.out.println("ingrese la placa del vehiculo");
						placa=parquero.next();
						auto = new Auto(nombre_cliente,telefono_cliente,placa, marca);
						invocarParqueadero.ingresarauto(auto);
						break;
						
					case 2:
						String placa_buscar;
						System.out.println("Ingrese la placa del auto a consultar");
						placa_buscar=parquero.next();
						invocarParqueadero.consultar(placa_buscar);
						break;
					case 3:
						String placa_E;
						System.out.println("Ingrese la placa del vehiculo a sacar");
						placa_E=parquero.next();
						invocarParqueadero.sacarvehiculo(placa_E);
						break;	
						
					case 4:
						System.out.println("SALIDA EXITOSA");
						idsalir=4;
					    break;
					default:
						System.out.println("Opcion incorrecta");
						System.in.read();
					}					
				} while (idsalir<=3);
				break;
				
				case 8:
					int Salir_E=0;
					int id_alumno = 0;
					String nombre_alumno;
					String Nota;
					int numeroopcion;
					do {
						System.out.println("==========================");
						System.out.println("MENU ESCUELA DE CONDUCCION");
						System.out.println("1-- AGREGAR ALUMNO");
						System.out.println("2-- MOSTRAR ALUMNO");
						System.out.println("3-- CONSULTAR ALUMNO");
						System.out.println("4-- RESULTADOS DEL CURSO");
						System.out.println("5-- Salir");
						System.out.println("==========================");
						numeroopcion=sn.nextInt();
						
					switch (numeroopcion) {
					
					case 1:
						
						System.out.println("Ingrese el nombre del alumno");
						nombre_alumno=sn.next();
						System.out.println("ingrese la identificacion del alumno");
						id_alumno=sn.nextInt();
						System.out.println("ingrese el resultado obtenido por el alumno SI/NO");
						Nota=sn.next();
						alum=new Alumno(nombre_alumno, id_alumno, Nota);
						Escuelaauto.AgregarAlumno(alum);
						break;
						
					case 2:
						Escuelaauto.mostrar();
						break;
						
					case 3:
						int cud;
						System.out.println("INGRESE LA CEDULA DEL ALUMNO A BUSCAR");
						cud=sn.nextInt();
						Escuelaauto.buscaralumno(cud);
						break;
						
					case 4:
						Escuelaauto.mostraraprobados();
						break;
						
					case 5:
						System.out.println("SALIDA EXITOSA");
						Salir_E=4;
						break;
						
					default:
						System.out.println("Opcion incorrecta");
						System.in.read();
					}					
				} while (Salir_E<=3);					
					break;
					
				case 9:
					System.out.println("salida exitosa");
					salir=true;
					break;
					
				default:
					System.out.println("solo numeros entre 1 y 6");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("debes insertar un numero");
				sn.next();
			}
			
		}
		System.exit(0);

	}

}
