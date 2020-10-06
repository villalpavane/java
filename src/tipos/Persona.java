/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import tipos.Profesor;

/**
 *
 * @author vanessa.villalpando
 */
public class Persona {

	protected int id;

	protected String Nombre;

	protected String Apellidos;

	protected int Edad;

	public Persona() {
	}

	public Persona(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public void EstudiaTemas() {
		System.out.println("EstudiaTemas");
	}

	public void TomaVacaciones() {
		System.out.println("TomaVacaciones");
	}
    
}
