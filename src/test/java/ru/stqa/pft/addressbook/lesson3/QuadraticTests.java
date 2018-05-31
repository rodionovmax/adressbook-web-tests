package ru.stqa.pft.addressbook.lesson3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticTests {

  @Test
  public void test2() {
    QuadraticEquation e = new QuadraticEquation(1, 4, 3);
    Assert.assertEquals(e.NumbersOfRoots(), 2);
  }

  @Test
  public void test0() {
    QuadraticEquation e = new QuadraticEquation(1, 3, 4);
    Assert.assertEquals(e.NumbersOfRoots(), 0);
  }

  @Test
  public void test1() {
    QuadraticEquation e = new QuadraticEquation(1, 2, 1);
    Assert.assertEquals(e.NumbersOfRoots(), 1);
  }

  @Test
  public void testOneRoot() {
    QuadraticEquation e = new QuadraticEquation(1, 0, 3);
    Assert.assertEquals(e.NumbersOfRoots(), 1);
  }
}
