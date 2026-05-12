package ejercicio10;
import java.io.IOException;
import java.io.*;

public class ClaseArchivo {
    private String nombre;

    public ClaseArchivo(String nombre) {
        this.nombre = nombre;
    }

    public void leerArchivo() throws IOException {
        File f = new File(this.nombre);
        FileReader fr = new FileReader(f); 
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println("Leyendo primera línea: " + br.readLine());
        br.close();
    }
}
