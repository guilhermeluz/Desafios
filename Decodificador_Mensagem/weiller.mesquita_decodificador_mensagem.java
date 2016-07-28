import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
class Desafio1 {

	public static void main(String[] args) throws FileNotFoundException{

		Scanner scanner = new Scanner(new FileReader("arquivo.txt")).useDelimiter("\\n");
		char[] entradaCodificada;
		StringBuilder builder;

		while(scanner.hasNext()){
			entradaCodificada = scanner.next().toCharArray();
			builder = new StringBuilder();	
		
			for(char a : entradaCodificada){
				builder.append((char)(a - 7));
			}

			System.out.println(builder);	
		}
	}
}
