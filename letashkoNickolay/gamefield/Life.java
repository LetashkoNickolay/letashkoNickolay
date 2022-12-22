package comJavarush.letashkoNickolay.gamefield;



    public abstract class  Life {

        private final String name = GameField.getWords(BaseSettings.name, getClass().getSimpleName());

        public String getName() {
            return name;
        }
    }
