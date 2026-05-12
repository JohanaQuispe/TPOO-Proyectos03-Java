/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1ejercicio02;

/**
 *
 * @author Unity K
 */
public class ClaseCalculadora {
    private double numero;
    
    public void setnumero(String num){
        numero = Integer.parseInt(num);
    }
    
    public String ConvertirGrados() {
        double total = (numero * 9 / 5) + 32;
        return total + " °F";
    }
    
    public String ConvertirKilometros() {
        double total = numero * 0.621371;
        return total + " millas";
    }
    
    public String ConvertirTiempo() {
        int totalm = (int) numero / 60;
        int totals = (int) numero % 60;
        return totalm + " min con " + totals + " seg";
    }
}
