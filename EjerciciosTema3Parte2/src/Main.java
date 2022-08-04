public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.PonerPuertas();

        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 2;

    public void PonerPuertas(){
        this.puertas++;
    }
}