package ExemploPratico;

public class Banco {
	
	public int numconta;
	protected String tipo;
	private String donoconta;
	private double saldo;
	private boolean status;
	
	public void estadoconta() {
		System.out.println("----------------------------------------");
		System.out.println("número da conta: " + this.getNumconta());
		System.out.println("tipo da conta: " + this.getTipo());
		System.out.println("nome do dono da conta: " + this.getDonoconta());
		System.out.println("saldo da conta: " + this.getSaldo());
		System.out.println("status da conta: " + this.getStatus());
		return;
	}
	
	public Banco() {
		this.saldo = 0;
		this.status = false;
	}

	public int getNumconta() {
		return numconta;
	}

	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDonoconta() {
		return donoconta;
	}

	public void setDonoconta(String donoconta) {
		this.donoconta = donoconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirconta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo.equalsIgnoreCase("CC")) {
			this.setSaldo(50);
		}
		else if(tipo.equalsIgnoreCase("CP")){
			this.setSaldo(150);	
		}
		System.out.println("conta aberta com sucesso");
	}
	
	public void fecharconta() {
		if(this.getSaldo() > 0) {
			System.out.println("você não pode fechar a conta porque você ainda tem saldo na sua conta");
		}
		else if(this.getSaldo() < 0) {
			System.out.println("você não pode fechar a conta porque sua conta está negativada");
		}else {
			this.setStatus(false);
			System.out.println("conta fechada com sucesso");
		}
		
	}
	public void depositar(double valor) {
	    
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);	
	System.out.println("deposito realizado com sucesso na conta de " + getDonoconta());
		}else {
			System.out.println("impossível depositar");
		}
		
	}
	
	public void sacar(double valor) {
		if(this.getStatus() ) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("saque realizado na conta de " + this.getDonoconta());
			}else {
				System.out.println("saldo insuficiente para saque");
			}
		}else {
			System.out.println("impossível sacar");
		}
		
	}
	
	public void pagarmensal() {
		double valormensal = 0;
		if(this.getTipo().equalsIgnoreCase("CC")) {
			valormensal = 12;
		}
		else if(this.getTipo().equalsIgnoreCase("CP")) {
			valormensal = 20;
		}
		if(this.getStatus()	) {
			if(this.getSaldo() > valormensal) {
				this.setSaldo(this.getSaldo() - valormensal);
				System.out.println("mensalidade paga com sucesso por: " + this.getDonoconta());
			}else {
				System.out.println("impossível pagar");
			}
			
		}
		
			
	}
		
	
	
	
	
	
	
	

}
