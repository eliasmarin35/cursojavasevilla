package ejemplo_06;

//Ejemplo 06 : Otros operadores
/*
 *  > < <= >= = != Comparaciones condicionales
 * 
 * && || ! - AND OR NOT Operadores lógicos, los universales XOR, NAND 
 */

public class ejemplo_06 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 11;

        System.out.println("num1 es mayor que num2 ? " + (num1 > num2));
        System.out.println("num1 es igual que num2 ? " + (num1 == num2));
        System.out.println("OR " + ((num1 > num2)||(num1 == num2)));
    }
}
