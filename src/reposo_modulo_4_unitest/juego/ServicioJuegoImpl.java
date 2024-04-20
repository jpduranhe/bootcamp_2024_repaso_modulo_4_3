package reposo_modulo_4_unitest.juego;

public class ServicioJuegoImpl implements ServicioJuego {
	
	private DbJuego juego;
		
	
	public ServicioJuegoImpl(DbJuego juego) {
		this.juego = juego;
	}

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
		
		if(victima.getVida()==0) {
			Pelea pelea= new Pelea(atacante,victima,atacante);
			boolean resultado= juego.guardarPelea(pelea);
			//System.out.println(resultado);
		}
		
		
	}
	
	public void revivir(Personaje victima) {
		victima.setVida(100);
		System.out.println("El personaje "+victima.getNombre()+" ha sido REVIVIDO");
	}

}
