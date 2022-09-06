package latihan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class CekBilanganTest {
	CekBilangan bilangan = new CekBilangan();
  @Test
  public void testBilanganGanjil() {
	  assertTrue(bilangan.cekBilanganGanjil(9));
  }
  
  @Test
  public void testBilanganGenap() {
	  assertTrue(bilangan.cekBilanganGenap(123));
  }
}
