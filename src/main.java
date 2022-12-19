
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		if (esPar(i)) {
			System.out.println("i: " + i);
		}
		System.out.println("i: " + i);
		saludar("Juan");
	}
	public static void saludar(String name) {
		System.out.println("Hola: " + name);
	}

	public static boolean esPar(int i) {
		return i%2==0;
	}

}