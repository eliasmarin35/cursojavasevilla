package ejemplo_07;


/**
 * Ejemplo 7 : Condicionales básicos
 * //Para comparar cadenas usamos el "equals"//
 * if
 * if-else
 * 
 * 
 */
public class ejemplo_07 {
    public static void main(String[] args) {
        String usuario = "root";
        String clave = "admin";

        String entradausuario = "root";
        String claveusuario = "admin";

        if ((entradausuario.equals(usuario)) && (claveusuario.equals(clave))) {
            System.out.println("Usurio o clave no valida.");
        }

        if ((entradausuario == usuario) && (claveusuario == clave)) {
            System.out.println("Bienvenido administrador.");
        } else {
            System.out.println("Usurio o clave no valida.");
        }
    }
}
