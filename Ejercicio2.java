
public class Ejercicio2 {
		static int[] enteros = new int[10];
		static String[] resultados = new String[10];
		
		public static void main(String[] args) {

			rellenarEnteros();
			imprimirFizzBuzz();
			
		}
		
		public static void rellenarEnteros() {
			enteros[0] = 30;
			enteros[1] = 2;
			enteros[2] = 57;
			enteros[3] = 4;
			enteros[4] = 5;
			enteros[5] = 6;
			enteros[6] = 7;
			enteros[7] = 10;
			enteros[8] = 9;
			enteros[9] = 15;
		}
		
		public static void imprimirFizzBuzz() {
			for(int i = 0; i < enteros.length; i++) {
				String numero = String.valueOf(enteros[i]);
				if(enteros[i] % 5 == 0 && enteros[i] % 3 == 0) { 
					resultados[i] = "FizzBuzz";
				} else if(enteros[i] % 5 == 0|| numero.contains("5")) { 
					resultados[i] = "Buzz";
				} else if (enteros[i] % 3 == 0|| numero.contains("3")) {
					resultados[i] = "Fizz";
				} else {
					resultados[i] = numero + " no cumple con ninguna condicion";
				}
			}
			
			for(int i = 0; i < resultados.length; i++) {
				System.out.println(resultados[i]);
			}
		}
		
	}