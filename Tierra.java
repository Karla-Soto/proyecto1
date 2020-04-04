public class Tierra extends PlanetaNeutral
{
    protected int moles;

     public Tierra(String name, double probabilidadAparecer, int guerrerosProducidos,double monedasProducidas,int moles)
    {
     	super(name, probabilidadAparecer, guerrerosProducidos,monedasProducidas);
     	this.moles = moles;
     }
     public double getprobabilidadAparecer(){
     	return (probabilidadAparecer + 0.30);
     }
     public int getguerrerosProducidos(){
	
     	return (guerrerosProducidos + 15 + (int)(10 * (Math.random())));
     }
     public double getmonedasProducidas(){
	
    	return (monedasProducidas + (50 + (int)(50 * Math.random())));
     }
     public String toString(){
    	return "Planeta : " + name;
     }
}

  /*public Mole(int factorMuerte= 1.5, int espacioOcupado= 1);
	{
     super(factorMuerte, espacioOcupado);
}*/
