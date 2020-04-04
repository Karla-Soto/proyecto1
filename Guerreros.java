import java.io.*;

public class Guerreros 
     {
	public static void main(String[] args) throws IOException
	{
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Numero de Guerreros:");

	int nGuerreros = Integer.parseInt(stdin.readLine());
	Nemo [] InventarioGuerreros = new Nemo[nGuerreros];

	int i=1;
	
	while(i<=nGuerreros){

	    InventarioGuerreros[i-1] = getGuerrero(i);
	    i++;
	}
	showGuerreroInfo(InventarioGuerreros);

    }

public static Nemo getGuerrero(int i) throws IOException{

     BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));

     Nemo b;

	while(true){

	System.out.println("----------------\nGuerrero #"+i);
	System.out.print("Type(1= Nemo, 2= Mole, 3= Fuego , 4= Groot, 5= FisionGuy):");

	int type = Integer.parseInt(stdin.readLine());

	     if(type<1 || type>5){

		System.out.println("Tipo de guerrero no permitido");

		continue;
	}

	
	String name = "null";
	double factorMuerte = 1.6;
	int espacioOcupado = 1;
	int suelo = 0;
	int bolasLava = 0;
	int enredadera = 0;
	int rayosGama = 0;

	switch(type){

	     case 1:

		name= " Nemo";
		
		b = new Nemo(name,factorMuerte,espacioOcupado);
		break;

	     case 2:

		name= " Mole";
		
		b = new Mole(name,factorMuerte,espacioOcupado, suelo);
		break;

	     case 3:

		name= " Magma";
		
		b = new Magma(name,factorMuerte,espacioOcupado, bolasLava);
		
		break;

	      case 4:

		name= " Groot";
		
		b = new Groot(name,factorMuerte,espacioOcupado, enredadera);
		
		break;

	       case 5:

		name= " FisionGuy";
		
		b = new FisionGuy(name,factorMuerte,espacioOcupado, rayosGama);
		
		break;


	     default:

		b = null;

	   }
		break;

	}

	return b;

     }

public static void showGuerreroInfo(Nemo [] InventarioGuerreros){

     System.out.println("####################################");

     for(int i=0;i<InventarioGuerreros.length;i++){

	System.out.println("Item #"+i+":\t"+InventarioGuerreros[i]);
	System.out.print("Factor de muerte:\t\t");
	System.out.println(InventarioGuerreros[i].getfactorMuerte());
	System.out.print("Espacio ocupado en Nave:\t");
	System.out.println(InventarioGuerreros[i].getespacioOcupado()); 
	System.out.println();
     }
     System.out.println("####################################");
   }
}
