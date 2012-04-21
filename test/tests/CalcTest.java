/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import calc.IExpressao;
import calc.Multiplicacao;
import calc.Numero;
import calc.Soma;
import calc.Subtracao;
import calc.Divisao;

/**
 *
 * @author diegotxr
 */
public class CalcTest {

    @Test
    public void testAvaliacaoDoNumero() {
        Numero n = new Numero(10);
        int resultado;
        resultado = n.avaliar();
        assertEquals(10, resultado);
    }

    @Test
    public void testAvaliacaoDaSoma() {
        Numero n1 = new Numero(1);
        Numero n2 = new Numero(2);
        Soma s = new Soma();
        s.add((IExpressao) n1);
        s.add((IExpressao) n2);

        assertEquals(3, s.avaliar());
    }

    @Test
    public void testSomaAvancada() throws Exception {
        IExpressao n1 = new Numero(1);
        IExpressao n2 = new Numero(2);
        IExpressao n3 = new Numero(5);
        IExpressao s = new Soma();
        s.add(n1);
        s.add(n2);

        IExpressao s2 = new Soma();
        s2.add(n3);
        s2.add(s);
        assertEquals(8, s2.avaliar());
    }

    @Test
    public void testMultiplicacao() throws Exception {
        IExpressao m = new Multiplicacao();
        IExpressao n2 = new Numero(45);
        IExpressao n3 = new Numero(0);
        m.add(n2);
        m.add(n3);
        assertEquals(0, m.avaliar());
    }

    @Test
    public void testMultiSoma() throws Exception {
        IExpressao m = new Multiplicacao();
        IExpressao s = new Soma();

        IExpressao n2 = new Numero(2);
        IExpressao n3 = new Numero(5);
        IExpressao n4 = new Numero(3);
        IExpressao n5 = new Numero(7);
        m.add(n2);
        m.add(n3);
        s.add(m);
        s.add(n4);
        s.add(n5);
        assertEquals(20, s.avaliar());
    }

    @Test
    public void testSubtracao() throws Exception {
        IExpressao sb = new Subtracao();
        IExpressao n2 = new Numero(15);
        IExpressao n3 = new Numero(12);
        sb.add(n2);
        sb.add(n3);
        assertEquals(3, sb.avaliar());
    }

    @Test
    public void testDivisao() throws Exception {
        IExpressao d = new Divisao();
        IExpressao n2 = new Numero(44);
        IExpressao n3 = new Numero(10);
        IExpressao n4 = new Numero(1);
        d.add(n2);
        d.add(n3);
        Divisao d1 = new Divisao();
        d1.add(d);
        d1.add(n4);
        assertEquals(4, d1.avaliar());
    }
}
