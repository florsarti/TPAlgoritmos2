package implementador_TP;

import interfaces.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {
	int[] a; 	//declaro el arreglo a, donde se van a guardar los valores del conjunto
	int cant; 	//declaro variable cant, el cual me indica la cantidad de elementos que hay en el arreglo

	@Override
	public void InicializarConjunto() {
		a = new int[100]; 	//inicializo el arreglo
		cant = 0;			//inicializo cant en 0
	}

	@Override
	public void Agregar(int x) {
		if (!this.Pertence(x)) {	//Si el elemento x no forma parte del conjunto, 
			a[cant] = x;			//se lo va a agregar en la posición cant
			cant++;					//incremento cant en uno
		}
	}

	@Override
	public void Sacar(int x) {
		int i = 0;					//Se declara y se inicializa la variable i
		while(i<cant && a[i]!=x) {	//Mientras que el valor pasado por parametro sea distinto a lo que se encuentra en la
									//posición i del arreglo, es decir , mientras que no se encuentre x en el conjunto
			i++;					//i aumenta 1.
		}
		if(i<cant) {				//Si se encontro el elemento x en el arreglo, i va a ser menor a cant
			a[i] = a[cant-1];		//Al valor que esta en la posición i del arreglo se lo va a guardar en la ultima posición  
			cant--;					//del arreglo, luego se descrementa cant, por lo cual el valor es eliminado
		}
	}

	@Override
	public int Elegir() {
		return a[cant-1];   			//Devuelve el último elemento del arreglo, que se encuentra en la posición cant - 1
	}

	@Override
	public boolean ConjuntoVacio() {
		return cant==0;					//Devuelve true si el conjunto esta vacio, es decir, si cant == 0
	}

	@Override
	public boolean Pertence(int x) {
		int i = 0;
		while(i<cant && a[i]!=x) { //Si no se encuentra el elemento x en la posición i del arreglo, i aumenta 1.
			i++;
		}
		return (i<cant); 			// Si el elemento pertenece al conjunto, el ciclo while va a ejecutarse menos veces que 
									// cant, por lo que va a devolver true. Pero, si el elemento x no pertenece al conjunto
									// i se va a ejecutar mas veces que cant
	}

}
