package interfaces;

public interface ConjuntoTDA {
	void InicializarConjunto(); //sin precondiciones
	void Agregar(int x); //inicializado
	void Sacar(int x); //inicializado y no vacio
	int Elegir(); //inicializado
	boolean ConjuntoVacio(); //inicializado
	boolean Pertence(int x); //inicializado
}
