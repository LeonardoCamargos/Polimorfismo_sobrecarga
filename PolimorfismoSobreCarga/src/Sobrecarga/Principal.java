package Sobrecarga;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		
		c.reagir("Olá");
		c.reagir(true);
		c.reagir(5, 2);
		c.reagir(22, 30);
	}

}
