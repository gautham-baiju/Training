package org.example;

public class Dev {
    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Dev() {
        System.out.println("Dev constructor");
    }

    public void build() {
        System.out.println("Lessgooooooo");
        comp.compile();
    }
}
