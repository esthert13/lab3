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

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 5 , 1 , 3 , 4};
    assertEquals(4, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input2 = { 1};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input3 = { };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input3), 0);
  }

  @Test
  public void testAverageWithoutLowest4() {
    double[] input4 = { 7 , 2 , 4 , 10 };
    assertEquals(7, ArrayExamples.averageWithoutLowest(input4), 0);
  }

  @Test
  public void testAverageWithoutLowest5() {
    double[] input5 = { 1 , 0 };
    assertEquals(1, ArrayExamples.averageWithoutLowest(input5), 0);
  }

  @Test
  public void testAverageWithoutLowest6() {
    double[] input6 = { 3 , 4 , 5 };
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(input6), 0);
  }

  @Test
  public void testAverageWithoutLowest7() {
    double[] input7 = { 3 , -3 , -5};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input7), 0);
  }

  @Test
  public void testAverageWithoutLowest8() {
    double[] input8 = { 5.5 , 9.25 , 2};
    assertEquals(7.375, ArrayExamples.averageWithoutLowest(input8), 0);
  }
}
