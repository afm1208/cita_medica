package co.edu.poli.t2.model;

import java.util.*;

/**
 * 
 */
public class Persona {


    private String id;

    /**
     * 
     */
    private String nombre ;

    /**
     * 
     */
    private int  edad;

    /**
     * 
     */
    private String  sexo;

    /**
     * 
     */


    
        
    

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	

	public Persona ( String id, String nombre, int edad, String sexo) {
		
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
	}

	

	@Override
	public String toString() {
		return "\n ID: " + id + "\n nombre: " + nombre + "\n edad: " + edad + "\n sexo: " + sexo ; 
			
	}

	/**
     * 
     */
    

}