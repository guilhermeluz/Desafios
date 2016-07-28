package br.rmc.decodificador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RafaelCorvalao_DecodificadorMensagem {

	public static void main(String[] args) {
		// Validacao do parametro de entrada.
		if (args.length < 1) {
			System.out.println("Um caminho/nome de arquivo contendo a mensagem codificada deve ser informado!");
			return;
		}
		System.out.println("DecodificadorPorDeslocamento ..." + args[0]);
		
		// Encontrar o arquivo e abrir-lo
		String fileName = args[0];
		FileReader file;
		try {
			file = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Caminho/Nome do arquivo não encontrado - " + fileName);
			return;
		}
		
		// Leitura, decodificacao e apresentacao da mensagem.
		BufferedReader lerArquivo = new BufferedReader(file);
		String mensagemCodificada;
		try {
			mensagemCodificada = lerArquivo.readLine();
			while (mensagemCodificada != null) {
				System.out.println(decodificarLinha(mensagemCodificada));
				mensagemCodificada = lerArquivo.readLine();				
			}
			
			file.close();
		} catch (IOException e) {
			System.out.println("Problema ao ler arquivo!!!");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Decodifica uma linha inteira da mensagem.
	 * 
	 * @param linhaCodificada
	 * @return linha decodificada
	 */
	private static String decodificarLinha(String linhaCodificada) {
		StringBuilder linhaDecodificada = new StringBuilder();
		for (int i = 0; i < linhaCodificada.length(); i++) {
			linhaDecodificada.append(decodificar(linhaCodificada.charAt(i)));
		}
		return linhaDecodificada.toString();
	}
	
	/**
	 * Executa o calculo para decodificacao o caracter.
	 * 
	 * @param charCodificado
	 * @return caracter decodificado
	 */
	private static char decodificar(char charCodificado) {
		int intCodificado = (int) charCodificado;
		int intDecodificado = intCodificado - 7;
		return (char) intDecodificado;
	}
	
	//Metodo de teste para descobri a logica de decodificacao
	protected static void testeCaracteres() {
		String codificado   = "'lizlyo";
		String decodificada = " ebserh";
		
		char character;
		char character1;
		for (int i = 0; i < codificado.length(); i++) {
			character = codificado.charAt(i);
			character1 = decodificada.charAt(i);
			System.out.println("->Cod" + character + " > " + (int) character + " DeCod" + character1 + " > " + (int) character1);			
		}
		
		String mensagemCodificada[] = { "1'V'HNO\'l'v'tlsovy'zpz{lth'kh'lizlyo"
				, "1'Hwspjh{p}v'kl'nlz{hv'ovzwp{hshy'kh'lizlyo'l'v'thpz'|zhkv'uv'iyhzps"
				//, "1'V'zvm{~hyl'kl'nlz{hv'ovzwp{hshy'kh'lizlyo'l'v'HNO\"
		} ;
		
		
		for (int i = 0; i < mensagemCodificada.length; i++) {
			System.out.println(decodificarLinha(mensagemCodificada[i]));
		}		

	}

}
