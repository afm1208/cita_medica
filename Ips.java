package co.edu.poli.t2.model;

import java.util.*;

/**
 * 
 */
public class Ips {

  
    private String nombre;
    private Citamedica citamedica;


    private String registrarcita (Citamedica citamedica) {
    	
    	this.citamedica = citamedica;
    	
    	return citamedica.toString();
        
    }



	public Ips(String nombre, Citamedica citamedica) {
		this.nombre = nombre;
		this.citamedica = citamedica;
	}



	public Citamedica getCitamedica() {
		return citamedica;
	}



	public void setCitamedica(Citamedica citamedica) {
		this.citamedica = citamedica;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Ips(String nombre) {
		
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Su IPS es: " + nombre  + "  " + "\n su cita medica: " + citamedica ;
	}

}