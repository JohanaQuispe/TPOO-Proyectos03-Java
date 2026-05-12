/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.c3;

/**
 *
 * @author FABRIZZIO
 */
public class Auto {
     // Clase interna
    class Motor {
        public String tipoMotor() {
            return "V8";
        }
    }

    // Método para usar el motor
    public String mostrarMotor() {
        Motor m = new Motor();
    return  m.tipoMotor();
    }
}
