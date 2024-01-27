package OperadoresAsignacion;
import java.util.*;

public class condicionales {
    public static void main(String[] args) {
        int numero1, num_secreto = 4;
        do {

            //Adivina un número del 1 al 5 (número secreto: 4)
            
            //Solicitamos el dato al usuario y lo guardamos
            System.out.println("Introduce un número del 1 al 5:");
            Scanner datosp = new Scanner(System.in);
            numero1 = datosp.nextInt();
            
            if(numero1 <= 5){
                if(numero1 == num_secreto){
                    System.out.println("Has acertado, el número secreto es: " + num_secreto);
                }
                else {
                    System.out.println("Intentalo otra vez.");
                }
            } else {
                System.out.println("El número no está dentro del rango (1 al 5).");
            }
            datosp.close();
        } while (numero1 != num_secreto);
    } 
}
