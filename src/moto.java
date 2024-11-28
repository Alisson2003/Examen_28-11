public class moto extends Transportes{
    int numeroLlantas;

    public moto() {

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

    @Override
    public void datos(){
        super.datos();
    }

    public void datosMoto() {
        System.out.println("Numero de llantas: " + getNumeroLlantas());
    }

    public void caracteristicas(){

        try {
            if (numeroLlantas == 2 ){
                datosMoto();
            }else if (numeroLlantas >= 3){
                System.out.println("El numero de llantas no existe");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
