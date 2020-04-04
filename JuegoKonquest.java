/* Este programa en Java es para realizar el JuegoKonquest,  juego de estrategia por turnos en el que dos jugadores pueden conquistar planetas enviando naves con guerreros para poder construir un gran imperio al conquistar todos los planetas disponibles.
El desarrollo del juego se dá en un mapa que consiste en un tablero dividido en cuadros,
cada cuadro puede o no contener un planeta y cada jugador empieza con un planeta inicial
desde el cual iniciará su conquista.

Al ejecutar el programa no hay mapas pero el usuario puede diseñarlos desde la opción
Diseñar mapa, ​ estos mapas deben estar disponibles durante toda la ejecución del
programa por si se desean usar de nuevo. Además, también se pueden cambiar los
atributos de los mapas después de ser diseñados.

El jugador que conquiste todos los planetas del mapa gana.

*/

//Diseñar jugador - mapas - tablero  - juego
import java.util.*;
import java.util.Scanner;
package Juegos;

public class JuegoKonquest {
    public static int ancho = 10;
    public static int altura = 10;
    
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("**** Bienvenido al JuegoKonquest ****");
	
        System.out.println(PlanetaNeutral.probabilidadAparecer);
	System.out.println(MaestroDeObra.nombre());
	}
}

    
//Diseñar planetas



//Diseñar guerreros



//Diseñar constructores



//Diseñar naves



//Diseñar tienda de naves


