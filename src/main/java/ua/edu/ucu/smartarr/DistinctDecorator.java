package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        Object[] res = Arrays.copyOf(els, els.length);
        int realSize = 0;

        for (int i = 0; i < els.length; i++) {
            if (!in(els, i)) {
                res[realSize] = els[i];
                realSize++;
            }
        }
        els = Arrays.copyOf(res, realSize);
    }

    private boolean in(Object[] obj, int index) {
        for (int i = 0; i < index; i++)
            {if (equals(obj[index], obj[i])) {return true;}}
        return false;
    }

    private boolean equals(Object first, Object second) {
        return first.toString().equals(second.toString());
    }
}
