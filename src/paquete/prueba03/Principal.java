package paquete.prueba03;

//no optimizado, mientras se imprime la lista(que tarda 5 segundos) se debe hacer otras operaciones
public class Principal {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.imprimirLista();
		//hasta que el metodo imprimirLista() no termine de ejecutarse 
		System.out.println("soy una operacion que espera..."); 

	}

}
