package pl.sdacademy.gracz;

public class DefaultMonster implements Monster {
  @Override
  public void takeDmg(int damage) {
    System.out.println(String.format("Monster takes %d dmg", damage));
  }
}
