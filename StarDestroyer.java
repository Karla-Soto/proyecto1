public class StarDestroyer extends MillenialFalcon
{
    protected int motorStar;
    public StarDestroyer(String name, int espacios, double costoNave, double velocidad, int motorStar)

{
     super(name, espacios, costoNave, velocidad);
     this.motorStar = motorStar;
    }
     public int getespacios(){
     	return (espacios + 22);
     }
     public double getcostoNave(){
	
     	return (costoNave + 30.0 );
     }
     public double getvelocidad(){
	
    	return (velocidad + 0.25);
     }
     public String toString(){
    	return "Nave : " + name;
     }
}
