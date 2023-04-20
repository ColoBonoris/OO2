package ar.edu.unlp.info.oo2.ejercicio2_Biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaIntegrationTest {

    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void testExportarSocios() {
        // Create some test data
        Socio socio1 = new Socio("Juan Perez", "juan.perez@example.com", "12345");
        Socio socio2 = new Socio("Maria Rodriguez", "maria.rodriguez@example.com", "67890");
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);

        // Call the method under test
        String json = biblioteca.exportarSocios();

        // Verify the result
        String expectedJson = "[\n" +
                "\t{\n" +
                "\t\t\"nombre\": \"Juan Perez\",\n" +
                "\t\t\"email\": \"juan.perez@example.com\",\n" +
                "\t\t\"legajo\": \"12345\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"nombre\": \"Maria Rodriguez\",\n" +
                "\t\t\"email\": \"maria.rodriguez@example.com\",\n" +
                "\t\t\"legajo\": \"67890\"\n" +
                "\t}\n" +
                "]";
        Assertions.assertEquals(expectedJson, json);
    }

    @Test
    void testCustomExporter() {
        // Create a custom exporter that returns an empty array for an empty list
        VoorheesExporter customExporter = new VoorheesExporter() {
            @Override
            public String exportar(List<Socio> socios) {
                if (socios.isEmpty()) {
                    return "[]";
                }
                return super.exportar(socios);
            }
        };
        biblioteca.setExporter(customExporter);

        // Call the method under test with an empty list
        String json = biblioteca.exportarSocios();

        // Verify the result
        String expectedJson = "[]";
        Assertions.assertEquals(expectedJson, json);
    }
}
