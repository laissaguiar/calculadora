package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraTesteOperacao {
     private CalculadoraTeste calc;

    /**
     *
     */
    @BeforeEach
    public void setUp() {
        calc = new CalculadoraTeste();
    }

    // Testes para soma

    /**
     *
     */
    @Test
    public void testSomarNumPositivos() {
        assertEquals(15, calc.SomarDoisNumPositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testSomarNumPositivoNumNegativo() {
        assertEquals(5, calc.SomarNumPositivoNumNegativo(10, -5));
    }

    /**
     *
     */
    @Test
    public void testSomarNumNegativoNumPositivo() {
        assertEquals(5, calc.SomarNumNegativoNumPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testSomarDoisNegativos() {
        assertEquals(-15, calc.SomarDoisNumNegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testSomarNumPositivoNumZero() {
        assertEquals(10, calc.SomarNumPositivoNumZero(10, 0));
    }

    /**
     *
     */
    @Test
    public void testSomarNumNegativoNumZero() {
        assertEquals(-10, calc.somarNumNegativoNumZero(-10, 0));
    }

    /**
     *
     */
    @Test
    public void testSomarNumZeroNumNegativo() {
        assertEquals(-5, calc.somarNumZeroNumNegativo(0, -5));
    }

    /**
     *
     */
    @Test
    public void testSomarNumZeroNumPositivo() {
        assertEquals(5, calc.somarNumzeroNumPositivo(0, 5));
    }

    /**
     *
     */
    @Test
    public void testSomarDoisZero() {
        assertEquals(0, calc.somarDoisNumZero(0, 0));
    }
    
    // Testes para subtração

    /**
     *
     */
    @Test
    public void testSubNumPositivos() {
        assertEquals(5, calc.SubtrairDoisNumPositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testSubNumPositivoNumNegativo() {
        assertEquals(15, calc.SubtrairNumpositivoNumNegativo(10, -5));
    }

    /**
     *
     */
    @Test
    public void testSubNumNegativoNumPositivo() {
        assertEquals(-15, calc.SubtrairNumNegativoNumPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testSubDoisNegativos() {
        assertEquals(-5, calc.SubtrairDoisNegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testSubNumPositivoNumZero() {
        assertEquals(10, calc.SubtrairNumpositivoNumZero(10, 0));
    }

    /**
     *
     */
    @Test
    public void testSubNumNegativoNumZero() {
        assertEquals(-10, calc.SubtrairNumNegativoNumZero(-10, 0));
    }

    /**
     *
     */
    @Test
    public void testSubDoisZero() {
        assertEquals(0, calc.SubtrairNumZero(0, 0));
    }
    
    // Testes para multiplicação

    /**
     *
     */
    @Test
    public void testMultDoisPositivos() {
        assertEquals(50, calc.MultiplicarNumPositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testMultNumNegativoNumPositivo() {
        assertEquals(-50, calc.MultiplicarNumNegativoPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testMultDoisNegativos() {
        assertEquals(50, calc.MultiplicarNumNegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testMultNumPositivoNumZero() {
        assertEquals(0, calc.MultiplicarNumZero(10, 0));
    }

    /**
     *
     */
    @Test
    public void testMultNumnegativoNumZero() {
        assertEquals(0, calc.MultiplicarNumNegativoNumZero(-10, 0));
    }

    /**
     *
     */
  
    
    // Testes para divisão

    /**
     *
     */
    @Test
    public void testDivDoisPositivos() {
        assertEquals(2, calc.DividirNumPositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testDivNumPositivoNumNegativo() {
        assertEquals(-2, calc.DividirNumPositivoNumNegativo(10, -5));
    }

    /**
     *
     */
    @Test
    public void testDivNumNegativoNumPositivo() {
        assertEquals(-2, calc.DividirNumNegativoNumPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testDivDoisNegativos() {
        assertEquals(2, calc.DividirNumNegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testDivNumPositivoNumZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.DividirNumPositivoNumZero(10, 0);
        });
    }

    /**
     *
     */
    @Test
    public void testDivNumNegativoNumZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.DividirNumNegativoNumZero(-10, 0);
        });
    }

    /**
     *
     */
    @Test
    public void testDivDoiszero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.DIvidirNumNegativos(10, 0);
        });
    }

    

}
