/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	Usuario james;
	Usuario guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario("James", "Glossing");
		guido = new Usuario("Guido", "van Rossum");
	}
    @Test
    public void testNombreCompleto() {
        assertEquals("Glossing, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
        
    }
}
