package criando_classes_e_objetos;

import java.util.Scanner;

public class aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.ponta = 0.5;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		sc.nextLine();
		
		Caneta c2 = new Caneta();
		c2.modelo = "bic";
		c2.cor = "vermelha";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		
		
		
		
	}

}
