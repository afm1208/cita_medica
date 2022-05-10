package co.edu.poli.t2.model;

public class Paciente extends Persona {
	
      private int peso;
	private double altura;
	private int edad;
      
	
	
public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

public String calcularIMC( int peso, double  altura ) {
    	
    	peso = this.peso;
    	altura  =this.altura;
    	
    	double calcularIMC = (peso/(altura * altura ));
    	
    	if (calcularIMC < 20 ) {
    		
    		return  "esta muy bajo de peso";
    		
    	} else if (calcularIMC >= 20  || calcularIMC <= 25 ) {
    		
    		return "esta en el peso ideal ";
    		
    	} else {
    		return "usted esta re gordo";
    	}
		
    	
    	
        
    }
    
    public  boolean mayordeedad(int edad ) {
    	
    	edad = this.edad;
    	
    	if (edad > 18) {
    		
    	return true ;
    	} 
    	else {
    		return false;
    	}
        // TODO implement here
    }


	public Paciente(String id, String nombre, int edad, String sexo, int peso, double altura) {
		super(id, nombre, edad, sexo);
		
		this.altura =altura ;
		this.peso= peso;
		this.altura = altura;
        
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {	
		return "\n ID paciente: " + getId() + "\n Nombre_Paciente: " + getNombre() + "\n Edad_Paciente" + getEdad()
				+ "\n Sexo_Paciente: " + getSexo() + "\n Peso_paciente: " + getPeso() + " g"+ "\n Altura_Paciente" + getAltura() + "m";
	}

	
	
}
