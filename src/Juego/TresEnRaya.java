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
		int contador = 0;
		int ganador1 = 0;
		int ganador2 = 0;
		int revancha = 0;
		int empate = 0;
		
		
		String [] [] basematriz = {{" ","|"," ","|"," "},
                				   {"-","|","-","|","-"},
                                   {" ","|"," ","|"," "},
                                   {"-","|","-","|","-"},
                                   {" ","|"," ","|"," "}};
		
		
		String [] [] resetbasematriz = {{" ","|"," ","|"," "},
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
		
			
			while (true) {
				
				
				
				// Partida Jugador 1
				
				System.out.println();
				System.out.println(jugador1 + " Que fila eliges: ");
				jugador1fila = sc.nextInt();
				
				System.out.println(jugador1 + " Que columna eliges: ");
				jugador1columna = sc.nextInt();
				
				while (!basematriz[jugador1fila][jugador1columna].equals(" ")) {
				    System.out.println("Esta casilla ya está ocupada, elige otra.");
				    System.out.println();
				    System.out.println(jugador1 + " Que fila eliges: ");
				    jugador1fila = sc.nextInt();
				    System.out.println(jugador1 + " Que columna eliges: ");
				    jugador1columna = sc.nextInt();
				}
				
				
				if(basematriz[jugador1fila][jugador1columna] == " ") {
					   basematriz[jugador1fila][jugador1columna] = "O";
				   } 
				   
			   System.out.println();
			   for (int i = 0; i < basematriz.length; i++) {
					
				    for (int j = 0; j < basematriz[i].length; j++) {
				        System.out.print(basematriz[i][j] + " ");	
				
				    }

				    System.out.println("");
				}
			    contador ++;

				  if(contador == 5) {
					  System.out.println();
					  System.out.println("Empate");
					  break;
				  }

					//Comprobar que ha ganado Jugador 1

				  if(basematriz[0][0].equals("O") && basematriz[0][2].equals("O") && basematriz[0][4].equals("O") 
				  || basematriz[2][0].equals("O") && basematriz[2][2].equals("O") && basematriz[2][4].equals("O")
				  || basematriz[4][0].equals("O") && basematriz[4][2].equals("O") && basematriz[4][4].equals("O")
				  || basematriz[0][0].equals("O") && basematriz[2][0].equals("O") && basematriz[4][0].equals("O")
				  || basematriz[0][2].equals("O") && basematriz[2][2].equals("O") && basematriz[4][2].equals("O")
				  || basematriz[0][4].equals("O") && basematriz[2][4].equals("O") && basematriz[4][4].equals("O")
				  || basematriz[0][0].equals("O") && basematriz[2][2].equals("O") && basematriz[4][4].equals("O")
				  || basematriz[0][4].equals("O") && basematriz[2][2].equals("O") && basematriz[4][0].equals("O")) {
					  System.out.println();
					   System.out.println("Has ganado " + jugador1);
					   ganador1 ++;
					   break;
				   }
				  

			// Partida Jugador 2
			   
			    		System.out.println();
						System.out.println(jugador2 + " Que fila eliges: ");
						jugador2fila = sc.nextInt();
						
						System.out.println(jugador2 + " Que columna eliges: ");
						jugador2columna = sc.nextInt();
						
						while (!basematriz[jugador2fila][jugador2columna].equals(" ")) {
						    System.out.println("Esta casilla ya está ocupada, elige otra.");
						    System.out.println();
						    System.out.println(jugador2 + " Que fila eliges: ");
						    jugador2fila = sc.nextInt();
						    System.out.println(jugador2 + " Que columna eliges: ");
						    jugador2columna = sc.nextInt();
						}
						
						if(basematriz[jugador2fila][jugador2columna] == " ") {
							   basematriz[jugador2fila][jugador2columna] = "X";
						   } 
						   
						   
					   System.out.println();
					   for (int i = 0; i < basematriz.length; i++) {
							
						    for (int j = 0; j < basematriz[i].length; j++) {
						        System.out.print(basematriz[i][j] + " ");	
						    }

						    System.out.println("");
						    
						}

						//Comprobar que ha ganado Jugador 2

					   if(basematriz[0][0].equals("X") && basematriz[0][2].equals("X") && basematriz[0][4].equals("X") 
					   || basematriz[2][0].equals("X") && basematriz[2][2].equals("X") && basematriz[2][4].equals("X")
					   || basematriz[4][0].equals("X") && basematriz[4][2].equals("X") && basematriz[4][4].equals("X")
					   || basematriz[0][0].equals("X") && basematriz[2][0].equals("X") && basematriz[4][0].equals("X")
					   || basematriz[0][2].equals("X") && basematriz[2][2].equals("X") && basematriz[4][2].equals("X")
					   || basematriz[0][4].equals("X") && basematriz[2][4].equals("X") && basematriz[4][4].equals("X")
					   || basematriz[0][0].equals("X") && basematriz[2][2].equals("X") && basematriz[4][4].equals("X")
					   || basematriz[0][4].equals("X") && basematriz[2][2].equals("X") && basematriz[4][0].equals("X")) {
						System.out.println();
						System.out.println("Has ganado " + jugador2);
						ganador2 ++;
						break;
						}
				
				
				}
				
				// Puntos 
				
				System.out.println();
				System.out.println("Puntuacion de " + jugador1 + ": " + ganador1);
				System.out.println("Puntuacion de " + jugador2 + ": " + ganador2);
				System.out.println("");
				System.out.println("Revancha?");
				System.out.println("1 = Si");
				System.out.println("-1 = No");
				revancha = sc.nextInt();
				System.out.println();
				
			}
			
			if(revancha == 1) {
				contador = 0;
				basematriz = resetbasematriz;
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
