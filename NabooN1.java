public class NabooN1 extends MillenialFalcon
{
    protected int motorNaboo;

     public NabooN1(String name, int espacios, double costoNave, double velocidad, int motorNaboo)
 {
     super(name, espacios, costoNave, velocidad);
     this.motorNaboo=motorNaboo;
     	
     }
     public int getespacios(){
     	return (espacios - 33);
     }
     public double getcostoNave(){
	
     	return (costoNave - 30.0 );
     }
     public double getvelocidad(){
	
    	return (velocidad - 0.5);
     }
     public String toString(){
    	return "Nave : " + name;
     }
}
