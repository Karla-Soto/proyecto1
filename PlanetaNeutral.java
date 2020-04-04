import java.util.Scanner;


//package Juegos;

public class PlanetaNeutral {

     protected String name; 
     //protected String jugadorPropietario; 
     protected double probabilidadAparecer = 0.15; 
     protected int guerrerosProducidos = 0;
     protected double monedasProducidas = 0;

public PlanetaNeutral (String name, double probabilidadAparecer, int guerrerosProducidos, double monedasProducidas)
{
	this.name = name;
     	//this.jugadorPropietario = jugadorPropietario;
     	this.probabilidadAparecer = probabilidadAparecer;
     	this.guerrerosProducidos = guerrerosProducidos;
     	this.monedasProducidas = monedasProducidas;
}

public double getmonedasProducidas(){
     	return monedasProducidas;
     }
     public int getguerrerosProducidos(){
     	return guerrerosProducidos;
     }
     public double getprobabilidadAparecer(){
    	return probabilidadAparecer;

     }
     public String toString(){
    	return "Planeta : " + name;
     }

 }

	/*public static void main(String[] args) throws IOException
	{
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Numero de Planetas:");

	int nPlanetas = Integer.parseInt(stdin.readLine());
	PlanetaNeutral [] inventarioPlanetas = new PlanetaNeutral[nPlanetas];

	int i=1;
	
	while(i<=nPlanetas){

	    inventarioPlanetas[i-1] = getPlaneta(i);
	    i++;
	}
	showPlanetaInfo(inventarioPlanetas);

    }

	public static PlanetaNeutral getPlaneta(int i) throws IOException{

     BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));

     PlanetaNeutral b;

	while(true){

	System.out.println("----------------\nPlaneta#"+i);
	System.out.print("Tipo(1= Planeta Neutral, 2= Tierra, 3= Agua, 4= Fuego, 5= Organico, 6= Radioactivo) ; " );

	int type = Integer.parseInt(stdin.readLine());

	     if(type<1 || type>6){

		System.out.println("Tipo no permitido");

		continue;
	}

	
{
     String name;
     String jugadorPropietario;
     int probabilidadAparecer = 0.15;
     int guerrerosProducidos = 0;
     int monedasProducidas = 0;
}
}
    
    {
     this.name = name;
     this.jugadorPropietario = jugadorPropietario;
     this.probabilidadAparecer = probabilidadAparecer;
     this.guerrerosProducidos = guerrerosProducidos;
     this.monedasProducidas = monedasProducidas;

     }
     public int getmonedasProducidas{
     	return monedasProducidas;
     }
     public int getguerrerosProducidos(){
     	return guerrerosProducidos;
     }
     public int getprobabilidadAparecer(){
    	return probabilidadAparecer;
     }
     public String toString(){
    	return "Planeta : " + name;
     }

 

switch(type){

	     
		case 1:
		name=" Neutral";
		b = new PlanetaNeutral(name,jugadorPropietario,probabilidadAparecer);
		Planeta planetaNeutral = new Planeta();
     	
		break;
		
	        case 2:
		name=" Tierra";
		
		b = new Tierra(name,jugadorPropietario,probabilidadAparecer, guerrerosProducidos,monedasProducidas,moles);
		break;

	        case 3:
		name=" Agua";

		b = new Agua(name,jugadorPropietario,probabilidadAparecer, guerrerosProducidos,monedasProducidas,nemos);
		break;

		case 4:
		name= " Fuego";

		b = new Fuego(name,jugadorPropietario,probabilidadAparecer, guerrerosProducidos,monedasProducidas,magmas);
		break;

		case 5:
		name= " Organico";

		b = new Organico(name,jugadorPropietario,probabilidadAparecer, guerrerosProducidos,monedasProducidas,groots);
		break;

		case 6:
		name= "Radioactivo";

 		b = new Radioactivo(name,jugadorPropietario,probabilidadAparecer, guerrerosProducidos,monedasProducidas,fisionGuys);
		break;
		

	        default:

		b = null;

	   //}
		break;

	}*/


/*
public static void main(String[] args){

	Planeta planetaTierra = new Planeta();
	Planeta planetaAgua = new Planeta();
	Planeta planetaFuego = new Planeta();
	Planeta planetaOrganico = new Planeta();
	Planeta planetaRadioactivo = new Planeta();
	

	planetaTierra.nombre = "Tierra"*/
	

/* Tierra  El tipo de guerrero que produce es ​ Mole.
	   Probabilidad de aparecer en el mapa es de 45%
	   Cantidad de guerreros producidos al finalizar un turno: entre 15 y 25
	   Cantidad de dinero producido al finalizar un turno: entre 50 y 100 galactus

Agua       El tipo de guerrero que produce es ​ Nemo.
	   Probabilidad de aparecer en el mapa es de 25%
	   Cantidad de guerreros producidos al finalizar un turno: entre 12 y 23
	   Cantidad de dinero producido al finalizar un turno: entre 60 y 120 galactus

Fuego      El tipo de guerrero que produce es ​ Magma.
	   Probabilidad de aparecer en el mapa es de 15%
           Cantidad de guerreros producidos al finalizar un turno: entre 10 y 20
	   Cantidad de dinero producido al finalizar un turno: entre 70 y 140 galactus

Orgánico   El tipo de guerrero que produce es ​ Groot.
	   Probabilidad de aparecer en el mapa es de 10%
           Cantidad de guerreros producidos al finalizar un turno: entre 5 y 15
           Cantidad de dinero producido al finalizar un turno: entre 80 y 160 galactus

Radioactivo El tipo de guerrero que produce es ​ Fision Guy.
	    Probabilidad de aparecer en el mapa es de 5%
	    Cantidad de guerreros producidos al finalizar un turno: entre 3 y 9 


Neutral     Los planetas, tanto neutrales como iniciales tienen los siguientes atributos:
Nombre. su valor se genera secuencialmente basado en las letras del alfabeto,
excepto cuando se especifique en el diseño del mapa.
Porcentaje de muerte (valor entre 0.1 y 0.9999)




*/
