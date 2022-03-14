public class Main {

    public static void main(String[] args) {

        Circulo objetoredondosinservir = new Circulo();

        Circulo objetoredondo = new Circulo(5);

        System.out.println("El área es: " + objetoredondo.calculararea());

        System.out.println("El diametro es: " + objetoredondo.calculardiametro());

        System.out.println("La circunferencia es: " + objetoredondo.calcularcircunferencia());

        System.out.println(objetoredondo.toString());



    }

}