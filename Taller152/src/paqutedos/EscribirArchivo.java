package paqutedos;

import java.util.Formatter;

public class EscribirArchivo {

    public static void file(String datos) {
        try {
            Formatter out = new Formatter("data/Problema02");
            out.format("%s\n", datos);
            out.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo");
            System.exit(1);
        }
    }

}
