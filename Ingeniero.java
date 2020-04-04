public class Ingeniero extends MaestroDeObra
{
    protected int aumento;

     public Ingeniero(String name,int turnosPorNave, int precioCompra, int precioVenta, int aumento)
    {
     super(name, turnosPorNave, precioCompra, precioVenta);
     this.aumento = aumento;

     }
     public int getprecioCompra(){

     	return (precioCompra + 200);
     }
     public int getprecioVenta(){
     	return (precioVenta + 130);
     }
     public int getturnosPorNave(){
    	return (turnosPorNave - 1);
     }
     public String toString(){
    	return "Constructor : " + name;
     }
}
