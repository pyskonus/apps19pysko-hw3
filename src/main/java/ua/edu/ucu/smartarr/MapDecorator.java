package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;


// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray, MyFunction fun) {
        super(smartArray);
        for (int i = 0; i < els.length; i++) {
            els[i] = fun.apply(els[i]);
        }
    }
}
