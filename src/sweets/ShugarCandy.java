
package sweets;


abstract public class ShugarCandy extends Sweets{
    private boolean filling;

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    public boolean isFilling() {
        return filling;
    }
}
