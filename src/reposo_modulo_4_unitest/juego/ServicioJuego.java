package reposo_modulo_4_unitest.juego;

public class ServicioJuego {
	
	
	public void atacar(Personaje atacante,Personaje victima) {
		
		int ataque=atacante.getAtaque();
		int vidaVictima= victima.getVida();
		int danioRecibido=0;
		
		if(vidaVictima >= ataque ){	
			danioRecibido=vidaVictima-ataque;
		}
		System.out.println("El personaje "+victima.getNombre()+" ha sido atacado con "+ataque);
		victima.setVida(danioRecibido);
		
		if(vidaVictima==0) {
			System.out.println("El personaje "+victima.getNombre()+" ha sido DERROTADO");
		}		
		
	}
	
	public void revivir(Personaje victima) {
		victima.setVida(100);
		System.out.println("El personaje "+victima.getNombre()+" ha sido REVIVIDO");
	}

}
