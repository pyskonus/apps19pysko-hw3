package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;


// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate pr;

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);

        this.pr = pr;
    }

    @Override
    public Object[] toArray() {
        ArrayList<Object> al = new ArrayList<>();
        for (Object o: smartArray.toArray()
             ) {
            if (pr.test(o)) al.add(o);
        }
        return al.toArray();
    }

    @Override
    public int size() {
        int al = 0;
        for (Object o: this.smartArray.toArray()
        ) {
            if (pr.test(o)) al++;
        }
        return al;
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + " + filtering";
    }
}
