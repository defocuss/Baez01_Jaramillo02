import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    Object [][] personas = new Object[10][3];

    @BeforeEach
    void setUp() {
        personas[0] = new Object[]{"David","Soltero/a",20};
        personas[1] = new Object[]{"Emilio","Casado/a",17};
        personas[2] = new Object[]{"Juan","Soltero/a",10};
        personas[3] = new Object[]{"Pedro","Soltero/a",65};
    }
    @Test
    void agregarPersona() {
        assertTrue(Registro.agregarPersona(personas,"Martin","Soltero/a",20));
    }
    @Test
    void personaUnica(){
        Registro.agregarPersona(personas,"Martin","Soltero/a",20);
        assertFalse(Registro.personaUnica(personas,"Martin"));
    }
    @Test
    void personasCasadas(){
        assertEquals(1, Registro.personasCasadas(personas));
    }
    @Test
    void personasSolteras(){
        assertEquals(3, Registro.personasSolteras(personas));
    }
}