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
public abstract class Handler {
    public Handler handler;
    
    public void setHandler(Handler handler){
        this.handler = handler;
    }
    
    public  abstract double applySalary(Payment payment);
    
}
