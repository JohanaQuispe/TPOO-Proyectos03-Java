package trabajocampo;
public class Contador {

    private static int totalObjetos = 0;

    public Contador() {
        totalObjetos++;
    }

    public static int getMostrarTotal() {
        return totalObjetos;
    }
}
