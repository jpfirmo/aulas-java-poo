package visibilidades;

public class Caneta_Visibilidade {

	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("cor da caneta: " + this.cor);
		System.out.println("caneta está tampada? " + this.tampada);
		System.out.println("tamanho da ponta: " + this.ponta);
		System.out.println("modelo da caneta: " + this.modelo);
		System.out.println("carga: " + this.carga);
	}
	
	public void escrever() {
		if(tampada == true) {
			System.out.println("não dá pra escrever");
		}else {
			System.out.println("escrevendo");
		}
	}

	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

}
