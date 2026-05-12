package ejercicio9;
public class VerificarEdad {
    private int edad;

    public VerificarEdad(String edadTexto) {
        // Primero validamos que sea un número
        this.edad = Integer.parseInt(edadTexto);
    }

    public void verificarEdad() throws IllegalArgumentException {
        if (this.edad < 18) {
            // Lanzamos la excepción con un mensaje personalizado
            throw new IllegalArgumentException("Acceso Denegado: Debes ser mayor de 18 años para registrarte.");
        }
    }

    public String getMensajeExito() {
        return "Registro exitoso. Edad válida: " + edad;
    }
}