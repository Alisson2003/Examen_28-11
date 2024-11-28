
public class auto extends Transportes{
    String placa;
    int anioFabricacion;
    double kilometraje;

    public auto() {

    }

    public auto(String tipo, String marca, String color, String placa, int anioFabricacion, double kilometraje) {
        super(tipo, marca, color);
        this.placa = placa;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public void datos() {
        super.datos();
        System.out.println("Placa: " + getPlaca());
        System.out.println("Año Fabricacion: "+ getAnioFabricacion());
        mostrar();
    }

    public void mostrar() {
        System.out.println("kilometraje: " + getKilometraje());
    }
}
