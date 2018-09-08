package testing;

import java.util.ArrayList;

public class TestingArray {

    public ArrayList getFirstTenMinNumbers(ArrayList<Integer> arrayNums) {
        ArrayList resultList = new ArrayList();
        int minElement;

        for (int j = 0; j < 10; j++) {
            minElement = Integer.MAX_VALUE;

            for (Integer element : arrayNums) {
                if (element < minElement && !resultList.contains(element)) {
                    minElement = element;
                }
            }
            resultList.add(minElement);
        }

        return resultList;
    }
}
