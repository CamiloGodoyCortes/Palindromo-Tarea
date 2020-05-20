import org.junit.Test;

import static org.junit.Assert.*;

public class palindromoTest {
    private palindromo c;


    @org.junit.Before
    public void setUp() throws Exception {
        c = new palindromo();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        c = null;

    }

    @Test
    public void testprueba1() {
        String palabraprueba = ("31013");
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, c.esPalindromo(palabraprueba));

    }
    @Test
    public void testprueba2() {
        String palabraprueba = "Neuquen";
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, c.esPalindromo(palabraprueba));
    }

    @Test
    public void testprueba3() {
        String palabraprueba = "Lata";
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, c.esPalindromo(palabraprueba));
    }

    @Test
    public void testprueba4() {
        String palabraprueba = " ";
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, c.esPalindromo(palabraprueba));
    }

    @Test
    public void testprueba5() {
        String palabraprueba = "Amad a la dama";
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, c.esPalindromo(palabraprueba));
    }
    @Test
    public void testprueba6() {
        String palabraprueba = "";
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, c.esPalindromo(palabraprueba));
    }
}

