package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator cmp;

    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);

        this.cmp = myComparator;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = smartArray.toArray();
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            Object pivot = arr[i];

            while (j >= 0 && cmp.compare(arr[j], pivot) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = pivot;
        }
        return arr;
    }

    @Override
    public int size() {
        return smartArray.size();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + " + sotring";
    }
}
