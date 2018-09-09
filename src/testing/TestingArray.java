package testing;

import java.util.ArrayList;

public class TestingArray {

    /**
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

     /**
     * Finds min number and replace it at the beginning of the array
     */
    public ArrayList findMinNumAndSetItFirstElem(ArrayList<Integer> arrayNums) {
        int minElement = arrayNums.get(0);
        int indexOfMinElement = 0;

        for (int i = 1; i < arrayNums.size(); i++) {
            if (arrayNums.get(i) < minElement) {
                minElement = arrayNums.get(i);
                indexOfMinElement = i;
            }
        }
        arrayNums.remove(indexOfMinElement);
        arrayNums.add(0, minElement);

        return arrayNums;
    }
}
