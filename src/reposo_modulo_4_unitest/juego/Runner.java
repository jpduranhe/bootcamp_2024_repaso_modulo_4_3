package reposo_modulo_4_unitest.juego;

public class Runner {

	public static void main(String[] args) {

		ServicioJuego objServicioPelea= new ServicioJuego();
		int vidaInicial=100;
		
		Personaje player1= new Personaje("Lario",vidaInicial,32,50);
		Personaje player2= new Personaje("Muigui",vidaInicial,64,54);
		
		
		
		System.out.println(player2);
		System.out.println(player1);
		objServicioPelea.atacar(player1, player2);
	
		objServicioPelea.atacar(player1, player2);
		
		
		objServicioPelea.atacar(player2, player1);
		
		
		objServicioPelea.atacar(player1, player2);
		
		objServicioPelea.atacar(player2, player1);
		
		objServicioPelea.atacar(player1, player2);
		
		objServicioPelea.atacar(player2, player1);		
		
		
		System.out.println(player2);
		System.out.println(player1);
		
		System.out.println("reviviendo a "+player1);
		objServicioPelea.revivir(player1);
		System.out.println(player1);
	}

}
