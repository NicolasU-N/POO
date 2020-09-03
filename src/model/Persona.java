package model;

import java.util.List;

import service.IHumano;

public class Persona implements IHumano {

	private Long id;
	private String nombre;
	private String apellidos;
	private String tipo;

	private List<Direccion> direcciones;

	public Persona() {

	}

	public Persona(Long id, String nombre, String apellidos, String tipo, List<Direccion> direcciones) {
		this.id = id;
		this.nombre = nombre.toUpperCase().trim();
		this.apellidos = apellidos.toUpperCase().trim();
		this.tipo = tipo.toUpperCase().trim();
		this.direcciones = direcciones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase().trim();
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos.toUpperCase().trim();
	}

	public void setTipo(String tipo) {
		this.tipo = tipo.toUpperCase().trim();
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public String Identificate() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

}
