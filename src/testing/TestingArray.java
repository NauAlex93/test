package testing;

import java.util.ArrayList;

public class TestingArray {

    /**
     *
     * @param arrayNums is an initial array for selecting 10 minimal elements from it
     * @return resulting array of 10 elements
     */
    public ArrayList getTenMinNumbers(ArrayList<Integer> arrayNums) {
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
