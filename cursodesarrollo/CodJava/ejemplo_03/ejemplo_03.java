package ejemplo_03;


// Se genera el JavaDOC
/**
 *
 * @author cursodesarrollo
 * @version 1.0
 * @date 2025-07-17
 */
public class ejemplo_03 {
    public static void main(String[] args) {
        // Tipo String -> cadena caracteres (objeto)
        String nombre = "Curso Desarrollo";
        
        // Creo un objeto a partir de nuestra plantilla
        Persona alumno1 = new Persona();
        
        // Impresiones
        System.out.println("Nombre curso: " + nombre);
        alumno1.imprimirDatos();
    }
    // Voy a crear una plantilla para definir ALUMNOS
    static class Persona {
        // Definir las propiedades
        String nombre;
        int edad;
        boolean genero;

        // El constructor
        Persona () {
            this.nombre = "Iván";
            this.edad = 49;
            this.genero = false;
        }
    
    // Defino un método (imprimir)
        public void imprimirDatos () {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Género: " + genero);
        }
    }
}
