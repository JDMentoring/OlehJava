package HomeWork22;

import java.util.ArrayList;

public class VisaCenter<V extends TransitVisa> {
ArrayList<V>vises;

    public VisaCenter(ArrayList<V> vises) {
        this.vises = vises;
    }

    public ArrayList<V> getVises() {
        return vises;
    }

    public void setVises(ArrayList<V> vises) {
        this.vises = vises;
    }


}
