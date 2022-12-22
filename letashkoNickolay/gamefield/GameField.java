package comJavarush.letashkoNickolay.gamefield;

import java.util.HashMap;

public class GameField {


        final private static HashMap<String, HashMap<String, Integer>> digital = new HashMap<>();
        final private static HashMap<String, HashMap<String, Double>> extendetDigital = new HashMap<>();
        final private static HashMap<String, HashMap<String, String>> words = new HashMap<>();

        public static void setGameField(String parameterName, String className, Integer value) {

            HashMap<String, Integer> hashMap = new HashMap<>();

            if (digital.containsKey(parameterName)) {
                hashMap = digital.get(parameterName);
            }

            hashMap.put(className, value);
            digital.put(parameterName, hashMap);
        }

        public static void setGameFieldDouble(String parameterName, String className, Double value) {

            HashMap<String, Double> hashMap = new HashMap<>();

            if (extendetDigital.containsKey(parameterName)) {
                hashMap = extendetDigital.get(parameterName);
            }
            hashMap.put(className, value);
            extendetDigital.put(parameterName, hashMap);
        }

        public static void setEatTable(String hunterClassName, String preyClassName, Integer chance) {
            setGameField(hunterClassName, preyClassName, chance);
        }

        public static void setWords(String parameterName, String className, String word) {

            HashMap<String, String> hashMap = new HashMap<>();

            if (words.containsKey(parameterName)) {
                hashMap = words.get(parameterName);
            }
            hashMap.put(className, word);
            words.put(parameterName, hashMap);
        }

        public static Integer getGameField(String parameterName, String className) {
            if (digital.get(parameterName) == null) {
                return 0;
            } else if (digital.get(parameterName).get(className) == null) {
                return 0;
            }
            return digital.get(parameterName).get(className);
        }

        public static Double getGameFieldDouble(String parameterName, String className) {
            if (extendetDigital.get(parameterName) == null) {
                return 0.0;
            } else if (extendetDigital.get(parameterName).get(className) == null) {
                return 0.0;
            }
            return extendetDigital.get(parameterName).get(className);
        }

        public static Integer getEatTable(String hunterClassName, String preyClassName) {
            return getGameField(hunterClassName, preyClassName);
        }

        public static String getWords(String parameterName, String className) {
            if (words.get(parameterName) == null) {
                return "";
            } else if (words.get(parameterName).get(className) == null) {
                return "";
            }
            return words.get(parameterName).get(className);
        }
    }
