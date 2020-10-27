package tn.esprit.spring;


import static org.junit.Assert.assertTrue;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tn.esprit.spring.Money;

public class MoneyTest{
	Money m12CHF;
    Money m14CHF;
    Money expected;
    @Test
    public void testSimpleAdd()
    {m12CHF = new Money(12, "CHF");
    // cr�ation de donn�es
    m14CHF = new Money(14, "CHF");
    expected = new Money(26, "CHF");
    Money result = m12CHF.add(m14CHF);
    // ex�cution de la m�thode test�e
    assertTrue(expected.equals(result));
    // comparaison
    System.out.println("test");
    }
    @After
    public void setUp()
    {//cr�ation de donn�es
    m12CHF = new Money(12, "CHF");
    m14CHF = new Money(14, "CHF");
    expected = new Money(26, "CHF");}
}
