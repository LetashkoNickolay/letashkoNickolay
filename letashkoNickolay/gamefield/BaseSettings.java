package comJavarush.letashkoNickolay.gamefield;

public class BaseSettings {

    final public static ThreadLocal<BaseSettings> WOLF_BASE_SETTING = ThreadLocal.withInitial(() -> new BaseSettings(50, 30, 3, 8, 3, 8, "wolf", 20));

    public static final Integer weight = Integer.valueOf("weight"); // weight - Вес одного животного, кг
    public static final Integer amount = Integer.valueOf("amount"); // amount - Максимальное количество животных этого вида на одной клетке
    public static final Integer speed = Integer.valueOf("speed"); // speed - Скорость перемещения, не более чем, клеток за ход
    public static final Integer eatweith = Integer.valueOf("eatweith"); // eatweith - Сколько килограммов пищи нужно животному для полного насыщения
    public static final Integer children = Integer.valueOf("children"); // children - количество детей за раз
    public static final Integer satiety = Integer.valueOf("satiety"); // satiety - максимальная сытость для класса
    public static final String name = "name"; // name - имя класса
    public static final Integer hunger = Integer.valueOf("hunger"); // hunger - на какой процент убывает сытость у класса в каждом такте


    public BaseSettings(int weight, int amount, int speed, int eatweith, int children, int satiety, String name, int hunger) {

    }
}