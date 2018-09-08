package testing;

import java.util.ArrayList;
import java.util.Random;

public class TestClass {
    protected static ArrayList arrayNums = new ArrayList();

    public static void main(String[] args) {

        arrayNums = TestClass.getRandomArray(arrayNums);
        TestingArray sortedArray = new TestingArray();

        System.out.println(arrayNums);
        System.out.println(sortedArray.getFirstTenMinNumbers(arrayNums));

    }

    public static ArrayList getRandomArray(ArrayList arrayNums) {
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            arrayNums.add(num);
        }
        return arrayNums;
    }
}
