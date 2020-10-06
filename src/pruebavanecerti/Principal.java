/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavanecerti;

import tipos.Persona;
import java.util.ArrayList;
import tipos.Estudiante;
import tipos.Profesor;
import tipos.Administrativo;

/**
 *
 * @author vanessa.villalpando
 */
public class Principal {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<Persona> integrantes = new ArrayList<Persona>();

	public static void main(String[] args) {

                //NOTAVANE: los primeros atributos son heredados de Persona y solo idCalificacionMateria viene de Estudiante
                //public Estudiante(int id, String nombre, String apellidos, int edad, String idCalificacionMateria) {
		//super(id, nombre, apellidos, edad);
                
		Estudiante villalpando = new Estudiante(1, "Vanessa", "Villalpando", 32, "10");
		Profesor alvarez = new Profesor(2, "Francisco", "Alvarez", 45, 6, "Informatico");
		Administrativo claudiaTorres = new Administrativo(3, "Claudia", "Torres", 41, "Secretaria", 18);

		integrantes.add(villalpando);
		integrantes.add(alvarez);
		integrantes.add(claudiaTorres);

		// ESTUDIA-TEMAS
		System.out.println("Todos los integrantes estudian temas. (Todos ejecutan el mismo método)");
		for (Persona integrante : integrantes) {
                    System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
                    integrante.EstudiaTemas();
		}
		
		// TOMAVACACIONES
		System.out.println("\nTodos los integrantes toman vacaciones. (Todos ejecutan el mismo método)");
		for (Persona integrante : integrantes) {
                    System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
                    integrante.TomaVacaciones();
		}
		
		// TITULARSE
		System.out.println("\nTitularse: Solamente el estudiante y el administrativo tiene metodos para titular:");
		System.out.print(villalpando.getNombre()+" "+villalpando.getApellidos()+" -> ");
		villalpando.titularse();
		System.out.print(claudiaTorres.getNombre()+" "+claudiaTorres.getApellidos()+" -> ");
		claudiaTorres.dartitulacion();
		
		// CALIFICA MATERIAS
		System.out.println("\nCalificaMaterias: Solo el profesor tiene el método para calificar materias:");
		System.out.print(alvarez.getNombre()+" "+alvarez.getApellidos()+" -> ");
		alvarez.calificaMaterias();

	}
}
