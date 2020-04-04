public class Obrero extends MaestroDeObra
{
     protected int disminucion;

     public Obrero(String name,int turnosPorNave, int precioCompra, int precioVenta, int disminucion)
    {
     super(name, turnosPorNave, precioCompra, precioVenta);
     this.disminucion = disminucion;

     }
     public int getprecioCompra(){

     	return (precioCompra - 50);
     }
     public int getprecioVenta(){
     	return (precioVenta - 30);
     }
     public int getturnosPorNave(){
    	return (turnosPorNave + 1);
     }
     public String toString(){
    	return "Constructor : " + name;
     }
}



 
