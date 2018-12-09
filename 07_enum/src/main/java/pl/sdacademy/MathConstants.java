package pl.sdacademy;

public enum MathConstants {
  PI(3.14),
  E(2.71),
  G(9.98);

  public final double value;

  private MathConstants(double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }
}
