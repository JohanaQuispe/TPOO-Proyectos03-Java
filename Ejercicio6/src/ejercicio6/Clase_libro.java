package ejercicio6;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Clase_libro {
    
    String titulo;
    String[] nombreColumna = {"Libro", "Nro. Página", "Contenido", "Día", "Fecha", "Hora"};
    Object[][] datos;

    public Clase_libro(String titulo, int cantidadPaginas) {
        this.titulo = titulo;
        this.datos = new Object[cantidadPaginas][6]; 
    }

    public class Pagina {
        int numeroPagina;
        String contenido;
        private Date fecha; 

        public Pagina(int numeroPagina, String contenido) {
            this.numeroPagina = numeroPagina;
            this.contenido = contenido;
            
            this.fecha = new Date(); 
        }


        public String getFecha() {
            String xfecha;
            DateFormat xformatofecha = new SimpleDateFormat("dd/MM/yyyy");
            xfecha = xformatofecha.format(fecha);
            return xfecha;
        }

        public String getHora() {
            String xhora;
            DateFormat xformatohora = new SimpleDateFormat("HH:mm:ss");
            xhora = xformatohora.format(fecha);
            return xhora;
        }

        public String getDiadeSemana() {
            String xDiaDeSemana;
            DateFormat xformatoDiaDeSemana = new SimpleDateFormat("EEEE");
            xDiaDeSemana = xformatoDiaDeSemana.format(fecha);
            return xDiaDeSemana;
        }


        public void registrarEnMatriz(int fila) {
            datos[fila][0] = titulo;
            datos[fila][1] = numeroPagina;
            datos[fila][2] = contenido;
            datos[fila][3] = getDiadeSemana(); 
            datos[fila][4] = getFecha();      
            datos[fila][5] = getHora();        
        }
    }

    public DefaultTableModel llenarTabla() {
        return new DefaultTableModel(datos, nombreColumna);
    }
}