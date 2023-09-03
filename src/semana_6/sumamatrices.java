package semana_6;

public class sumamatrices {
	public static void main(String[] args) {
		int[][] matriz1 = {{7,5,3},{6,5,8},{3,2,9}};
		int[][] matriz2 = {{9,8,7},{6,5,6,4},{3,2,1}};
		
		int[][] resultado = sumarmatriz(matriz1, matriz2);
		
		System.out.println("Matriz 1:");
		mostrarMatriz(matriz1);
		
		System.out.println("\nMatriz 2");
		mostrarMatriz(matriz1);
		
		System.out.println("\nResultado de la suma:");
		mostrarMatriz(resultado);
	}
	public static int[][] sumarmatriz(int[][] matriz1, int[][] matriz2){
		int filas = matriz1.length;
		int columnas = matriz1[0].length;
		
		int[][] resultado = new int[filas][columnas];
		for(int i=0; i < filas; i++) {
			for(int j= 0; j < columnas; j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return resultado;
	}
	public static void mostrarMatriz(int[][] matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		for(int i=0; i < filas; i++) {
			for(int j=0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
		}
		System.out.println();
		}
	}
}
