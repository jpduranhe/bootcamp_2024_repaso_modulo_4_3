package reposo_modulo_4_unitest.juego;

import java.util.Objects;

public class Personaje {
	
	private String nombre;
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



	@Override
	public int hashCode() {
		return Objects.hash(ataque, defensa, nombre, vida);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return ataque == other.ataque && defensa == other.defensa && Objects.equals(nombre, other.nombre)
				&& vida == other.vida;
	}
	
	
	
	
	
}
