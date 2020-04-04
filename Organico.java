public class Organico extends PlanetaNeutral
{
    protected int groots;

     public Organico(String name, double probabilidadAparecer, int guerrerosProducidos,double monedasProducidas,int groots)
    {
     super(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas);
     this.groots = groots;

     }
     public double getprobabilidadAparecer(){

     	return (probabilidadAparecer - 0.05);
     }
     public int getguerrerosProducidos(){
	return (guerrerosProducidos + 5 + (int)(10 * Math.random()));
     }
     public double getmonedasProducidas(){
	return (monedasProducidas + 80 + (int)(80 * Math.random()));
     }
     public String toString(){
    	return "Planeta : " + name;
     }
}

 /*public Groot(int factorMuerte= 1.85, int espacioOcupado= 3);
	{
     super(factorMuerte, espacioOcupado);
}
*/
