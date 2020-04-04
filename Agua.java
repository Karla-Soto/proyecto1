public class Agua extends PlanetaNeutral
{
    public int nemos;

     public Agua(String name, double probabilidadAparecer, int guerrerosProducidos,double monedasProducidas,int nemos)
    {
     super(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas);
     this.nemos = nemos;

     }
     public double getprobabilidadAparecer(){

     	return (probabilidadAparecer + 0.10);
     }
     public int getguerrerosProducidos(){
	
     	return (guerrerosProducidos + 12 + (int)(11 * Math.random()));
     }
     public double getmonedasProducidas(){
	
    	return (monedasProducidas + 60 + (int)(60 * Math.random()));
     }
     public String toString(){
    	return "Planeta : " + name;
     }
}

 /*public Nemo(int factorMuerte= 1.6, int espacioOcupado= 1);
	{
     super(factorMuerte, espacioOcupado);
}
*/
