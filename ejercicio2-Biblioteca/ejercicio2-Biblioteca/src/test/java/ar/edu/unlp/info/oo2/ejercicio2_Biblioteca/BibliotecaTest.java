package ar.edu.unlp.info.oo2.ejercicio2_Biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Socio socio1;
    private Socio socio2;
    private Socio socio3;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        socio1 = new Socio("Juan Perez", "juan.perez@example.com", "12345");
        socio2 = new Socio("Maria Rodriguez", "maria.rodriguez@example.com", "54321");
        socio3 = new Socio("Pedro Gonzalez", "pedro.gonzalez@example.com", "67890");
    }

    @Test
    public void testAgregarSocio() {
        // Arrange
        int expectedSize = 1;

        // Act
        biblioteca.agregarSocio(socio1);

        // Assert
        assertEquals(expectedSize, biblioteca.getSocios().size());
        assertTrue(biblioteca.getSocios().contains(socio1));
    }

    @Test
    public void testExportarSocios() {
        // Arrange
        String expectedJson = "[\n" +
                              "\t{\n" +
                              "\t\t\"nombre\": \"Juan Perez\",\n" +
                              "\t\t\"email\": \"juan.perez@example.com\",\n" +
                              "\t\t\"legajo\": \"12345\"\n" +
                              "\t},\n" +
                              "\t{\n" +
                              "\t\t\"nombre\": \"Maria Rodriguez\",\n" +
                              "\t\t\"email\": \"maria.rodriguez@example.com\",\n" +
                              "\t\t\"legajo\": \"54321\"\n" +
                              "\t}\n" +
                              "]";

        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);

        // Act
        String actualJson = biblioteca.exportarSocios();

        // Assert
        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void testSetExporter() {
        // Arrange
        VoorheesExporter exporter = new VoorheesExporter();

        // Act
        biblioteca.setExporter(exporter);

        // Assert
        assertEquals(exporter, biblioteca.getExporter());
    }
}