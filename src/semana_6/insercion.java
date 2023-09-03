package semana_6;

public class insercion {
	public static void main(String[] args) {
		int[] arreglo={100, 34, 11, 58, 2, 120, 45, 7, 70, 23};
		System.out.println("Arreglo Original:");
		mostrarArreglo(arreglo);
		
		ordenarlista(arreglo);
		
		System.out.println("/nArreglo ordenado:");
		mostrarArreglo(arreglo);
		
	}
	public static void ordenarlista(int[] arreglo) {
		int numero = arreglo.length;
		for(int i = 1; i < numero; i++) {
			int valor = arreglo[i];
			int j = i-1;
			
			while(j>=0 && arreglo[j] > valor) {
				arreglo[j+1]=arreglo[j];
				j--;
			}
			arreglo[j+1] = valor;
			System.out.println("Paso " + i + ": ");
			mostrarArreglo(arreglo);
		}
	}
	public static void mostrarArreglo(int[] arreglo) {
		for(int i=0; i < arreglo.length; i++) {
			System.out.println(arreglo [i] + " ");
		}
		System.out.println();
	}
}
