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
public class Divisao implements IExpressao {

    private List<IExpressao> num = new ArrayList<IExpressao>();

    public Divisao() {
    }

    public void add(IExpressao n) {
        num.add(n);
    }

    public int avaliar() {
        int result = 0;
        for (int i = 0; i < num.size()-1; i++) {
            result = num.get(i).avaliar()/num.get(i+1).avaliar();
        }
        return result;
    }
}
