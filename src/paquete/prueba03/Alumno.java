package paquete.prueba03;

public class Alumno {
	public void imprimirLista() {
		try {
			Thread.sleep(5000); //dormimos 5 segundos
			System.out.println("imprimo una lista de alumnos");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void imprimirListaMejorado() {
		TareaImprimirLista tarea = new TareaImprimirLista();
		tarea.start();
	}
	
	//este es un inner class
	class TareaImprimirLista extends Thread {

		@Override
		public void run() {
			try {
				Thread.sleep(5000); //dormimos 5 segundos
				System.out.println("imprimo una lista de alumnos");
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		
	}
}
