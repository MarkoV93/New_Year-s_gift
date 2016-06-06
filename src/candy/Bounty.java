package candy;

import sweets.*;

public class Bounty extends Candy {

    public Bounty() {
      this.setNumber(3);
         this.setSugar(12);
        this.setMass(60);
        this.setPrice(14);
    }
    private int coconut=35;

    public int getCoconut() {
        return coconut;
    }

    public void setCoconut(int coconut) {
        this.coconut = coconut;
    }
    
}
