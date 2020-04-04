import java.util.Scanner;

public class MillenialFalcon {

     protected String name; 
     protected int espacios = 58 ; 
     protected double costoNave = 70.0 ;
     protected double velocidad = 1.5 ;
	
	
public MillenialFalcon (String name, int espacios, double costoNave, double velocidad)

{
	this.name = name;
     	this.espacios = espacios;
     	this.costoNave = costoNave;
     	this.velocidad = velocidad;
}

     public int getespacios(){
     	return espacios;
     }
     public double getcostoNave(){
     	return costoNave;
     }
     public double getvelocidad(){
    	return velocidad;

     }
     public String toString(){
    	return "Nave : " + name;
     }

 }

