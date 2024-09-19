package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class contaBancariaTest {

    ContaBancaria cb = new ContaBancaria("joao", 123, 0.0f);

    @Test
    public void testGetTitular(){
        assertEquals("joao", cb.getTitular());
    }

    @Test
    public void testdepositar(){
        cb.depositar(1.2f);
        //assertEquals(1.2f, cb.getSaldo());
    }

    @Test
     public void testsacar(){
        cb.depositar(1000.0f);
        cb.sacar(500.0f);
        assertEquals(500.0f, cb.getSaldo());
    }

}
