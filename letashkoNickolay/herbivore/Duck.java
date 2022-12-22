package comJavarush.letashkoNickolay.herbivore;

import comJavarush.letashkoNickolay.Runner.Plant.Plant;

public class Duck extends Herbivore{

    @Override
    public void eat(Plant plant) {
        super.eat(plant);
        eat(new Caterpillar());
    }

    private void eat(Caterpillar caterpillar) {
    }
}
