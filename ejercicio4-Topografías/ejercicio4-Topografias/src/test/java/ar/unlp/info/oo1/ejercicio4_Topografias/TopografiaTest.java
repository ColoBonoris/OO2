package ar.unlp.info.oo1.ejercicio4_Topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	TopografiaTierra t1, t2, t3, t4, t5, t6;
	TopografiaAgua a1, a2, a3, a4, a5, a6;
	TopografiaMixta m1, m2, m3, m4, m5, m6;
	List<Topografia> li1, li2, li3, li4;
	@BeforeEach
	public void SetUp() {
		TopografiaTierra t1 = new TopografiaTierra();
		Topografia t2 = new TopografiaTierra();
		Topografia t3 = new TopografiaTierra();
		Topografia t4 = new TopografiaTierra();
		Topografia t5 = new TopografiaTierra();
		Topografia t6 = new TopografiaTierra();
		
		Topografia a1 = new TopografiaAgua();
		Topografia a2 = new TopografiaAgua();
		Topografia a3 = new TopografiaAgua();
		Topografia a4 = new TopografiaAgua();
		Topografia a5 = new TopografiaAgua();
		Topografia a6 = new TopografiaAgua();
		
		List<Topografia> li1 = new ArrayList<Topografia>();
		List<Topografia> li2 = new ArrayList<Topografia>();
		List<Topografia> li3 = new ArrayList<Topografia>();
		List<Topografia> li4 = new ArrayList<Topografia>();
		List<Topografia> li5 = new ArrayList<Topografia>();
		List<Topografia> li6 = new ArrayList<Topografia>();
		
		li1.add(t1); li1.add(t2); li1.add(a1); li1.add(a2);
		li2.add(t3); li2.add(t4); li2.add(a3); li2.add(a4);
		li5.add(t4); li5.add(t3); li5.add(a4); li5.add(a3);
		
		Topografia m1 = new TopografiaMixta(li1);
		Topografia m2 = new TopografiaMixta(li2);
		
		li3.add(a5); li3.add(a6); li3.add(m1); li3.add(m2);
		
		Topografia m3 = new TopografiaMixta(li3);
		
		li4.add(m3); li4.add(t5); li4.add(t6); li4.add(m1);
		
		Topografia m4 = new TopografiaMixta(li4);
		Topografia m5 = new TopografiaMixta(li5);
		
		li6.add(m1); li6.add(t5); li6.add(t6); li6.add(m3);
		Topografia m6 = new TopografiaMixta(li6);
		
	}
	@Test
	public void simplesTest() {
		assertEquals(t1.proporcionTierra(), 1);
		assertEquals(a1.proporcionAgua(), 1);
		assertEquals(a1, a2);
		assertEquals(t1, t2);
	}
	@Test
	public void mixtaTest() {
		assertEquals(m1.proporcionAgua(), 0.5);
		assertEquals(m1, m5);
		assertNotEquals(m4, m6);
	}
	
}









































