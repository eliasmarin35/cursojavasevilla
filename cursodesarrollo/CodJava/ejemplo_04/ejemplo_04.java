package ejemplo_04;


//Ejemplo 4 : Operadores y Aritmética :
/**
 * @author Elias
 * @date 2025-07-21
 * @version 1.0
 * 
 */

public class ejemplo_04 {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 3;
        //Producto
        System.out.println("Producto num1 * num2 " + (num1 * num2));
        //División
        System.out.println("Division de num1 y num2 es : " + (num1 / num2));
        //Módulo : resto de la division entera
        System.out.println("Módulo de num1 y num2 es : " + (num1 % num2));
        //Operadores de incremente o decremento
        num1++;
        num2--;
        System.out.println("Ahora num1 vale  lo siguiente " + num1);
        System.out.println("Ahora num2 vale  lo siguiente " + num2);
    }
}
