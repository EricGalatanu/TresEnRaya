package Juego;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Bienvenido al tres en raya (Game by Eric Galatanu)");
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String reglas;
		String jugador1;
		String jugador2;
		int jugador1fila = 0;
		int jugador1columna = 0;
		int jugador2fila = 0;
		int jugador2columna = 0;
		int moneda;
		
		
		
		String [] [] basematriz = {{" ","|"," ","|"," "},
                				   {"-","|","-","|","-"},
                                   {" ","|"," ","|"," "},
                                   {"-","|","-","|","-"},
                                   {" ","|"," ","|"," "}};
		
		
		System.out.println("Quieres saber las reglas? (Si/No)");
		reglas = sc.next();
		
		if (reglas.equalsIgnoreCase("Si")) {
			System.out.println("Reglas del juego:\r\n"
					+ "\r\n"
					+ "El juego preguntará los nombres del jugador 1 y del jugador 2.\r\n"
					+ "Se lanzará una \"moneda\" (se escoge aleatoriamente) para elegir quien empezara primero, el jugador 1 o el jugador 2.\r\n"
					+ "Los dos jugadores irán poniendo las fichas hasta que:\r\n"
					+ "Uno de los dos jugadores haya conseguido poner 3 fichas en línea, ya sea horizontalmente, verticalmente o diagonalmente.\r\n"
					+ "Haya un empate debido a que no quedan mas huecos libres en el tablero.\r\n"
					+ "Cuando termina el juego se preguntara si quieren echar la revancha o finalizar el juego.");
			System.out.println();
		}
		
		else if (reglas.equalsIgnoreCase("No")) {
			System.out.println("Perfecto, entonces empezemos con el juego :)");
			System.out.println();
		}
		
		else {
			System.out.println("Esta respuesta no esta entre las opciones, empezemos con el juego :)");
			System.out.println();
		}
		
		
		System.out.println("Jugador 1 como te quieres llamar: ");
		jugador1 = sc.next();
		System.out.println("Jugador 2 como te quieres llamar: ");
		jugador2 = sc.next();

		System.out.println("Ahora vamos a lanzar una moneda al aire para decidir quien empieza primero");
		System.out.println();
		System.out.println(jugador1 + "  eres cara");
		System.out.println(jugador2 + "  eres cruz");

		System.out.println();
		System.out.println("🪙 Lanzamiento...");
		moneda = random.nextInt(2);
		moneda ++;
		
		if(moneda == 1) {
			
			System.out.println("Cara");
			System.out.println();
			System.out.println(jugador1 + "  empezarás primero (Eres O)");
			
			
			System.out.println("Empezamos la partida");
		    System.out.println("");
		
			for (int i = 0; i < basematriz.length; i++) {
				
			    for (int j = 0; j < basematriz[i].length; j++) {
			        System.out.print(basematriz[i][j] + " ");	
			
			    }

			    System.out.println("");

			}
		
		}
		
		
			if(moneda == 2) {
			
			System.out.println("Cruz");
			System.out.println();
			System.out.println(jugador2 + "  empezarás primero (Eres X)");
			
			System.out.println("Empezamos la partida");
		    System.out.println("");
		
			for (int i = 0; i < basematriz.length; i++) {
				
			    for (int j = 0; j < basematriz[i].length; j++) {
			        System.out.print(basematriz[i][j] + " ");	
			        
			    }

			    System.out.println("");

			}
		
			}
		
		
		
	}

}
