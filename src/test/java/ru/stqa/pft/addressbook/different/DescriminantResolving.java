package ru.stqa.pft.addressbook.different;

public class DescriminantResolving {
  private double a1; //написал класс, обьявил переменные с указанием типа
  private double a2;
  private double a3;

  int n;

  public DescriminantResolving(double a1, double a2, double a3) {
    this.a1 = a1; // написал конструктор, присвоил значения
    this.a2 = a2;
    this.a3 = a3;

    double d = a2 * a2 - 4 * a1 * a3;

    if (a1 != 0) {
      if (d > 0) {
        n = 2;
      } else if (d == 0){
        n = 1;
      } else if (d < 0){
        n = 0;
      }
    } else if (a2 != 0){
      n = 1;
    } else if (a3 != 0){
      n = 0;
    } else {
      n = -1;
    }
  }

  public int NumberOfRoots(){
    return n;
  }
}
