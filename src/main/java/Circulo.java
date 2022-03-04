public class Circulo {
    private double radio;

    private double getRadio() {
        return radio;
    }

    private void setRadio(double radio) {
        this.radio = radio;
    }

    private double calculararea(){
        double area;
                area = (3.1416*Math.pow(radio,2));
        return area;
    }

    private double calculardiametro(){
        double diametro;
                diametro = (radio*2);
                return diametro;
    }

    private double calcularcircunferencia(){
        double circunferencia;
            circunferencia = 3.1416 * (2*radio);
        return circunferencia;
    }

    public Circulo(){
        System.out.println("No sirvo para nada");
    }

    public Circulo(){

    }
}

