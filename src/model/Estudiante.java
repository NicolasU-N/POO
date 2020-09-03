package model;

import java.util.List;

public class Estudiante extends Persona {

	private String idEstudiante;

	public Estudiante() {

	}

	public Estudiante(Long id, String nombre, String apellidos, String tipo, List<Direccion> direcciones,
			String idEstudiante) {
		super(id, nombre, apellidos, tipo, direcciones);
		this.idEstudiante = idEstudiante;
	}

	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + "]";
	}

}
