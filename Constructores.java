import java.io.*;

public class Constructores
     {
	public static void main(String[] args) throws IOException
	{
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nIngrese numero de Constructores : ");

	int nConstructores = Integer.parseInt(stdin.readLine());
	MaestroDeObra [] InventarioConstructores = new MaestroDeObra[nConstructores];

	int i=1;
	
	while(i<=nConstructores){

	    InventarioConstructores[i-1] = getConstructor(i);
	    i++;
	}
	showConstructorInfo(InventarioConstructores);

    }

public static MaestroDeObra getConstructor(int i) throws IOException{

     BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));

     MaestroDeObra b;

	while(true){

	System.out.println("----------------\nConstructor#"+i);
	System.out.print("Tipo(1= Maestro de Obra, 2= Obrero, 3= Ingeniero) : ");

	int type = Integer.parseInt(stdin.readLine());

	     if(type<1 || type>3){

		System.out.println("Tipo de constructor no permitido");

		continue;
	}

	//System.out.print("Constructorname:");
	String name; // = stdin.readLine();
	//System.out.print("Listed price:");
	//double price = Double.parseDouble(stdin.readLine());
	//double factor;
	int turnosPorNave = 2, precioCompra = 100, precioVenta = 70, disminucion = 0, aumento = 0;


	switch(type){

	     case 1:
		name = "Maestro De Obra";
		b = new MaestroDeObra(name,turnosPorNave, precioCompra,precioVenta);
		break;

	     case 2:
		name = "Obrero";
		//System.out.print("Opcion de mejora:");
		//factor = Double.parseDouble(stdin.readLine());
		b = new Obrero(name,turnosPorNave, precioCompra,precioVenta,disminucion);
		break;

	     case 3:
		name = "Ingeniero";
		//System.out.print("Aumento de capacidades:");
		//factor = Double.parseDouble(stdin.readLine());
		b = new Ingeniero(name,turnosPorNave,precioCompra,precioVenta,aumento);
		break;

	     default:

		b = null;

	   }
		break;

	}

	return b;

     }

public static void showConstructorInfo(MaestroDeObra [] InventarioConstructores){

     System.out.println("####################################");

     for(int i=0;i<InventarioConstructores.length ;i++){

	System.out.println("Item #"+ i +":\t"+InventarioConstructores[i]);
	System.out.print("Precio de compra :\t");
	System.out.println(InventarioConstructores[i].getprecioCompra());
	System.out.print("Precio de venta :\t");
	System.out.println(InventarioConstructores[i].getprecioVenta());
	System.out.print("Turnos por nave : \t");
	System.out.println(InventarioConstructores[i].getturnosPorNave());
	System.out.println();
     }
     System.out.println("####################################");
   }
}
