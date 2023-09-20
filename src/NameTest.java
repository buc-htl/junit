import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class NameTest {

  private static Name nameSingle;
  private static Name nameMultiple;

  @BeforeAll
  public static void setup(){
    nameSingle = new Name("Reinhold Buchinger");
    nameMultiple = new Name("Reinhold Franz Elfriede Buchinger");
  }

  @Test
  public void getFirstName_single(){
    assertEquals("Reinhold", nameSingle.getFirstNames()[0], "Einzelner Vorname nicht korrekt.");

  }

  @Test
  public void getFirstName_multiple(){
    assertArrayEquals(new String[] {"Reinhold", "Franz", "Elfriede"}, nameMultiple.getFirstNames());
  }

  @Test
  public void getLastName_single(){
    assertEquals("Buchinger", nameSingle.getLastName());
  }

  @Test
  public void getLastName_multiple(){
    assertEquals("Buchinger", nameMultiple.getLastName());
  }

  @Test
  public void getNumberOfFirstNames_single(){
    assertEquals(1,nameSingle.getNumberOfFirstNames());
  }

  @Test
  public void getNumberOfFirstNames_multiple(){
    assertEquals(2,nameMultiple.getNumberOfFirstNames());
  }

  @Test
  public void invalidString(){
    assertThrows(IllegalArgumentException.class, () -> new Name("Buchinger"));
  }
}