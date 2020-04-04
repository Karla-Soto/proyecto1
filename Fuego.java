public class Fuego extends PlanetaNeutral
{
    protected int magmas;

     public Fuego(String name, double probabilidadAparecer, int guerrerosProducidos,double monedasProducidas,int magmas)
    {
     super(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas);
     this.magmas = magmas;

     }
     public double getprobabilidadAparecer(){

     	return (probabilidadAparecer + 0);
     }
     public int getguerrerosProducidos(){
	return (guerrerosProducidos + 10 + (int)(10 * Math.random()));

     }
     public double getmonedasProducidas(){
	return (monedasProducidas + 70 + (int)(70 * Math.random()));
     }
     public String toString(){
    	return "Planeta : " + name;
     }
}

 /*public Magma(int factorMuerte= 1.75, int espacioOcupado= 2);
	{
     super(factorMuerte, espacioOcupado);
}
*/
