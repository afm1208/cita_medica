package co.edu.poli.t2.model;

import java.util.*;

/**
 * 
 */
public class Cliente {

   
    public static void main(String[] args) {
    	
    	System.out.println("Bienvennido :)");
        System.out.println("iniciemos el agendamiento");
        
        Doctor doctor1 = new Doctor ("12345678", "Lucho ", 34 , "M ", "827948723984");
        Paciente paciente1 = new Paciente ( "1002334", "pepemojica", 15 , "M", 51, 1.68);
        Citamedica citamedica1 = new Citamedica( "1291239123" , "26/02/2022", "8:00pm", 420 , doctor1, paciente1);
        Ips ips1 = new Ips("sanitas", citamedica1);

        
        
        System.out.println(ips1.toString());
        
       System.out.println("vamos a verificar si el paciente es mayor de edad y su peso");
       System.out.println("es mayor de edad: "+paciente1.mayordeedad(paciente1.getEdad()));
       System.out.println(paciente1.calcularIMC(paciente1.getPeso(),  paciente1.getAltura()));
       
        
    
    }

}