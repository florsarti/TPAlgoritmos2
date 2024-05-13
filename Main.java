import java.util.Scanner; // clase para leer datos por pantalla

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Instancia de Scanner
		Integer res =1;
		Integer turnos=0;
		boolean error= true;
		//valido dato a ingresar
		while(error==true) {
			System.out.println("------------- /n");
			System.out.println("Bienvenido al Banco 9 de Oro! Desea sacar un turno? (1=Si, 0= No)/n");
	        res = scanner.nextInt(); // Lee una línea de texto ingresada por el usuario
	        if(res<0||res>2) { //valido dato ingresado
	        	System.out.println("Error, tu respuesta solo puede ser 1 o 0 /n");
	        }else {
	        	//iniciar la lista c prioridad
	        	if(res==1){
	        		while(turnos<10) { //Ciclo para continuar el ingreso de datos.
	            		IngresoDatos(turnos);
	                	Continua(res);
	            	}
	        		//escenario el usuario quiere ingresar mas de 10 turnos
	        		if (turnos>10){
	        			boolean errorA= true;
	        			//valido dato
	        			while(errorA==true) {
	        			System.out.println("--------------/n Parece que no hay mas espacio para otro turno. Desea analizar los turnos? (1=Si, 0= No)");
	            		int resAT = scanner.nextInt(); //respuesta Analisis de Turnos
		            		if(resAT<0||resAT>2) { //valido dato ingresado
		                    	System.out.println("Error, tu respuesta solo puede ser 1 o 0 /n");
		            		}else {
		        					errorA=false;
		        					// Analizo datos de acuerdo a los conjuntos dados
		        			}
	            		}
	            	}
	        	}else if (turnos ==0) { //escenario el usuario no quiere sacar turnos
	        		System.out.println("--------------/n No hay turnos para analizar. Desea volver a empezar? (1=Si, 0= No)");
	        		//int emp = scanner.nextInt();
	        		//valido dato ingresado
	        	}else { //escenario el usuario tiene menos de 10 turnos y no quiere sacar mas turnos
	        		boolean errorB= true;
	    			//valido dato
	    			while(errorB==true) {
	        		System.out.println("--------------/n Desea analizar los turnos? (1=Si, 0= No)\")");
	        		int resAT = scanner.nextInt(); //respuesta Analisis de Turnos
		        		if(resAT<0||resAT>2) { //valido dato ingresado
		                	System.out.println("Error, tu respuesta solo puede ser 1 o 0 /n");
		        		}else {
		    					errorB=false;
		    					// Analizo datos de acuerdo a los conjuntos dados
		    			}
	        		}
	        	}
	        }  	
		} 
		scanner.close();
	}
	//modifico res por referencia de acuerdo a lo que quiere el usuario.
private static Integer Continua(Integer res) {
	Scanner scannera = new Scanner(System.in);
		boolean errorD= true;
		//valido dato
		while(errorD==true) {
		System.out.println("Desea continuar? (1=Si, 0= No) /n -----------/n");
		int resC = scannera.nextInt(); //respuesta contiuna
			if(resC<0||resC>2) { //valido dato ingresado
	        	System.out.println("Error, tu respuesta solo puede ser 1 o 0 /n");
			}else {
					errorD=false;
					res=resC;
			}
		}
		scannera.close(); // cierro el scanner
	return res;
	
	}
//paso turnos por parametro. tratamiento de datos
	private static void IngresoDatos(Integer turnos) {
		Scanner scanner = new Scanner(System.in);
			boolean error= true;
			//valido dato 1
			while(error==true) { // mientras haya error continua 
				System.out.println("Ingrese DNI de 8 digitos./n -----------/n");
				int dni = scanner.nextInt();
				int dniL = CuentoDigitos(dni);
				if(dniL< 8 || dniL>8) {
					System.out.println("Error, el dni que ingresaste no es valido. /n");
				}else {
					error=false;
				}
			} // termina while cuando el dato ingresado es valido.
			error= true;
			//valido dato 2
			while(error==true) { // mientras haya error continua 
				System.out.println("Ingrese su tipo de cliente (1= Empresa, 2= Particular, 3= Particular no cliente)/n -----------/n");
				int tCliente = scanner.nextInt();
				//valido dato 2
				if(tCliente<0||tCliente>3) {
					System.out.println("Error, tu respuesta solo puede ser 1, 2 o 3 /n");
				}else {
					error=false;
				}
				//Paso los datos dni y tipo de cliente a la lista con prioridad. Una vez ingresados, aumento turnos a turnos+1. Como pasa por parametro queda modificiado en la instancia principal
			}
		scanner.close(); // cierro el scanner
	}

	//funcion
	private static int CuentoDigitos(int dni) {
		return String.valueOf(dni).length();
	}

}
