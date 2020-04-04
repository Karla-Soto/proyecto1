public class FisionGuy extends Nemo
{
    protected int rayosGama;
    public FisionGuy(String name,double factorMuerte,int espacioOcupado, int rayosGama){
	super(name,factorMuerte,espacioOcupado);
	this.rayosGama = rayosGama;
 }
     public double getfactorMuerte(){
    	return (factorMuerte + 0.35);
     }
     public int getespacioOcupado(){
    	return (espacioOcupado + 3);
     }
     public String toString(){
    	return "Guerrero:"+name;
     }
}
