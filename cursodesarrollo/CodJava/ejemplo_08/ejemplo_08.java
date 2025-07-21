package ejemplo_08;

//ejemplo 8 : switch

// ahora tambien se puede hacer con -> caso case quitandose el break 

public class ejemplo_08 {
    public static void main(String[] args) {
        System.out.println("-- CAFETERIA AVANTE  -- + \n" +
                            "-- 1. Cafe \n" +
                            "-- 2. Te \n" +
                            "-- 3. Zumo \n");
        int opcion = 1;
        
        
        switch (opcion) {
            case 1:
                System.out.println("Has pedido Cafe.");
                break;
            case 2:
                System.out.println("Has pedido Te.");
                break;
            case 3:
                System.out.println("Has pedido Zumo.");
                break;
        
            default:
                break;
        }

        String opcion2 = "A";
        switch (opcion2) {
            case "A" -> System.out.println("Elegiste A");
            case "B" -> System.out.println("Elegiste B");
            case "C" -> System.out.println("Elegiste C");
            default -> System.out.println("Opción no válida");
        }
    }
}
