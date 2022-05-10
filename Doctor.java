package co.edu.poli.t2.model;

import java.util.*;

/**
 * 
 */
public class Doctor extends Persona {

    public String  numeroregistro;

	public String getNumeroregistro() {
		return numeroregistro;
	}

	public void setNumeroregistro(String numeroregistro) {
		this.numeroregistro = numeroregistro;
	}

	

	public Doctor(String id, String nombre, int edad, String sexo,String numeroderegistro) {
		super(id, nombre, edad, sexo );
		this.numeroregistro = numeroderegistro;	
	}

	@Override
	public String toString() {
		return  super.toString() + "\n el numero de registro de su doctor es: " + numeroregistro + "]";
	}
	
	
    


}