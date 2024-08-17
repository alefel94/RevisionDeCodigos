package org.generation.codigo6;

import java.util.Scanner;

public class Codigo6 {
		//1.primer detalle se remueven parentesis [] en la declaración de n
		//2. se remueven [] de 20 y el int extra en la declaración 
		    public static void main (String[] args) {  
		    
		    int [] n = new int [20];
		//4. se añade + en i para el incremento de la variable
		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 381) + 20;
		      //Se completa system.out...
		      System.out.println(n[i] + " ");
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? ");
		    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    
		    //3. se agrega parentesis al final de .readLine
		    Scanner scanner = new Scanner(System.in);
		    int opcion = scanner.nextInt();
		    //se cambia System console por Scanner
		    //int opcion = Integer.parseInt(System.console().readLine());

		    // se arregla operador ternario, se colocan en el orden correcto el "?" y los ":"
		    int multiplo = (opcion == 1) ? 5 : 7;
		    //Se agregan llaves al ciclo for, y se retira la palabra each
		    for(int e : n){
		      if (e % multiplo == 0){ 
		        System.out.println("[" + e + "] ");
		    }else{
		        System.out.println(e + " ");
		      }
		    }
		    //Se cierra el scanner
		scanner.close();
		}
		    }
