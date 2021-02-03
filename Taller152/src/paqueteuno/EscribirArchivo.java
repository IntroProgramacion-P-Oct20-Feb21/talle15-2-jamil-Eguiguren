package paqueteuno;

import java.util.Formatter;
import paquetetres.*;

public class EscribirArchivo {

    public static void principal(String valor) {
        try {
            Formatter salida = new Formatter("data/Problema01");
            salida.format("%s\n", valor);
            salida.close();
        } catch (Exception e) {
            System.err.println("Error al crear Archivo");
            System.exit(1);
        }
    }
}
