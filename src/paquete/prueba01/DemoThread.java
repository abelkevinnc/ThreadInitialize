package paquete.prueba01;

// demostracion de una clase thread con herencia
public class DemoThread extends Thread {
	private String nombre;

	public DemoThread(String nombre) {
		this.nombre = nombre;
	}

	public void run() {
		try {
			int x = (int) (Math.random() * 5000);
			Thread.sleep(x);
			System.out.println("Soy: " + nombre + " (" + x + ")");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DemoThread t1 = new DemoThread("Pedro");
		DemoThread t2 = new DemoThread("Pablo");
		DemoThread t3 = new DemoThread("Juan");
		// es importante llamar al metodo start y no al metodo run
		t1.start();
		t2.start();
		t3.start();
	}
}