package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;


// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction fun;

    public MapDecorator(SmartArray smartArray, MyFunction fun) {
        super(smartArray);

        this.fun = fun;
    }

    @Override
    public Object[] toArray() {
        Object[] res = new Object[smartArray.size()];
        Object[] initial = smartArray.toArray();
        for(int i = 0; i < smartArray.size(); i++) {
            res[i] = fun.apply(initial[i]);
        }
        return res;
    }

    @Override
    public int size() {
        return smartArray.size();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + " + mapped";
    }
}
