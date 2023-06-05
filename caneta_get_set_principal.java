package Getters_And_Setters;

import java.util.Scanner;

public class caneta_get_set_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ponta tem visibilidade privada.
		//c1.ponta = 0.5;
		Scanner sc = new Scanner(System.in);
		
		Caneta_get_set c1 = new Caneta_get_set("BIC", 0.4, "azul");
		c1.status();
		
		sc.nextLine();
		
		Caneta_get_set c2 = new Caneta_get_set("pentel", 0.5 ,"vermelho");
		c2.status();
	}

}
