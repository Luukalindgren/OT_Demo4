import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LaskukoneTest {

	@Test
	void lisaaLukuTest() {
		Laskukone testi = new Laskukone();
		testi.lisaaLuku(1);
		assertEquals(testi.tulos, 1);
	}
	@Test
	void vahennaLukuTest() {
		Laskukone testi = new Laskukone();
		testi.vahennaLuku(7);
		assertEquals(testi.tulos, -7);
	}
	@Test
	void kerroLuvullaTest() {
		Laskukone testi = new Laskukone();
		testi.lisaaLuku(1);
		testi.kerroLuvulla(4);
		assertEquals(testi.tulos, 4);
	}
	@Test
	void korotaPotenssiinTest() {
		Laskukone testi = new Laskukone();
		testi.lisaaLuku(2);
		testi.korotaPotenssiin(3);
		assertEquals(testi.tulos, 8);
	}
	@Test
	void annaTulosTest() {
		Laskukone testi = new Laskukone();
		testi.lisaaLuku(1);
		testi.kerroLuvulla(4);
		assertEquals(testi.annaTulos(), 4);
	}
	@Test
	void nollaaTest() {
		Laskukone testi = new Laskukone();
		testi.lisaaLuku(4);
		testi.nollaa();
		assertEquals(testi.tulos, 0);
	}

}
