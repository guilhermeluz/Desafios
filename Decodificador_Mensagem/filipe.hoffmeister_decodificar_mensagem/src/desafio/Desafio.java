package desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Desafio {
		public static int codASC;	
		
		public static String descriptografar (String param){
			String descriptografado = "";	
			char c;		
			for (int countChar = 0; countChar <= param.length()-1; countChar++){	
				codASC = param.charAt(countChar)-7;
				c = (char)codASC;
				descriptografado += Character.toString(c);			
			}
			return descriptografado;
		}	
	
		public static void main(String[] args) throws IOException {
			Scanner entrada = new Scanner (System.in);
			System.out.print("Digite o caminho do arquivo: ");
			String nome = entrada.nextLine(); 
			entrada.close();
			
			
			BufferedReader br = new BufferedReader(new FileReader(nome));
			while(br.ready()){
			   String linha = br.readLine();
			   System.out.println("Criptografado: " + linha);
			   System.out.println("Descriptografado: " + descriptografar(linha));
			}
			br.close();
		}
}
