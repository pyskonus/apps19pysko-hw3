package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

//    protected SmartArray smartArray;
    public Object[] els;

    public SmartArrayDecorator(SmartArray smartArray) {
//        this.smartArray = smartArray;
        els = smartArray.toArray();
    }

    @Override
    public Object[] toArray() {
        return els;
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
