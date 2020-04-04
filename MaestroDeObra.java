public class MaestroDeObra
{
     protected String name; // obrero, maestroDeObra o ingeniero
     protected int turnosPorNave = 2; // 3, 2 ó 1
     protected int precioCompra = 100; // 50, 100 ó 300
     protected int precioVenta = 70;  // 40, 70 ó 200

     public MaestroDeObra(String name,int turnosPorNave, int precioCompra, int precioVenta)
    {
     this.name = name;
     this.turnosPorNave = turnosPorNave;
     this.precioCompra = precioCompra;
     this.precioVenta = precioVenta;

     }
     public int getprecioCompra(){
     	return precioCompra;
     }
     public int getprecioVenta(){
     	return precioVenta;
     }
     public int getturnosPorNave(){
    	return turnosPorNave;
     }
     public String toString(){
    	return "Constructor : " + name;
     }
}



 
