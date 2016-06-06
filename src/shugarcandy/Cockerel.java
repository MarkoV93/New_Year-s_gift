package shugarcandy;

import sweets.*;

public class Cockerel extends ShugarCandy {

    public Cockerel() {
        this.setSugar(12);
       this.setMass(30);
       this.setPrice(5);
       this.setFilling(false);
    }
    private String color="red";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
