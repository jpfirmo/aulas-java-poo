package criando_classes_e_objetos;

public class Caneta {
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("cor da caneta: " + this.cor);
		System.out.println("caneta está tampada? " + this.tampada);
		System.out.println("tamanho da ponta: " + this.ponta);
		System.out.println("modelo da caneta: " + this.modelo);
		System.out.println("carga: " + this.carga);
	}
	
	void rabiscar() {
		if(tampada == true) {
			System.out.println("não dá pra escrever");
		}else {
			System.out.println("estou rabiscando");
		}
	}

	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	
}
