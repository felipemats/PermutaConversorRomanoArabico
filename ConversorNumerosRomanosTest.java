package conversor;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class ConversorNumerosRomanosTest {
    
    ConversorNumerosRomanos conversor;
    
    @Before
    public void inicializaMetodoDeTeste() {
        conversor = new ConversorNumerosRomanos();
    }
    
    @Test
    public void deveConverterIPara1() {
        int retorno = conversor.converter('I');
        assertEquals(1, retorno);
    }

    @Test
    public void deveConverterVpara5() {
        assertEquals(5, conversor.converter('V'));
    }
    
    @Test
    public void deveConverterXpara10() {
        assertEquals(10, conversor.converter('X'));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void deveDarErroComCaracterDesconhecido() {
        conversor.converter('Z');
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void deveValidarCaracterMaiusculo() {
        conversor.converter('i');
    }

    @Test
    public void deveConverterIIpara2() {
        assertEquals(2, conversor.converter("II"));
    }
    
    @Test
    public void deveConverterIVPara4() {
        assertEquals(4, conversor.converter("IV"));
    }

    @Test
    public void deveConverterVIPara6() {
        assertEquals(6, conversor.converter("VI"));
    }
    
    @Test
    public void deveConverterIIIpara3() {
        assertEquals(3, conversor.converter("III"));
    }    
    
    @Test
    public void deveConverterVIIpara7() {
        assertEquals(7, conversor.converter("VII"));
    }    
    
    @Test
    public void deveConverterVIIIpara8() {
        assertEquals(8, conversor.converter("VIII"));
    }    
    
    @Test
    public void deveConverterIXpara9() {
        assertEquals(9, conversor.converter("IX"));
    }    
    
    @Test
    public void deveConverterLXpara60() {
        assertEquals(60, conversor.converter("LX"));
    }    
    
    @Test
    public void deveConverterICpara99() {
        assertEquals(99, conversor.converter("IC"));
    }     
    
    @Test
    public void deveConverterMDXpara1510() {
        assertEquals(1510, conversor.converter("MDX"));
    }        
}
