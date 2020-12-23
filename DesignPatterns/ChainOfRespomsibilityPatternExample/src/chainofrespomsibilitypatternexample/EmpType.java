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
public class EmpType {

    public static double checkEmpType(EmpCode empCode) {
        switch (empCode) {
            case MANAGER:
                return 200000.00;
            case ENGINEER:
                return 150000.00;
            case ASSOCIATE:
                return 100000.00;
            default:
                return 50000.00;
        }
    }
}
