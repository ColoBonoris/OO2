package ar.edu.unlp.info.oo2.ejercicio2_Biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SocioTest {

    @Test
    public void testConstructorAndGetters() {
        // Arrange
        String nombre = "Juan Perez";
        String email = "juan.perez@example.com";
        String legajo = "12345";

        // Act
        Socio socio = new Socio(nombre, email, legajo);

        // Assert
        assertEquals(nombre, socio.getNombre());
        assertEquals(email, socio.getEmail());
        assertEquals(legajo, socio.getLegajo());
    }

    @Test
    public void testSetters() {
        // Arrange
        Socio socio = new Socio("Juan Perez", "juan.perez@example.com", "12345");
        String nombre = "Maria Rodriguez";
        String email = "maria.rodriguez@example.com";
        String legajo = "54321";

        // Act
        socio.setNombre(nombre);
        socio.setEmail(email);
        socio.setLegajo(legajo);

        // Assert
        assertEquals(nombre, socio.getNombre());
        assertEquals(email, socio.getEmail());
        assertEquals(legajo, socio.getLegajo());
    }
}