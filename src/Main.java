import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Transportes transportes1 = new Transportes();
        transportes1.datos();

        System.out.println(" -------------------------- ");

        auto auto1 = new auto("Terrestre","Renault","Gris","PCW-9297",2020,0);
        auto1.datos();
        auto1.setKilometraje(230.3);

        System.out.println(" -------------------------- ");

        auto auto2 = new auto("Terrestre","Chevrolet","Vino","PIN-124",2014,150.36);
        auto2.datos();


        System.out.println(" -------------------------- ");

        moto moto1 = new moto("Terrestre","Susuki","Negro",2);
        moto1.datos();
        moto1.caracteristicas();

        System.out.println(" -------------------------- ");

        moto moto2 = new moto("Terrestre","Susuki","Blanco",5);
        moto2.datos();
        moto2.caracteristicas();

    }
}