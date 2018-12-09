package pl.sdacademy.gracz;

public class Main {
  public static void main(String[] args) {
    Player<DefaultMonster> player = new DefaultPlayer<>();
    Player<BossMonster> slayer = new DefaultPlayer<>();

    DefaultMonster monster = new DefaultMonster();
    BossMonster boss = new BossMonster();

    player.attack(monster);
    slayer.attack(boss);

  }
}

