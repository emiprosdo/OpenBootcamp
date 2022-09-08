public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(33);
        cliente.setNombre("Jorgelina");
        cliente.setTelefono(12345678);
        cliente.setCredito(1500);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(39);
        trabajador.setNombre("Emiliano");
        trabajador.setTelefono(87654321);
        trabajador.setSalario(4500);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;


    public void Persona() {
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}


class Cliente extends Persona {
    private int credito;

    public void Cliente(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;


    public void Trabajador(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
