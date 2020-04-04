public class Groot extends Nemo
{
    protected int enredadera;
    public Groot(String name,double factorMuerte,int espacioOcupado, int enredadera){
	super(name,factorMuerte,espacioOcupado);
	this.enredadera = enredadera;
 }
     public double getfactorMuerte(){
    	return (factorMuerte + 0.25);
     }
     public int getespacioOcupado(){
    	return (espacioOcupado + 2);
     }
     public String toString(){
    	return "Guerrero:"+name;
     }
}
