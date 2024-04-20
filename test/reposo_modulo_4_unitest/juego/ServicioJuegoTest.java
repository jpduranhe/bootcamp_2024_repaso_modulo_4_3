package reposo_modulo_4_unitest.juego;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class ServicioJuegoTest {
	
	ServicioJuegoTest(){
		MockitoAnnotations.initMocks(this);
	}
	 
	ServicioJuego objServicioJuego;
	DbJuegoMysql dbJuego;
	@BeforeEach
	void setUp() {
		
		dbJuego= Mockito.mock(DbJuegoMysql.class);
					
		Mockito.when(dbJuego.guardarPelea(any(Pelea.class))).thenReturn(true);
		
		objServicioJuego= new ServicioJuegoImpl(dbJuego);
	}

	@Test
	void testAtacar() {
		
		Personaje player1= new Personaje("Lario",100,32,50);
		Personaje player2= new Personaje("Muigui",100,64,54);
		
		objServicioJuego.atacar(player1, player2);
		
		int vidaRestantePlayer2=player2.getVida();
		assertEquals(68,vidaRestantePlayer2);
		verify(dbJuego,never()).guardarPelea(any(Pelea.class));
	}
	
	@Test
	void testVidaSeaCero() {
		
		Personaje player1= new Personaje("Lario",100,32,50);
		Personaje player2= new Personaje("Muigui",28,64,54);
		
		objServicioJuego.atacar(player1, player2);
		
		int vidaRestantePlayer2=player2.getVida();
		assertEquals(0,vidaRestantePlayer2);
		verify(dbJuego).guardarPelea(any(Pelea.class));
	}
	
	@Test
	void testVidaSeaCeroCuandoFallaDbPelea() {
		
		Mockito.when(dbJuego.guardarPelea(any(Pelea.class))).thenThrow( new NullPointerException());
		
		Personaje player1= new Personaje("Lario",100,32,50);
		Personaje player2= new Personaje("Muigui",28,64,54);
		
		
		assertThrows(NullPointerException.class, ()->objServicioJuego.atacar(player1, player2));
		
	}
	
	@Test
	void testRevivir() {
		
		Personaje player1= new Personaje("Lario",0,32,50);
		
		objServicioJuego.revivir(player1);
		
		assertEquals(100,player1.getVida());
	}

}


