/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calc;

/**
 *
 * @author diegotxr
 */
public class Numero implements IExpressao {

    private int n;
    
    public Numero(int n){
        this.n = n;
    }
    
    public int avaliar(){
        return n;
    }
    
    @Override
    public void add(IExpressao e) throws Exception{
            throw new Exception();
    }

}
