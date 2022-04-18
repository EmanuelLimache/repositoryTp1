package ar.edu.unju.fi.aplicacion.ejemplos;
import java.util.Scanner;

public class PrincipalPunto1 {

	public static void main(String[] args) {
		//hi
		Scanner leer = new Scanner(System.in);
		boolean band=true;
		int numero=0;
		int resultado;
			while(band==true) {
					System.out.println("Ingrese un numero");
					numero = leer.nextInt();
					if (numero>=0 && numero <11) {	
					band=false;
				}
			}
			leer.close();
		
			Factorial calcular= new Factorial();
			resultado=calcular.calcularFatorial(numero);
			System.out.println("El factorial de "+numero+" es: "+resultado);
		}
	}

