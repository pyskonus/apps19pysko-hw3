package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);
        Object[] result = new Object[smartArray.size()];
        int real_size = 0;
        for (Object o: els) {
            if (pr.test(o)) {
                result[real_size] = o;
                real_size++;
            }
        }
        els = Arrays.copyOf(result, real_size);
    }
}
