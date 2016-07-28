
class Decodificador {

	public static void main(String[] args) {
		
		String mensagem1 = "1'V'HNO\\'l'v'tlsovy'zpz{lth'kh'lizlyo";
		String mensagem2 = "1'Hwspjh{p}v'kl'nlz{hv'ovzwp{hshy'kh'lizlyo'l'v'thpz'|zhkv'uv'iyhzps";
		String mensagem3 = "1'V'zvm{~hyl'kl'nlz{hv'ovzwp{hshy'kh'lizlyo'l'v'HNO\\";
		String mensagens[] = {mensagem1, mensagem2, mensagem3};
		for (int i = 0; i < mensagens.length; i++) {
			decodificar(mensagens[i]);
			System.out.println("");
		}
		
	}

	private static void decodificar(String mensagem) {
		for (int i = 0; i < mensagem.length(); i++) {
			int ascii = (int) mensagem.charAt(i);
			char text = (char) (ascii - 7);
			System.out.print(text + " ");
		}
	}

}

