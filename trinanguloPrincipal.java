package criando_classes_e_objetos;

import java.util.Scanner;

public class trinanguloPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		trianguloBin t = new trianguloBin();
		
		System.out.println("informe os lados do triângulo");
		t.xa = sc.nextDouble();
		t.xb = sc.nextDouble();
		t.xc = sc.nextDouble();
		
		System.out.println("o valor do perimetro é: " + t.perimetro());
		System.out.println("o valor da area é: " + t.area());
		
		
		
	}

}
