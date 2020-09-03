package model;

import java.util.List;

public class Profesor extends Persona {

	private String idDespacho;

	public Profesor() {
	}

	public Profesor(Long id, String nombre, String apellidos, String tipo, List<Direccion> direcciones,
			String idDespacho) {
		super(id, nombre, apellidos, tipo, direcciones);
		this.idDespacho = idDespacho;
	}

	public String getIdDespacho() {
		return idDespacho;
	}

	public void setIdDespacho(String idDespacho) {
		this.idDespacho = idDespacho;
	}

	@Override
	public String toString() {
		return "Profesor [idDespacho=" + idDespacho + "]";
	}

}
