package quinzemaio;
import java.util.Scanner;
public class again {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int soma=0, valor=0;
		int m [][] = new int [5][5];
		for (int i =0; i<5; i++) {
			for (int j =0; j<5; j++) {
				valor = (int)Math.round(Math.random()*2);
				if (valor %2 ==0) {
					m[i][j] = valor;
					soma = soma + m[i][j];

				}
			}
		}
		
		for (int i = 0; i<5; i++) {
			for (int j =0; j<5; j++) {

				System.out.println("valores são "+valor+"e os pares são"+m[i][j]);
				
			}
		}
		System.out.println("e a soma dos valores é de" + soma);
		ler.close();
	}
}


