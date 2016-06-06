package candy;

import sweets.*;

public class Snikers extends Candy {

    public Snikers() {
         this.setNumber(3);
         this.setSugar(10);
        this.setMass(55);
        this.setPrice(12);
    }
    private boolean sunflower=true;

    public boolean isSunflower() {
        return sunflower;
    }

    public void setSunflower(boolean sunflower) {
        this.sunflower = sunflower;
    }
    
}
