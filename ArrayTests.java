import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 3 , 5 , 6 , 7};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 7 , 6 , 5 , 3}, input2);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input2 = { 8 , 9 , 10 , 11 };
    assertArrayEquals(new int[]{ 11 , 10 , 9 , 8 }, ArrayExamples.reversed(input2));
  }
}
