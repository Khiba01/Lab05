package it.unibo;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    public MyComparator() {
    }
    
    @Override
    public int compare(String arg0, String arg1) {
        return Double.compare(Double.parseDouble(arg0), Double.parseDouble(arg1));
    }
}