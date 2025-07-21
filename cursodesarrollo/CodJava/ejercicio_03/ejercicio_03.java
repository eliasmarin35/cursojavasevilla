package ejercicio_03;

/**
 * ✅ Ejercicios con switch
📅 Día de la semana:

Según un número del 1 al 7, muestra el nombre del día correspondiente:
1️⃣ Lunes
2️⃣ Martes
...
7️⃣ Domingo


 
✅ Ejercicio adicional con switch
🎮 Selección de dificultad en un videojuego:

Según el nivel seleccionado por el jugador (1 al 3), muestra el texto correspondiente:
1️⃣ 🐣 "Fácil – Ideal para principiantes"
2️⃣ ⚔️ "Normal – Un buen desafío"
3️⃣ 💀 "Difícil – Solo para expertos"
 
 * 
 * 
 * 
 */
public class ejercicio_03 {
    public static void main(String[] args) {
       int diaSemana = 1;
       int dificultad = 3;
       
        switch (diaSemana) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
    
       }
       switch (dificultad) {
        case 1:
            System.out.println("Fácil");
            break;
        case 2:
            System.out.println("Normal");
            break;
        case 3:
            System.out.println("Dificil");
            break;
       }
    }
}
