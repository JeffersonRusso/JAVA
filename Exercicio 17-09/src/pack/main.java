package pack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro("Cachorro", "au au", 15, false);
		Cavalo cavalo = new Cavalo ("cavalo", "barulho de cavalo", 20, false);
		Preguica preguica = new Preguica ("preguiça", "barulho de preguiça", 21, false);
		
		Animal ani = new Preguica("teste", "teste", 14, false);
		
		ani.emitirSom();
		
		
		
		 Animal [] animal = new Animal[3];
		 animal[0] = cachorro;
		 animal[1] = cavalo;
		 animal[2] = preguica;
		 
		 
		 for (Animal animal2 : animal)
			 	animal2.emitirSom();
	}

}
