public class Main {
    public static void main(String[] args) {
        var numero = 0;

        int variableIf = numero;

        if (variableIf == 0) {
            System.out.println("El numero es cero");
        } else if (variableIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }


        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile == 0);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }

        var estacion = "primavera";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otonio":
                System.out.println("es otonio");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println(estacion);
        }
    }
}