package reposo_modulo_4_unitest.juego;

public class DbJuegoMysql implements DbJuego {

	@Override
	public boolean guardarPelea(Pelea pelea) {
		System.out.println("LaPelea fue registrada en db mysql");
		return true;
	}

}
