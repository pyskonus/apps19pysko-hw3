package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    public Object[] els;
    
    public BaseArray(Object[] arr) {
        els = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(els, els.length);
    }

    @Override
    public String operationDescription() {
        return "";
    }

    @Override
    public int size() {
        return els.length;
    }

}
