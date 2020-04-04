public class Nemo
{
     protected String name;
     protected double factorMuerte;
     protected int espacioOcupado;
	
     public Nemo(String name,double factorMuerte,int espacioOcupado)
    {
     this.name = name;
     this.factorMuerte = factorMuerte;
     this.espacioOcupado = espacioOcupado;
     }
     public double getfactorMuerte(){
    	return factorMuerte;
     }
     public int getespacioOcupado(){
    	return espacioOcupado;
     }
     public String toString(){
    	return "Guerrero:"+name;
     }
}
