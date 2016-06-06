package chocolate;

import sweets.*;

public class Milka extends Chocolate {

    public Milka() {
           this.setSugar(20);
       this.setMass(90);
       this.setPrice(12);
       this.setCocoa(50);
    }
private boolean nuts=true;

    public boolean isNuts() {
        return nuts;
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }
   
}
