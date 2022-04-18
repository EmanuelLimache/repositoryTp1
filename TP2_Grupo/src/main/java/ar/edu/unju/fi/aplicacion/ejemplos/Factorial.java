package ar.edu.unju.fi.aplicacion.ejemplos;

public class Factorial {
		public int calcularFatorial(int numero) {
			int numeroFactorial=1;
			for (int i=1; i<=numero;i++) {
				numeroFactorial=numeroFactorial*i;
			}
			return numeroFactorial;
		}
}
