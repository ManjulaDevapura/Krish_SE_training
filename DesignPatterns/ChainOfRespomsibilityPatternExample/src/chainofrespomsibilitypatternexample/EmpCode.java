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
public enum EmpCode {
    INTERN("INTERN"), ASSOCIATE("ASSOCIATE"), ENGINEER("ENGINEER"), MANAGER("MANAGER");

    private final String value;

    private EmpCode(String value) {
        this.value = value;
    }

    public String getEmpCode() {
        return value;
    }
}
