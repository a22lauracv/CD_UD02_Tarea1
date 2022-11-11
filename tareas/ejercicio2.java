import java.util.Scanner;
 
public class Ejercicio2 {
 
    public static void main(String[] args) {
        System.out.println("Introduce al menos 4 nombres de persona: ");
        System.out.println("¿Cúantos nombres quieres añadir?");
        Scanner sc = new Scanner(System.in);
        int numNombres = sc.nextInt();
        sc.nextLine();
        if (numNombres < 4) {
            System.out.println("El número de nombres introducido es incorrecto");
        } else {
            String resultado = "¡Hola "; 
            for (int i = 0; i < numNombres; i++) {
                String nombre = sc.nextLine();
                resultado = resultado + nombre;
                if (numNombres > (i + 1)) {
                    resultado = resultado + ", ";
                }
            }
            System.out.println(resultado + " !");      
        }
    }   

}

/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y 
devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */