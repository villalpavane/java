/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author vanessa.villalpando
 */
public class Estudiante extends Persona
{

	private String idCalificacionMateria;

	public Estudiante() {
		super();
	}

	public Estudiante(int id, String nombre, String apellidos, int edad, String idCalificacionMateria) {
		super(id, nombre, apellidos, edad);
		this.idCalificacionMateria = idCalificacionMateria;
	}

	public String getIdCalificacionMateria() {
		return idCalificacionMateria;
	}

	public void setIdCalificacionMateria(String idCalificacionMateria) {
		this.idCalificacionMateria = idCalificacionMateria;
	}

	public void cursarMateria() {
		System.out.println("CursaMateria");
	}

	public void titularse() {
		System.out.println("Titularse");
	}
}