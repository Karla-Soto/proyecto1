import java.util.Scanner;

public class Jugador {

	String nombre;
	int naves;
	String planetas;
	int guerreros;
	int monedas;
	int constructor;
	

public static void main(String[] args){

	int sobrevivientes = 0;
	int turno = 0;
	int seleccion;
	int numRows = 10;
	int numCols = 10;
	String[][] grid = new String[numRows][numCols];
	Jugador jugadorUno = new Jugador();
	Jugador jugadorDos = new Jugador();
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Ingrese su nombre Jugador Uno ");
	jugadorUno.nombre = entrada.nextLine();
	System.out.print("Ingrese su nombre Jugador Dos ");
	jugadorDos.nombre = entrada.nextLine();
	jugadorUno.monedas = 100 + ((int)(400 * Math.random()));
	jugadorDos.monedas = 100 + ((int)(400 * Math.random()));
	jugadorUno.constructor = 1;	
	jugadorDos.constructor = 1;
	jugadorUno.naves = 1 + ((int)(2.1 * Math.random()));
	jugadorDos.naves = 1 + ((int)(2.1 * Math.random()));
	
	do {
		double aleatorio = Math.random();
		
		if (aleatorio > 0.8) {
			jugadorUno.planetas = "Tierra, Moles " ;
			jugadorUno.guerreros =  15 ;
			jugadorDos.planetas = "Radiactivo, Fision Guy " ;
			jugadorDos.guerreros =  3 ;
		    	break;
		     	}
		else if (aleatorio > 0.6) {
			jugadorUno.planetas = "Agua, Nemo " ;
			jugadorUno.guerreros =  15 ;
			jugadorDos.planetas = "Fuego, Magma " ;
			jugadorDos.guerreros =  10 ;
			break; 
			}
		else if (aleatorio > 0.4) {
			jugadorUno.planetas = "Fuego, Magma " ;
			jugadorUno.guerreros =  15 ;
			jugadorDos.planetas = "Organico, Groot " ;
			jugadorDos.guerreros =  5 ;
			break; 
			}
		else if (aleatorio > 0.2) {
			jugadorUno.planetas = "Organico, Groot " ;
			jugadorUno.guerreros =  15 ;
			jugadorDos.planetas = "Tierra, Moles " ;
			jugadorDos.guerreros =  15 ;
			break; 
			}
	        else {
			jugadorUno.planetas = "Radiactivo, Fision Guy " ;
			jugadorUno.guerreros =  15 ;
			jugadorDos.planetas = "Agua, Nemo " ;
			jugadorDos.guerreros =  12 ;
                	break;
			}


		}while(jugadorDos.guerreros == 0);

	System.out.println("\n" + jugadorUno.nombre);
	System.out.println("Monedas\t" + jugadorUno.monedas + " Galactus ");
	System.out.println("Constructor " + jugadorUno.constructor );
	System.out.println("Naves " + jugadorUno.naves );
	System.out.println("Planeta tipo " + jugadorUno.planetas + " : " + jugadorUno.guerreros + " guerreros " );

	System.out.println("\n" + jugadorDos.nombre);
	System.out.println("Monedas\t" + jugadorDos.monedas + " Galactus ");
	System.out.println("Constructor " + jugadorDos.constructor );
	System.out.println("Naves " + jugadorDos.naves );
	System.out.println("Planeta tipo " + jugadorDos.planetas + " : " + jugadorDos.guerreros + " guerreros " );

	System.out.println("\n**** Bienvenido al Juego de Konquest ****");
        System.out.println("Ahora el mapa esta vacio\n");
	
        
	//First section of Ocean Map
	
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
                System.out.print(i);
        System.out.println();

        //Middle section of Ocean Map
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
                if (j == 0)
                    System.out.print(i + "|" + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        //Last section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

   do {
     
         System.out.println("Seleccione una opcion : ");
         System.out.println("1 conquistar");
         System.out.println("2 medir la distancia");
         System.out.println("3 mover su nave");
         System.out.println("4 ver planeta");
         System.out.println("5 consultar flota");
	 System.out.println("6 ir a tienda");
	 System.out.println("0 salir del juego");
	
         seleccion = entrada.nextInt();
         
         if (seleccion != 0){
             
         switch(seleccion){
             case 1:
                 seleccion = 1;
                 System.out.println(" conquistar \n ");
		 System.out.println("Planeta tipo " + jugadorUno.planetas + " : " + jugadorUno.guerreros + " guerreros " );
		 System.out.println("Planeta tipo " + jugadorDos.planetas + " : " + jugadorDos.guerreros + " guerreros " );
		 sobrevivientes = jugadorUno.guerreros - jugadorDos.guerreros;
		 System.out.println("Guerreros sobrevivientes " + sobrevivientes);
		 turno = turno +1;
		 System.out.println("TURNO " + turno);
                 break;
                 
             case 2:
                 seleccion = 2;
                 
                 System.out.println("medir la distancia \n");
                 break;
                 
             case 3:
                 seleccion = 3;
                 
                 System.out.println("mover su nave \n");
                 break;
                 
             case 4:
                 seleccion = 4;
                 
                 System.out.println("ver planeta \n");
                 break;
	     case 5:
                 seleccion = 5;
                 
                 System.out.println("consultar flota \n");
                 break;
	     case 6:
                 seleccion = 6;
                 
                 System.out.println("ir a tienda \n");
                 break;
         }
         }
     }while(seleccion !=0);

	}

}


  
	

