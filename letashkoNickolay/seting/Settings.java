package comJavarush.letashkoNickolay.seting;


import java.util.HashMap;
import java.util.Map;

    // Tell Don't Ask
    public class Settings {

        private final Map<String, Map<String, Integer>> animalToTable = new HashMap<>();

        // from file
        // 1) конь, волк, утка, гусень, растение
        {
            Map<String, Integer> wolfMap = new HashMap<>();
            wolfMap.put("horse", 10);
            wolfMap.put("plant", 0);
            animalToTable.put("wolf", wolfMap);
        }

        public int getPercent(String predator, String victim){
            //NPE ???
            return animalToTable.get(predator).get(victim);
        }


    }
