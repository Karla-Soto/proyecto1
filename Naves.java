import java.io.*;

public class Naves
     {
	public static void main(String[] args) throws IOException
	{
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
 	System.out.print("\n Ingrese numero de Naves : ");

	
	int nNaves = Integer.parseInt(stdin.readLine());
	MillenialFalcon [] InventarioNaves = new MillenialFalcon[nNaves];

	int i=1;
	
	while(i<=nNaves){

	    InventarioNaves[i-1] = getNave(i);
	    i++;
	}
	showNaveInfo(InventarioNaves);

    }

public static MillenialFalcon getNave(int i) throws IOException{

     BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));

     MillenialFalcon b;

	while(true){

	System.out.println("----------------\nNave#"+i);
	System.out.print("Tipo(1= Naboo B-1 , 2=  X -Wing, 3= Millenial Falcon, 4= Star Destroyer ) : ");
	

	int type = Integer.parseInt(stdin.readLine());

	     if(type<1 || type>4){

		System.out.println("Tipo de nave no permitido");

		continue;
	}
	
	
	String name = "null "; 
	int espacios = 58 ;
	double costoNave = 70.0 ;
	double velocidad = 1.5 ;
	int motorNaboo = 0 ;
	int motorWing = 0;
	int motorStar = 0;


	switch(type){

	    case 1:
		name= " Naboo N-1";
		b = new NabooN1(name,espacios,costoNave,velocidad, motorNaboo);
		     	
		break;

	    case 2:
		name= " X-Wing";
		b = new XWing(name,espacios,costoNave,velocidad, motorWing);
		
		break;

	     case 3:
		name= " MillenialFalcon ";
		
		b = new MillenialFalcon(name,espacios,costoNave,velocidad);
		
		break;

	      case 4:
		name= " Star Destroyer ";
		
		b = new StarDestroyer(name,espacios,costoNave,velocidad, motorStar);
		
		break;

	        	

	     default:

		b = null;

	   }
		break;

	}

	return b;

     }

public static void showNaveInfo(MillenialFalcon [] InventarioNaves){

     System.out.println("####################################");

     for(int i=0;i<InventarioNaves.length ;i++){

	System.out.println("Item #"+ i +":\t"+InventarioNaves[i]);
	
	System.out.print("Espacios en Nave : \t");
	System.out.println(InventarioNaves[i].getespacios());
	System.out.print("Costo de Nave: \t\t");
	System.out.println(InventarioNaves[i].getcostoNave());
	System.out.print("Velocidad de Nave : \t");
	System.out.println(InventarioNaves[i].getvelocidad());
	System.out.println();

 }
  System.out.println("####################################");
 }
 }	
