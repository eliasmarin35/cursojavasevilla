package ejercicio_02;

/** Con if
 * 📊 Evaluación de nota:
Dada una nota numérica del 0 al 10, muestra:
🏅 "Sobresaliente" si es mayor o igual a 9
✅ "Notable" si es 7 u 8
✔️ "Aprobado" si es 5 o 6
❌ "Suspendido" si es menor de 5
 * 
 * 
 */

public class ejercicio_02 {
    public static void main(String[] args) {
        float nota = 6.5f;
        
        if (nota >= 5.0) {
            if ((nota == 5.0f) || (nota == 6.0f)) {
                System.out.println("Tiene un aprobado.");
            }
            if ((nota >= 7.0f) || (nota <= 8.0f)) {
                System.out.println("Tiene un Notable.");
            }
            if (nota >= 9.0f) {
                System.out.println("Tiene un Sobresaliente.");
            }
        } else {
            System.out.println("Esta usted suspendido");
        }

    }
}
