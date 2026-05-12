/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1ejercicio08;
import java.util.InputMismatchException;

/**
 *
 * @author Unity K
 */
public class ClaseDivision {
    private double n1, n2;
    
    public void setnumero(String num1, String num2){
        try {
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);
        } catch (Exception e) {
            n1 = Double.NaN;
        }
    }
    
    public String Division() {
        try {
            if (Double.isNaN(n1)) { 
                throw new InputMismatchException("Solo colocar números.");
            }
            if (n2 == 0) {
                throw new ArithmeticException("No se admite el 0 para dividir");
            }
            return String.valueOf(n1 / n2); 
        } catch (ArithmeticException | InputMismatchException e) {
            return e.getMessage();
        }
    }
}
