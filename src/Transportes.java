public class Transportes {
    String tipo;
    String marca;
    String color;

    public Transportes(){

    }

    public Transportes(String tipo, String marca, String color) {
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void datos(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
    }
}
