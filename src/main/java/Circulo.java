public class Circulo {

    private double radio;



    private double getRadio() {

        return radio;

    }



    private void setRadio(double radio) {

        this.radio = radio;

    }



    public double calculararea(){

        double area;

        area = (3.1416*Math.pow(radio,2));

        return area;

    }



    public double calculardiametro(){

        double diametro;

        diametro = (radio*2);

        return diametro;

    }



    public double calcularcircunferencia(){

        double circunferencia;

        circunferencia = 3.1416 * (2*radio);

        return circunferencia;

    }



    public Circulo(){

        System.out.println("No sirvo para nada");

    }



    public Circulo(double radio){

        this.radio = radio;

    }



    @Override

    public String toString() {

        return "El circulo tiene un radio de " +radio

                + "\n El área del círculo es " + calculararea()

                + "\n El diámetro del círculo es " +calculardiametro()

                + "\n La circunferencia del círculo es " +calcularcircunferencia();

    }

}
