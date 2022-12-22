package comJavarush.letashkoNickolay.carnivores;

import comJavarush.letashkoNickolay.gamefield.BaseSettings;
import comJavarush.letashkoNickolay.herbivore.Herbivore;

public class Wolf extends Carnivores{
    public Wolf() {
        super(BaseSettings.WOLF_BASE_SETTING.get());
    }

    @Override
    public void eat(Herbivore herbivore) {
        super.eat(herbivore);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void multiply() {
        super.multiply();
    }
}

