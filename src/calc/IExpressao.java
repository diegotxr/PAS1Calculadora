/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calc;

/**
 *
 * @author diegotxr
 */
public interface IExpressao {

    public int avaliar();
    public void add(IExpressao e) throws Exception;
    
}
