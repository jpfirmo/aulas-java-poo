package Getters_And_Setters;

public class Caneta_get_set {

	public String modelo;
	private double ponta;
	public String cor;
	private boolean tampada;
	
	
		
	public Caneta_get_set(String modelo, double ponta, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampar();
	}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("modelo da caneta: " + this.getModelo());
		System.out.println("ponta da caneta: " + this.getPonta());
		System.out.println("cor da caneta: " + this.cor);
		System.out.println("está tampada: " + this.tampada);
	}
	
	
}
