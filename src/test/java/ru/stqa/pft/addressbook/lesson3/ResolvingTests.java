package ru.stqa.pft.addressbook.lesson3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResolvingTests { // объявил класс в котором проводитяс тестирование

  @Test
  public void test2() {
    DescriminantResolving e = new DescriminantResolving(1,4,3); // передал значения в конструктор
    Assert.assertEquals(e.NumberOfRoots(), 2);
  }

  @Test
  public void test0() {
    DescriminantResolving e = new DescriminantResolving(1,2,3);
    Assert.assertEquals(e.NumberOfRoots(), 0);
  }

  @Test
  public void test1() {
    DescriminantResolving e = new DescriminantResolving(1,2,1);
    Assert.assertEquals(e.NumberOfRoots(), 1);
  }

  @Test
  public void testZero() {
    DescriminantResolving e = new DescriminantResolving(0,2,1);
    Assert.assertEquals(e.NumberOfRoots(), 1);
  }

  @Test
  public void testDoXyu() {
    DescriminantResolving e = new DescriminantResolving(0,0,1);
    Assert.assertEquals(e.NumberOfRoots(), 1);
  }
}
