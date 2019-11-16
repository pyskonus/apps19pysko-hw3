package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    public Object[] els;
    public BaseArray(Object[] arr) {
        els = arr;
    }

    @Override
    public Object[] toArray() {
        return this.els;
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
