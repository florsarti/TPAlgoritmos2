import TDA_local.Cola_con_prioridad_TDA;

public class ColaConPrioridad implements Cola_con_prioridad_TDA {
	class Elemento{
		int valor;
		int prioridad;
	}
	
	Elemento[] elementos;
	int indice;
	
	@Override
	public void AcolarPrioridad(int x, int prioridad) {
		int j = indice; //Copiamos el valor del indice en la variable j
		for(; j>0 && elementos[j-1].prioridad >= prioridad;j--){ //Esta iteracion nos sirve para mover todos
			elementos[j] = elementos[j-1];                       //los elementos con prioridad mayor al nuevo
		}                                                        //elemento dado por el usuario hacia la derecha
		
		elementos[j] = new Elemento(); //Aca borramos el elemento de la posicion j
		elementos[j].valor = x; //Copiamos el valor dado por el usuario en la posicion j
		elementos[j].prioridad = prioridad; //Copiamos la prioridad del elemento x en la posicion j
		indice++; //Incrementamos el valor de indice en 1

	}

	@Override
	public void Desacolar() {
		elementos[indice-1] = null; //Borramos el valor del elemento de mayor prioridad, que es el que esta mas a la derecha
		indice--;		    //Eliminamos el ultimo elemento de la cola
	}

	@Override
	public int Primero() {
		return elementos[indice-1].valor; //Devuelve el valor de mayor prioridad
	}

	@Override
	public int Prioridad() {
		return  elementos[indice-1].prioridad; //Devuele la prioridad del valor con mas prioridad
	}

	@Override
	public boolean ColaVacia() {
		return (indice==0); //Indica si la cola esta vacia o no, comparando el valor de la variable indice
	}

	@Override
	public void InicializarCola() {
		indice = 0;//Inicializamos la variable indice
		elementos = new Elemento[100]; //Creamos una nueva cola con 100 posiciones

	}

}
