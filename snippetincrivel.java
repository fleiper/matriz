package quinzemaio;

public class snippetincrivel {

	public static void main(String[] args) {
		String frase = "Aprender Java é divertido!";
		int tamanho = frase.length(); //tamanho = 25
		System.out.println("tamanho da frase: "+ tamanho);

		String name = "fellipe raszejas";
		char letra = name.charAt (7); //letra = 'a'
		System.out.println("oitavo caractere: " + letra);
 

		String cidade = "são paulo";
		String bairro = cidade.substring(0, 9); // bairo=paulista
		System.out.println("bairro:"+ bairro);
	
		String palavra1 = "Olá";
		String palavra2 = "Olá";
		
		if (palavra1.equals(palavra2)) {
			System.out.println("OH meu deus, as palavras são iguais");
			
			String texto = "";
			System.out.println(texto.isEmpty());
			
					String fruta1 = "abacaxi";
					String fruta2 = "banana";
					
					int comparacao = fruta1.compareTo(fruta2);
					System.out.println(comparacao);
					
					//TUTORIAL
					//  <0 : abacaxi vem antes
					//  ==0: frutas iguais
					// >0; banana vem antes
		}
	}
}