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
        int nota = 1;
        
        if (nota >= 5) {
            if ((nota == 5) || (nota == 6)) {
                System.out.println("Tiene un aprobado.");
            }
            if ((nota == 7) || (nota == 8)) {
                System.out.println("Tiene un Notable.");
            }
            if (nota >= 9) {
                System.out.println("Tiene un Sobresaliente.");
            }
        } else {
            System.out.println("Esta usted suspendido");
        }

    }
}
