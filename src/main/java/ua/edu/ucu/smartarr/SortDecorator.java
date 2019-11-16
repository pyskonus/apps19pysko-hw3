package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);

        for (int i = 1; i < els.length; i++) {
            Object temp = els[i];
            int j = i - 1;
            while (j >= 0 && myComparator.compare(temp, els[j]) < 0) {
                els[j + 1] = els[j];
                j--;
            }
            els[j + 1] = temp;
        }
    }
}
