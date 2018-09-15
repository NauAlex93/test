package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
     * Finds min element and replace it at the beginning of the array
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

    /**
     * Finds the biggest element and doing descending sort of all elements after it
     * and ascending sort of all elems before it
     */
    public ArrayList findMaxElemAndSortArray(ArrayList<Integer> arrayNums) {
        int maxElement = arrayNums.get(0);
        int indexOfMaxElement = 0;

        for (int i = 1; i < arrayNums.size(); i++) {
            if (arrayNums.get(i) > maxElement) {
                maxElement = arrayNums.get(i);
                indexOfMaxElement = i;
            }
        }

        List<Integer> ascSortedArray  = arrayNums.subList(0, indexOfMaxElement + 1);
        List<Integer> descSortedArray = arrayNums.subList(indexOfMaxElement + 1, arrayNums.size());

        Collections.sort(ascSortedArray);
        Collections.sort(descSortedArray, (o1, o2) -> (o1 > o2) ? -1 : ((o1 == o2) ? 0 : 1));

        return arrayNums;
    }
}
