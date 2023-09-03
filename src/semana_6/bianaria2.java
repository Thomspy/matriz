package semana_6;

import java.util.ArrayList;
import java.util.List;

public class bianaria2 {
	public static int busqueda(List<Integer> lista, int numero) {
		int izquierda = 0;
		int derecha = lista.size()-1;
		
		while(izquierda <= derecha) {
			int medio = izquierda + (derecha-izquierda)/2;
			
			if(lista.get(medio)==numero) {
				return medio;
			}else if (lista.get(medio)< numero) {
				izquierda = medio +1;
			}else {
				derecha = medio -1;
			}
		}
		int posicion = izquierda;
		lista.add(posicion,numero);	
		return posicion;
	}
	 public static void main(String[] args) {
		 List<Integer> listaOrdenada = new ArrayList<>();
		 listaOrdenada.add(1);
		 listaOrdenada.add(3);
		 listaOrdenada.add(5);
		 listaOrdenada.add(7);
		 listaOrdenada.add(9);
		 
		 int buscarnum= 2;
		 int lugar= busqueda(listaOrdenada, buscarnum);
		 System.out.println("La posicion de " + buscarnum + " en la lista es: " + lugar);
		 System.out.println("La lista actualizada es: "+ listaOrdenada);
		 
	}
}
