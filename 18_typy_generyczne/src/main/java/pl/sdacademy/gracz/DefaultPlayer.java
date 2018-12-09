package pl.sdacademy.gracz;

public class DefaultPlayer<M extends Monster> implements Player<M> {
  @Override
  public void attack(M enemy) {
    enemy.takeDmg(100);
  }
}
