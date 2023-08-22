package relacionamento_entre_classes;

public class ultra_emoji_combat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lutador l[] = new Lutador [6]; 
				l[0] = new Lutador("Pretty Boy", "França", 31, 68.9, 1.75, 11, 6, 3);
				l[1] = new Lutador("putscript" , "Brasil", 29, 57.8, 1.69, 14, 3, 5);
				l[2] = new Lutador("Snapshadow", "EUA", 35, 80.9, 1.65, 12, 2, 1);
				l[3] = new Lutador("Dead Code", "Australia", 31, 81.6, 1.93, 13, 0, 2);
				l[4] = new Lutador("UFOcobol", "Brasil", 28, 119.3, 1.70, 5, 4, 3);
				l[5] = new Lutador("Nerdaart", "EUA", 25, 105.7, 1.71, 12, 2, 4);
				
				l[5].perderluta();
				l[5].ganharluta();
				l[5].apresentar();
				l[5].status();

		
		
	}

}
