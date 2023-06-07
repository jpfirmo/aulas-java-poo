package ExemploPratico;

import java.util.Scanner;

public class BancoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
	    Banco conta1 = new Banco();
	    
	    conta1.setNumconta(1234);
	    conta1.setDonoconta("joão pedro");
	    conta1.abrirconta("cc");
	    conta1.depositar(100);
	    conta1.estadoconta();
	    
	    sc.nextLine();
	    
	    Banco conta2 = new Banco();
	    conta2.setNumconta(2347);
	    conta2.setDonoconta("fernando");
	    conta2.abrirconta("cp");
	    conta2.depositar(500);
	    conta2.sacar(650);
	    conta2.fecharconta();
	    conta2.estadoconta();
	   
	    
	    
	}

}
