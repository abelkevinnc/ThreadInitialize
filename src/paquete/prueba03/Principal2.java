package paquete.prueba03;

//optimizado, mientras se ejecuta el metodo imprimirLista en su propio hilo podemos hacer otras operaciones
public class Principal2 {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.imprimirListaMejorado();
		//este proceso se ejecuta concurrentemente
		System.out.println("puedo estar haciendo algo hasta esperar la impresion de la lista");

	}

}
