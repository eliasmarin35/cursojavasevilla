package ejercicio_01;

/**
 * 👶👦🧑 Clasificación por edad:
 * Escribe un programa que indique si una persona es un niño (menor de 12), un
 * adolescente (entre 12 y 17), o un adulto (18 o más), usando una estructura
 * if-else.
 * 
 * 
 * 
 */

public class ejercicio_01 {
    public static void main(String[] args) {
        
        int edad = 122;
        if (edad < 18) {
            System.out.println("Es menor de edad.\n");
            if (edad < 12) {
                System.out.println("Y encima eres un niño\n");
            } else {
                System.out.println("Y encima eres un adolescente,\n");
            }
        } else {
            System.out.println("Es usted un adulto.\n");
        }
    }
}
