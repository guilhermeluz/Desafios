package br.desafio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Decodificador {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			// le o arquivo recebido por parametro
			FileInputStream stream = new FileInputStream(args[0]);
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader br = new BufferedReader(reader);
			String linha = br.readLine();
			while(linha != null) {
				// para cada caracter do arquivo
				for(int i=0; i < linha.length(); i++) {
					// obtem o vlr decimal do caracter, diminui 7,
					// transforma em sinal grafico e imprime na tela
					System.out.print((char)(linha.charAt(i)-7));
				}
				linha = br.readLine();
				System.out.print("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
