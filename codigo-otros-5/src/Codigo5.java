import java.util.Scanner;

public class Codigo5 {
	
		public static void main(String[] args) {
		//Agregamos Systen.in a nuestro scanner
		//Importamos libreria Scanner
	    Scanner s = new Scanner(System.in);
	    //Ambas comillas deben son dobles para mostar un String
	    System.out.print("Introduzca un n�mero: ");
	    //Convertinos ni a tipo int y cambiamos el metodo nextLine() a nextInt()
	    int ni = s.nextInt();
	    
	    //Hacemos un respaldo de nuestro numero porque iremos analizando cada uno de los digitos.
	    int c = ni;
	    
	    // Inicialiazamos contadores  para los digitos afortunado y no afortunados
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
	    	//Se obtiene el �ltimo d�gito del n�mero
		  int digito = (ni % 10);
		  // Se verifica si el d�gito es uno de los n�meros considerados afortunados
	      if ((digito == 3) || (digito == 5) || (digito == 7) || (digito == 13)) {
			afo++;
	      } else {
			noAfo++;
		  
	      }
	      //Se elimina el �ltimo d�gito del n�mero ingresado
		  ni /= 10;
	     
	    }
	    
	    //Si la cantidad de digitos del numero ingresado son afortunados y mayor a los no afortunados imprimira el numero ingresado es afortunado. 
	    if (afo > noAfo) {
	    	//Se corrije el prinln por println
	      System.out.println("El " + c + " es un n�mero afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un n�mero afortunado.");
	    }
	    
	}
}
