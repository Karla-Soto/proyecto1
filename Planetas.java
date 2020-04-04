import java.io.*;

public class Planetas
     {
	public static void main(String[] args) throws IOException
	{
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
 	System.out.print("\n Ingrese numero de Planetas : ");

	
	int nPlanetas = Integer.parseInt(stdin.readLine());
	PlanetaNeutral [] InventarioPlanetas = new PlanetaNeutral[nPlanetas];

	int i=1;
	
	while(i<=nPlanetas){

	    InventarioPlanetas[i-1] = getPlaneta(i);
	    i++;
	}
	showPlanetaInfo(InventarioPlanetas);

    }

public static PlanetaNeutral getPlaneta(int i) throws IOException{

     BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));

     PlanetaNeutral b;

	while(true){

	System.out.println("----------------\nPlaneta#"+i);
	System.out.print("Tipo(1= Planeta Neutral, 2= Tierra, 3= Agua, 4= Fuego, 5= Organico, 6= Radioactivo) : ");
	

	int type = Integer.parseInt(stdin.readLine());

	     if(type<1 || type>6){

		System.out.println("Tipo de planeta no permitido");

		continue;
	}
	
	//System.out.print("Nombre de Planeta:");
	String name = "null "; //stdin.readLine();
	double probabilidadAparecer = 0.15;
	int guerrerosProducidos = 0 ;
	double monedasProducidas = 0 ;
	int moles = 0;
	int nemos = 0 ;
	int magmas = 0;
	int groots = 0;
	int fisionGuys = 0;




	switch(type){

	    case 1:
		name= " Neutral";
		b = new PlanetaNeutral(name,probabilidadAparecer,guerrerosProducidos,monedasProducidas);
		//Planeta planetaNeutral = new Planeta();
     	
		break;
		
	        case 2:
		name= " Tierra";
		
		b = new Tierra(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas,moles);
		break;

	        case 3:
		name= " Agua";

		b = new Agua(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas,nemos);
		break;

		case 4:
		name= " Fuego";

		b = new Fuego(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas,magmas);
		break;

		case 5:
		name= " Organico";

		b = new Organico(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas,groots);
		break;

		case 6:
		name= "Radioactivo";

 		b = new Radioactivo(name,probabilidadAparecer, guerrerosProducidos,monedasProducidas,fisionGuys);
		break;
		

	     default:

		b = null;

	   }
		break;

	}

	return b;

     }

public static void showPlanetaInfo(PlanetaNeutral [] InventarioPlanetas){

     System.out.println("####################################");

     for(int i=0;i<InventarioPlanetas.length ;i++){

	System.out.println("Item #"+ i +":\t"+InventarioPlanetas[i]);
	//System.out.println("Nombre :\t");
	//System.out.println(InventarioPlanetas[i]);
	System.out.print("Probabilidad Aparecer :\t\t");
	System.out.println(InventarioPlanetas[i].getprobabilidadAparecer());
	System.out.print("Guerreros Producidos :\t\t");
	System.out.println(InventarioPlanetas[i].getguerrerosProducidos());
	System.out.print("Monedas Producidas : \t\t");
	System.out.println(InventarioPlanetas[i].getmonedasProducidas());
	System.out.println();
	
     }
     System.out.println("####################################");
   }
}
