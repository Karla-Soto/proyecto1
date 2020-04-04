public class Magma extends Nemo
{
    protected int bolasLava;
    public Magma(String name,double factorMuerte,int espacioOcupado, int bolasLava){
	super(name,factorMuerte,espacioOcupado);
	this.bolasLava = bolasLava;
 }
     public double getfactorMuerte(){
    	return (factorMuerte + 0.15);
     }
     public int getespacioOcupado(){
    	return (espacioOcupado + 1);
     }
     public String toString(){
    	return "Guerrero:"+name;
     }
}
