package comJavarush.letashkoNickolay.gamefield;

import java.util.*;

public class Cell {
    public static Cell [] [] field = new Cell[100][20];
    private final int x;
    private final int y;
    private final HashMap<Long, HashSet<Life>> islandCell = new HashMap<>();


    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
            System.out.printf("Остров размером %d на %d создан.%n", this.x, this.y);
        }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    private boolean correctCell(int x, int y) {
        if (x > 10_000_000 || y > 10_000_000) {
            System.out.println("Остров не может быть больше 10_000_000 в ширину или в длину");
            return true;
        }
        if (x < 0 || y < 0) {
            System.out.println("Принимаются только положительные числа");
            return true;
        }

        if (x > this.x || y > this.y) {
            System.out.println("Ячейка не существует");
            return true;
        }
        return false;
    }

    private void setCellHashSet(int x, int y, HashSet<Life> hashSet) {
        if (correctCell(x, y)) {
            System.out.println("Не удалось записать информацию в ячейку");
            return;
        }
        long index = x * 1_00_000_000L + y;
        islandCell.put(index, hashSet);
    }

    public boolean add(int x, int y, Life life) {
        if (correctCell(x, y)) {
            return false;
        }
        HashSet<Life> cell = getCellHashSet(x, y);
        boolean status = cell.add(life);
        setCellHashSet(x, y, cell);
        return status;
    }


    public boolean remove(int x, int y, Life life) {
        if (correctCell(x, y)) {
            return false;
        }
        HashSet<Life> cell = getCellHashSet(x, y);
        boolean status = cell.remove(life);
        setCellHashSet(x, y, cell);
        return status;
    }

    public HashSet<Life> getCellHashSet(int x, int y) {
        long index = x * 1_00_000_000L + y;
        if (islandCell.get(index) == null) {
            return new HashSet<>();
        }
        return islandCell.get(index);
    }

    public Integer getAmountAliveInCell(int x, int y, Life life) {
        int i = 0;
        correctCell(x, y);
        HashSet<Life> cell = getCellHashSet(x, y);
        for (Life allAlive : cell) {
            if (allAlive.getClass() == life.getClass()) {
                i++;
            }
        }
        return i;
    }

    private HashMap<String, Long> setToMap(HashSet<Life> hashSet, HashMap<String, Long> statistics) {
        for (Life life : hashSet) {
            String name =life.getName();
            if (statistics.containsKey(name)) {
                Long i = statistics.get(name) + 1;
                statistics.put(name, i);
            } else {
                statistics.put(name, 1L);
            }
        }
        return statistics;
    }

    public HashMap<String, Long> gelCellStatistics(int x, int y) {
        if (correctCell(x, y)) {
            System.out.println("Coordinate error");
            return new HashMap<>();
        }
        return setToMap(getCellHashSet(x, y), new HashMap<>());
    }


    public HashMap<String, Long> gelIslandStatistics() {
        HashMap<String, Long> statistics = new HashMap<>();
        Collection<HashSet<Life>> values = islandCell.values();
        for (HashSet<Life> hashSet : values) {
            setToMap(hashSet, statistics);
        }
        return statistics;
    }

    public void makeStep(){

        eat();

        move();

        multiply();

    }

    private void eat() {
    }
    private void  move() {
    }
    private void multiply() {
    }

}
