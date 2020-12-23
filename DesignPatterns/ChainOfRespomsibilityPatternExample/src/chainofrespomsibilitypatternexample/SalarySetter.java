/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofrespomsibilitypatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class SalarySetter extends Handler {
    
    @Override
    public double applySalary(Payment payment) {
        return handler.applySalary(payment);
    }
    
}
