package ml.pevgen.algo.stepik;

import java.util.*;

/**
 * Задача о непрерывном рюкзаке
 * <p>
 * Первая строка содержит количество и  вместимость рюкзака
 * Каждая из следующих nn строк задаёт стоимость и объём предмета (целые числа).
 * Выведите максимальную стоимость частей предметов (от каждого предмета можно отделить любую часть,
 * стоимость и объём при этом пропорционально уменьшатся), помещающихся в данный рюкзак,
 * с точностью не менее трёх знаков после запятой.
 * <p>
 * Sample Input:
 * 3 50
 * 60 20
 * 100 50
 * 120 30
 * <p>
 * Sample Output:
 * 180.000
 */
public class ContinuousKnapsack {

    public static void main(String[] args) {
        Map<Double, Integer> materials = new TreeMap<>(Comparator.reverseOrder());

//        int itemsCount = 3;
//        int packVolume = 50;
//        System.out.println(materials);
//        materials.put(60d / 20, 20);
//        materials.put(100d / 50, 50);
//        materials.put(120d / 30, 30);

        Scanner s = new Scanner(System.in);
        int itemsCount = s.nextInt();
        int packVolume = s.nextInt();
        for (int i = 1; i <= itemsCount; i++) {
            double weight = s.nextDouble();
            int volume = s.nextInt();
            materials.put(weight / volume, volume);
        }

        int filledPackVolume = 0;
        double weight = 0;

        for (Map.Entry<Double, Integer> entry : materials.entrySet()) {
            if (filledPackVolume == packVolume) {
                break;
            }
            Double weightPerVolume = entry.getKey();
            Integer materialVolume = entry.getValue();

            int gettingMaterialVolume = Math.min(packVolume - filledPackVolume, materialVolume);
            weight = weight + gettingMaterialVolume * weightPerVolume;

            filledPackVolume = filledPackVolume + gettingMaterialVolume;
        }

        System.out.println(weight);
    }

}
