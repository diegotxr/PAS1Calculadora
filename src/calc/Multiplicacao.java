/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diegotxr
 */
public class Multiplicacao implements IExpressao {

    private List<IExpressao> num = new ArrayList<IExpressao>();

    public Multiplicacao() {
    }

    public void add(IExpressao n) {
        num.add(n);
    }

    public int avaliar() {
        int result = 1;
        for (int i = 0; i < num.size(); i++) {
            result *= num.get(i).avaliar();
        }
        return result;
    }
}
