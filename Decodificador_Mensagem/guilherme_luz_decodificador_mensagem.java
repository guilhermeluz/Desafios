import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;



class Main {

	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		DataOutputStream output = new DataOutputStream(System.out);
		long inicio = System.currentTimeMillis();
		int caracter;
		while ((caracter = input.read()) != -1){
			output.write((Character.isWhitespace((char)caracter) ? caracter : (caracter-7)));
		}
		long fim = System.currentTimeMillis();
		System.out.println(fim - inicio);
	}
	
}
