public class Mole extends Nemo
{
    protected int suelo;
    public Mole(String name,double factorMuerte,int espacioOcupado,int suelo){
	super(name,factorMuerte,espacioOcupado);
	this.suelo = suelo;
 }
     public double getfactorMuerte(){
    	return (factorMuerte - 0.1);
     }
     public int getespacioOcupado(){
    	return (espacioOcupado + 0);
     }
     public String toString(){
    	return "Guerrero:"+name;
     }
}
