package reposo_modulo_4_unitest.juego;

import java.util.Objects;

public class Pelea {
	
	private Personaje persona1;
	private Personaje persona2;
	private Personaje ganador;
		
	
	
	public Pelea(Personaje persona1, Personaje persona2, Personaje ganador) {
		this.persona1 = persona1;
		this.persona2 = persona2;
		this.ganador = ganador;
	}



	public Personaje getPersona1() {
		return persona1;
	}



	public Personaje getPersona2() {
		return persona2;
	}



	public Personaje getGanador() {
		return ganador;
	}



	@Override
	public int hashCode() {
		return Objects.hash(ganador, persona1, persona2);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelea other = (Pelea) obj;
		return Objects.equals(ganador, other.ganador) && Objects.equals(persona1, other.persona1)
				&& Objects.equals(persona2, other.persona2);
	}



	@Override
	public String toString() {
		return "Pelea [persona1=" + persona1 + ", persona2=" + persona2 + ", ganador=" + ganador + "]";
	}
	
	
	
}
