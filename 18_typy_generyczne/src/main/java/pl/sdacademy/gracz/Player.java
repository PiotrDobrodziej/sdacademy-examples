package pl.sdacademy.gracz;

public interface Player<M extends Monster> {
  void attack(M enemy);

}
