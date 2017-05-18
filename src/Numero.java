

public class Numero {

	public void obtenerNumeros(int cantidad) {
		int contador = 1, p = 2, d = 2;
		while (contador <= cantidad) {
			if (p % d == 0) {
				if (p == d) {
					int num_inv, div_entera, resto_div;
					num_inv = 0;
					div_entera = p;
					resto_div = 0;
					while (div_entera != 0) {
						resto_div = div_entera % 10;
						div_entera = div_entera / 10;
						num_inv = num_inv * 10 + resto_div;
					}
					if (p == num_inv) {
						System.out.println("El numero primo numero " + contador + " es: " + p);
						contador++;
					}
				}
				d = 2;
				p++;
			} else
				d++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero n = new Numero();
		n.obtenerNumeros(20);
	}

}
