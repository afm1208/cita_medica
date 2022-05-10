package co.edu.poli.t2.model;

import java.util.*;

/**
 * 
 */
public class Citamedica {

   
    private String numerodecita;

    /**
     * 
     */
    private String Fecha ;

    /**
     * 
     */
    private String  hora;

    /**
     * 
     */
    private int numeroconsultorio;

    /**
     * 
     */
    

    /**
     * 
     */
    private Doctor doctor ;

    /**
     * 
     */
    public Persona paciente ;

	public String getNumerodecita() {
		return numerodecita;
	}

	public void setNumerodecita(String numerodecita) {
		this.numerodecita = numerodecita;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getNumeroconsultorio() {
		return numeroconsultorio;
	}

	public void setNumeroconsultorio(int numeroconsultorio) {
		this.numeroconsultorio = numeroconsultorio;
	}

	

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Persona getPersona() {
		return paciente;
	}

	public void setPersona(Persona paciente) {
		this.paciente = paciente;
	}

	public Citamedica(String numerodecita, String fecha, String hora, int numeroconsultorio, Doctor doctor,
			Persona paciente) {
		super();
		this.numerodecita = numerodecita;
		Fecha = fecha;
		this.hora = hora;
		this.numeroconsultorio = numeroconsultorio;
		
		this.doctor = doctor;
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return " \n El numero de su cita medica es: " + numerodecita + "\n Fecha:" + Fecha + "\n hora: " + hora
				+ "\n su numero de consultorio es:" + numeroconsultorio  + "\n El doctor que lo va a atender es: " + doctor + "\n __________________"+ "\n perfil de el paciente: "
				+ paciente ;
	}
	
	

    
    



}