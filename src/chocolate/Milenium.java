package chocolate;

import sweets.*;

public class Milenium extends Chocolate {

    public Milenium() {

        this.setSugar(21);
        this.setMass(100);
        this.setPrice(15);
        this.setCocoa(45);
    }
    private int milk = 14;

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

}
