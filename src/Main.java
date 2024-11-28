import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println(" -------------------------- ");

        auto auto1 = new auto("Terrestre","Renault","Gris","PCW-9297",2020,0);
        auto1.datos();
        auto1.setKilometraje(230.3);

        System.out.println(" -------------------------- ");

        auto auto2 = new auto("Terrestre","Chevrolet","Vino","PIN-124",2014,150.36);
        auto2.datos();

        System.out.println(" -------------------------- ");

        moto moto = new moto("Terrestre","Susuki","Naranja",0);
        moto.datos();
        moto.caracteristicas();

        System.out.println(" -------------------------- ");

        moto moto1 = new moto("Terrestre","Susuki","Negro",3);
        moto1.datos();
        moto1.caracteristicas();

        System.out.println(" -------------------------- ");
        //LLamado a las exepciones
        System.out.println("Ingrese datos de la moto");
        System.out.println();

        moto moto2 = new moto("Terrestre","Susuki","Blanco",2);
        moto2.datosM();
        moto2.caracteristicas();

    }
}