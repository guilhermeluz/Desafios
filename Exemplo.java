import java.util.Scanner;

class Exemplo {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		long primeiroNumero;
		long segundoNumero;
		while (in.hasNextLong()) {
			primeiroNumero = in.nextLong();
			segundoNumero = in.nextLong();
			
			long hashmat, inimigo;
			
			if (primeiroNumero >= segundoNumero) {
				hashmat = segundoNumero;
				inimigo = primeiroNumero;
			} else {
				hashmat = primeiroNumero;
				inimigo = segundoNumero;
			}
			System.out.println(inimigo - hashmat);
		}
		in.close();
	}
	
}
