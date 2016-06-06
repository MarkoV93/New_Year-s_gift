package candy;

import sweets.*;

public class Twix extends Candy {

    public Twix() {
        this.setNumber(2);
         this.setSugar(8);
        this.setMass(40);
        this.setPrice(8);
      
    }
    private boolean newPackaging=false;

    public boolean isNewPackaging() {
        return newPackaging;
    }

    public void setNewPackaging(boolean newPackaging) {
        this.newPackaging = newPackaging;
    }

}
