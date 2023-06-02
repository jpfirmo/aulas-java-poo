package visibilidades;

public class canetaPrincipalVisibilidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caneta_Visibilidade c1 = new Caneta_Visibilidade();
		c1.modelo = "bic crystal";
		c1.carga = 80;
		//c1.tampada = true;
		c1.destampar();
		c1.cor = "Azul";
		c1.status();
		
		
	}

}
