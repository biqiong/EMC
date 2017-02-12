package test1;

import java.util.List;

public class BubbleSort {

    public static void sort(List<Integer> tempList) {
        Integer temp = null;
        for (int i = tempList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tempList.get(j).intValue() < tempList.get(j + 1).intValue()) {
                    temp = tempList.get(j);
                    tempList.set(j, tempList.get(j + 1));
                    tempList.set(j + 1, temp);
                }
            }
        }

    }
}
