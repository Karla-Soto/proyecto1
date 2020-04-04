public class XWing extends MillenialFalcon
{
    
     protected int motorWing;
     public XWing(String name, int espacios, double costoNave, double velocidad, int motorWing)
 {
     super(name, espacios, costoNave, velocidad);
     this.motorWing = motorWing;
     	
     }
     public int getespacios(){
     	return (espacios - 16);
     }
     public double getcostoNave(){
	
     	return (costoNave - 20.0);
     }
     public double getvelocidad(){
	
    	return (velocidad - 0.25);
     }
     public String toString(){
    	return "Nave : " + name;
     }
}
