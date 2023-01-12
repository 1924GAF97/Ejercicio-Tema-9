public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.Nombre("Fernando A. Velez");
        cliente.Edad(27);
        cliente.Phone(123456789);
        cliente.Credit(30000);


        System.out.println(cliente.Nombre);
        System.out.println("Edad: " + cliente.Edad);
        System.out.println("Teléfono: " + cliente.Phone);
        System.out.println("Linea de Credito: " + cliente.Credit);



        Trabajador trabajador = new Trabajador();
        trabajador.Nombre("Jorge W. Morales");
        trabajador.Edad(45);
        trabajador.Phone(987654321);
        trabajador.Salario(5000);


        System.out.println(trabajador.Nombre);
        System.out.println("Edad: " + trabajador.Edad);
        System.out.println("Teléfono: " + trabajador.Phone);
        System.out.println("Salario mensual: " + trabajador.Salario);
    }
}

class Persona{
    int Edad;
    String Nombre;
    int Phone;
}

class Cliente extends Persona{
    int Credit;

    public void Nombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void Edad(int Edad) {
        this.Edad = Edad;
    }
    public void Phone(int Phone) {
        this.Phone = Phone;
    }
    public void Credit(int Credit) {
        this.Credit = Credit;
    }
}

class Trabajador extends Persona{
    int Salario;


    public void Nombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void Edad(int Edad) {
        this.Edad = Edad;
    }
    public void Phone(int Phone) {
        this.Phone = Phone;
    }

    public void Salario(int Salario){
        this.Salario = Salario;
    }
}

