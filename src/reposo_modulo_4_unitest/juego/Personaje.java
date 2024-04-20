package reposo_modulo_4_unitest.juego;

public class Personaje {
	
	private String nombre;
	private String tipo;
	private int vida;
	private int ataque;
	private int defensa;
	
	public Personaje(String nombre,  int vida, int ataque, int defensa) {
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida=vida;
	}



	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa="
				+ defensa + "]";
	}
	
	
	
}
