package semana_6;

public class seleccion {
	public static void main(String[] args) {
		int[] arreglo={100, 34, 11, 58, 2, 120, 45, 7, 70, 23};
		System.out.println("Arreglo Original:");
		mostrarArreglo(arreglo);
		
		ordenarlista(arreglo);
		
		System.out.println("/nArreglo ordenado:");
		mostrarArreglo(arreglo);
	}
	public static void ordenarlista(int[] arreglo) {
		int numero= arreglo.length;
		for(int i=0; i<numero; i++){
			int mini = i;
			for(int j=i+1; j<numero; j++) {
				if(arreglo[j] < arreglo[mini]) {
					mini=j;
				}
			}
			if(mini !=i) {
				int temp = arreglo[i];
				arreglo[i] = arreglo[mini];
				arreglo[mini]=temp;
			}
			System.out.print("Paso " + (i+1) + ": ");
			mostrarArreglo(arreglo);
		}
		
	}
	public static void mostrarArreglo(int[] arreglo) {
		for(int i=0; i<arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}
}
