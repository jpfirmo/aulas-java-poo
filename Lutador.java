package relacionamento_entre_classes;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double peso;
	private double altura;
	private String categoria;
	private int vitorias;
	private int empates;
	private int derrotas;
	
	public Lutador(String nome, String nacionalidade, int idade, double peso, double altura, 
			int vitorias, int empates, int derrotas) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.setPeso(peso);
		this.altura = altura;
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
	}
	
	public void apresentar() {
		System.out.println("----------------------------------------------");
		System.out.println("CHEGOU A HORA! apresentando o lutador " + this.getNome());	
		System.out.println("diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
		System.out.println("pesando: " + this.getPeso() + " kg");
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getEmpates() + " empates");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println("----------------------------------------------");
		
	}
	
	public void status() {
		System.out.println(this.getNome() + " é peso " + this.getCategoria());
		System.out.println("venceu " + this.getVitorias() + " vezes");
		System.out.println("empatou " + this.getEmpates() + " vezes");
		System.out.println("derrotou " + this.getDerrotas	() + " vezes");
		
		
		
	}
	public void ganharluta() {
	this.setVitorias(this.getVitorias() + 1);	
	}
	public void empatarluta() {
	this.setEmpates(this.getEmpates() + 1);	
	}
	public void perderluta() {
	this.setDerrotas(this.getDerrotas() + 1);	
	}
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if(this.peso <= 52.2) {
			this.categoria = "inválido";
		}
		else if(this.peso <= 70.3) {
			this.categoria = "peso leve";
		}
		else if(this.peso <= 83.9) {
			this.categoria = "peso médio";
		}
		else if(this.peso <= 120.2) {
			this.categoria = "peso pesado";
		}else {
			this.categoria = "inválido";
		}
		
		
	}
	
	
	
}
