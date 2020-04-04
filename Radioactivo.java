public class Radioactivo extends PlanetaNeutral
{
    protected int fisionGuys;

     public Radioactivo(String name, double probabilidadAparecer, int guerrerosProducidos,double monedasProducidas,int fisionGuys)
    {
     super(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas);
     this.fisionGuys = fisionGuys;

     }
     public double getprobabilidadAparecer(){

     	return (probabilidadAparecer - 0.10);
     }
     public int getguerrerosProducidos(){
	return (guerrerosProducidos + 3 + (int)(6 * Math.random()));
     }
     public double getmonedasProducidas(){
	return (monedasProducidas + 90 + (int)(90 * Math.random()));
     }
     public String toString(){
    	return "Planeta : " + name;
     }
}

/* public FisionGuy(int factorMuerte= 1.95, int espacioOcupado= 4);
	{
     super(factorMuerte, espacioOcupado);
}
*/
