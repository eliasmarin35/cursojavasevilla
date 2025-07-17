package cursodesarrollo.CodJava.ejemplo_02;

// Ejemplo 2 : Tipado en Java

/* 
- Tipos primitivos :
  - boolean - booleanos (true o false)
  - char - caracter
  - string - Cadena de caracteres
- Tipos numéricos enteros :
  - byte - entero muy pequeño, ocuoa 1byte (-128 - 127)[1byte]
  - short - entero pequeño (- 32000 - 32000) ocupa [2byte]
  - int - entero (aproximadamente (-2³¹ - 2³⁰) ocupa [4bytes]
  - long - entero grande (-2⁶³-2⁶²) ocupa [8bytes]
- Tipos de comas flotante:
  - float - es un coma flotante o decilmal, valores (-3,4³⁸ - 3,4³⁷)[4bytes]
  - double - es un decimal muy grande y rango de (1,79³⁰⁸)[8bytes]
 */

public class ejemplo_02 {
    public static void main(String[] args) {
        boolean genero = true;

        char letra;
        letra = 'I';
        int numeroEntero = 10;
        
        float numDecimal = 9.6f;
        double numDecimalTocho = 7.5;
        
        
        
        // Impresion de variables :
        
        System.out.println("Tu género es : " + genero);
        System.out.println("Letra es : " + letra);
        System.out.println("Mi número es : " + numeroEntero);
        System.out.println("Mi decimal es " + numDecimal);
        System.out.println("Mi decimal tocho es :" + numDecimalTocho);
        
        

    }

}
