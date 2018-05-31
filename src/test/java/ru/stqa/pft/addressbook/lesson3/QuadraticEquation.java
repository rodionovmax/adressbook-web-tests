package ru.stqa.pft.addressbook.lesson3;

import java.util.Scanner;

public class QuadraticEquation {
  static double x1;
  static double x2;
  static double x12;
  static double a;
  static double b;
  static double c;
  static double d;
  static int n;

  public QuadraticEquation (double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public static void main(String args[]) {

    System.out.println("Quadratic equation resolving");
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a = ");
    a = s.nextDouble();
    System.out.print("Enter b = ");
    b = s.nextDouble();
    System.out.print("Enter c = ");
    c = s.nextDouble();

    d = b * b - 4 * a * c;

    if (a != 0){
      if(d > 0){
        n = 2;
        System.out.println("d > 0. This equation has 2 roots");
        x1 = (-b + Math.sqrt(d)) / 2 * a;
        x2 = (-b - Math.sqrt(d)) / 2 * a;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
      } else if (d == 0) {
        n = 1;
        System.out.println("d = 0. This equation has one root.");
        x12 = -b/(2*a);
        System.out.println("x12 = " + x12);
      } else if (d < 0) {
        n = 0;
        System.out.println("d < 0. This equation has no roots");
        //System.out.println("This equation does not have roots");
      }
    } else if (b != 0) {
      n = 1;
      System.out.println("This equation has one root");
    } else if (c !=0) {
      n = 0;
      System.out.println("This equation has no roots");
    } else {
      n = -1;
      System.out.println("Hey asshole check values you've entered! There are many roots");
    }
  }
  public int NumbersOfRoots(){
    return n;
  }
}
