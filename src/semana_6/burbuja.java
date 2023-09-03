package semana_6;


public class burbuja {
	public static void main(String[] args) {
        int[] arreglo = {100, 34, 11, 58, 2, 120, 45, 7, 70, 23};
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        
        ordenarBurbuja(arreglo);
        
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }
	public static void ordenarBurbuja(int[] arreglo) {
        int num = arreglo.length;
        boolean intercambio;
        
        for (int i = 0; i < num - 1; i++) {
            intercambio = false;
            for (int j = 0; j < num - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                    
                  
                    System.out.print("Paso " + (i + 1) + ": ");
                    imprimirArreglo(arreglo);
                }
            }
            
            
            if (!intercambio) {
                break;
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
