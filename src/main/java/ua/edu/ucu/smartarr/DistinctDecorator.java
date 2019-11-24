package ua.edu.ucu.smartarr;

import java.util.ArrayList;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        ArrayList<Object> al = new ArrayList<>();
        boolean unique = true;
        for (Object o: smartArray.toArray()
             ) {
            for (Object o2: al
                 ) {
                if (equals(o, o2)) {unique = false;}
            }
            if (unique) al.add(o);
        }
        return al.toArray();
    }

    @Override
    public int size() {
        return toArray().length;
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + " + distinction";
    }

    private boolean equals(Object first, Object second) {
        // assumes each object has toString() method
        return first.toString().equals(second.toString());
    }
}
