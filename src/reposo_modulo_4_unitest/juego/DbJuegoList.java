package reposo_modulo_4_unitest.juego;

import java.util.ArrayList;
import java.util.List;

public class DbJuegoList implements DbJuego {
	
	private List<Pelea> listadoPelea= new ArrayList();

	@Override
	public boolean guardarPelea(Pelea pelea) {
		System.out.println("LaPelea fue registrada en db");
		return listadoPelea.add(pelea);
	}

}
