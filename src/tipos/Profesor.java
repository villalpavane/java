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
public class Profesor extends Persona{


	private int numeroMateriasDa;

	private String jefeDepartamento;

	public Profesor() {
		super();
	}

	public Profesor(int id, String nombre, String apellidos, int edad, int numeroMateriasDa, String jefeDepartamento) {
		super(id, nombre, apellidos, edad);
		this.numeroMateriasDa = numeroMateriasDa;
		this.jefeDepartamento = jefeDepartamento;
	}

	public int getNumeroMateriasDa() {
		return numeroMateriasDa;
	}

	public void setNumeroMateriasDa(int numeroMateriasDa) {
		this.numeroMateriasDa = numeroMateriasDa;
	}

	public String getJefeDepartamento() {
		return jefeDepartamento;
	}

	public void setJefeDepartamento(String jefeDepartamento) {
		this.jefeDepartamento = jefeDepartamento;
	}

	public void calificaMaterias() {
		System.out.println("Califica Materias");
	}

	public void daClases() {
		System.out.println("Da Clases");
	}

}