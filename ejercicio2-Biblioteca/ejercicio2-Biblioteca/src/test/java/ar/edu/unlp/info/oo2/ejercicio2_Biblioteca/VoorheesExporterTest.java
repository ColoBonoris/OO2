package ar.edu.unlp.info.oo2.ejercicio2_Biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VoorheesExporterTest {

    @Test
    public void testExportarEmptyList() {
        // Arrange
        List<Socio> socios = new ArrayList<>();

        // Act
        VoorheesExporter exporter = new VoorheesExporter();
        String result = exporter.exportar(socios);

        // Assert
        assertEquals("[]", result);
    }

    @Test
    public void testExportarSingleSocio() {
        // Arrange
        Socio socio = new Socio("Juan Perez", "juan.perez@example.com", "12345");
        List<Socio> socios = Arrays.asList(socio);

        // Act
        VoorheesExporter exporter = new VoorheesExporter();
        String result = exporter.exportar(socios);

        // Assert
        assertTrue(result.contains("\"nombre\": \"Juan Perez\""));
        assertTrue(result.contains("\"email\": \"juan.perez@example.com\""));
        assertTrue(result.contains("\"legajo\": \"12345\""));
    }

    @Test
    public void testExportarMultipleSocios() {
        // Arrange
        Socio socio1 = new Socio("Juan Perez", "juan.perez@example.com", "12345");
        Socio socio2 = new Socio("Maria Rodriguez", "maria.rodriguez@example.com", "54321");
        List<Socio> socios = Arrays.asList(socio1, socio2);

        // Act
        VoorheesExporter exporter = new VoorheesExporter();
        String result = exporter.exportar(socios);

        // Assert
        assertTrue(result.contains("\"nombre\": \"Juan Perez\""));
        assertTrue(result.contains("\"email\": \"juan.perez@example.com\""));
        assertTrue(result.contains("\"legajo\": \"12345\""));
        assertTrue(result.contains("\"nombre\": \"Maria Rodriguez\""));
        assertTrue(result.contains("\"email\": \"maria.rodriguez@example.com\""));
        assertTrue(result.contains("\"legajo\": \"54321\""));
    }
}
