import java.util.ArrayList;
import java.util.List;

import model.Direccion;
import model.Estudiante;
import model.Profesor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("####################### DB USCO #######################");

		Direccion direccione1 = new Direccion("Calle 18 # 5A", "Neiva", "410001", "Colombia");
		List<Direccion> dirEstudiante = new ArrayList<Direccion>();
		dirEstudiante.add(direccione1);

		Direccion direccionp1 = new Direccion("Carrera 1 ", "Neiva", "410001", "Colombia");
		List<Direccion> dirProfesor = new ArrayList<Direccion>();
		dirProfesor.add(direccionp1);

		Direccion direccione2 = new Direccion("Calle 20 # 9A", "Bogotá", "410001", "Colombia");
		List<Direccion> dirEstudiante1 = new ArrayList<Direccion>();
		dirEstudiante1.add(direccione2);

		Direccion direccionp2 = new Direccion("Av 26 ", "Manizales", "410001", "Colombia");
		List<Direccion> dirProfesor1 = new ArrayList<Direccion>();
		dirProfesor1.add(direccionp2);

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setId(1L);
		estudiante1.setIdEstudiante("u20171154988");
		estudiante1.setNombre("Pepito");
		estudiante1.setApellidos("Perez");
		estudiante1.setDirecciones(dirEstudiante);
		estudiante1.setTipo("Estudiante");

		Estudiante estudiante2 = new Estudiante(2L, "Juanito", "Alimaña", "Estudiante", dirEstudiante1, "u20171177411");

		Profesor profesor1 = new Profesor();
		profesor1.setId(1L);
		profesor1.setIdDespacho("207");
		profesor1.setNombre("Rigoberto");
		profesor1.setApellidos("Urán");
		profesor1.setDirecciones(dirProfesor);
		profesor1.setTipo("Profesor");

		Profesor profesor2 = new Profesor(2L, "Peter", "Sagan", "Profesor", dirProfesor1, "420");

		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);

		List<Profesor> profesores = new ArrayList<Profesor>();
		profesores.add(profesor1);
		profesores.add(profesor2);

		System.out.println("------------------- ESTUDIANTES ---------------------");

		for (int i = 0; i <= estudiantes.size() - 1; i++) {
			System.out.println(estudiantes.get(i).getId());
			System.out.println(estudiantes.get(i).getNombre());
			System.out.println(estudiantes.get(i).getApellidos());
			System.out.println(estudiantes.get(i).getIdEstudiante());
			System.out.print(estudiantes.get(i).getDirecciones().get(0).getCalle());
			System.out.print(", " + estudiantes.get(i).getDirecciones().get(0).getCiudad());
			System.out.print(", " + estudiantes.get(i).getDirecciones().get(0).getPais());
			System.out.println(", " + estudiantes.get(i).getDirecciones().get(0).getCodigoPostal());
			System.out.println(estudiantes.get(i).Identificate());
			System.out.println("------------");
		}

		System.out.println("------------------- PROFESORES ---------------------");
		for (int i = 0; i <= profesores.size() - 1; i++) {
			System.out.println(profesores.get(i).getId());
			System.out.println(profesores.get(i).getNombre());
			System.out.println(profesores.get(i).getApellidos());
			System.out.println(profesores.get(i).getIdDespacho());
			System.out.print(profesores.get(i).getDirecciones().get(0).getCalle());
			System.out.print(", " + profesores.get(i).getDirecciones().get(0).getCiudad());
			System.out.print(", " + profesores.get(i).getDirecciones().get(0).getPais());
			System.out.println(", " + profesores.get(i).getDirecciones().get(0).getCodigoPostal());
			System.out.println(profesores.get(i).Identificate());
			System.out.println("------------");
		}

	}

}
