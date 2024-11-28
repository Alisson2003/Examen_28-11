import java.util.Scanner;

public class moto extends Transportes{
    int numeroLlantas;

    public moto() {

    }
    public moto(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public moto(String tipo, String marca, String color, int numeroLlantas) {
        super(tipo, marca, color);
        this.numeroLlantas = numeroLlantas;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public void datosMoto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la placa de la moto");
        String placa = sc.nextLine();
        System.out.println("Ingrese el color de la moto");
        String color = sc.nextLine();
        System.out.println("Ingrese el tipo de la moto");
        String tipo = sc.nextLine();
        System.out.println("La placa es: " + placa);
        System.out.println("El color es: " + color);
        System.out.println("El tipo es: " + tipo);
    }


    public void datosM() {
        datosMoto();
        System.out.println("Numero de llantas: " + getNumeroLlantas());
    }

    public void caracteristicas(){

        try {
            if (numeroLlantas == 2 ){
                datosM();
            }else if (numeroLlantas == 0){
                System.out.println("El numero de llantas no existe");
            }else if (numeroLlantas >= 3){
                System.out.println("El numero de llantas no existe");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
