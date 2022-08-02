public class Main {
    public static void main(String[] args) {

        // Condicionales
        var int numeroIf = 3;

        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else if (numeroIf = 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es positivo");
        }

        // Bucle While
        var int numeroWhile = 3;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // Bucle Do While
        var int numeroWhile = 2;
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        // Bucle For
        var in numeroFor = 0;
        for (numeroFor; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Control Switch

        var estacion = "verano";

        switch (estacion) {
            case "primavera"
                System.out.println(estacion);
            break;
            case "verano"
                System.out.println(estacion);
            break;
            case "otoño"
                System.out.println(estacion);
            break;
            case "invierno"
                System.out.println(estacion);
            break;
            default
                System.out.println("Esta variable no contiene una estación");
                break;
        }
    }
}
