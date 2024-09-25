import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    Object[][] personas = new Object[10][3];

    @BeforeEach
    void setUp() {
        personas[0] = new Object[]{"David","Soltero",20};
        personas[1] = new Object[]{"Emilio","Casado",17};
        personas[2] = new Object[]{"Juan","Soltero",10};
        personas[3] = new Object[]{"Pedro","Soltero",65};
    }

    @Test
    void cantidadPersonasMayorEdad() {
        assertEquals(2, Registro.cantidadPersonasMayorEdad(personas));
    }

    @Test
    void cantidadPersonasMenorEdad() {
        assertEquals(2, Registro.cantidadPersonasMenorEdad(personas));
    }

    @Test
    void cantidadPersonasTerceraEdad() {
        assertEquals(1, Registro.cantidadPersonasTerceraEdad(personas));
    }
}