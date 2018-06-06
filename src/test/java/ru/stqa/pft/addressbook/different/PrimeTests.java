package ru.stqa.pft.addressbook.different;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test
  public void PrimeTests(){
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }

  @Test
  public void PrimeTests2(){
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }

  @Test(enabled = false)
  public void PrimeTestsLong(){
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }

  @Test
  public void PrimeTestsFast(){
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE ));
  }
}
