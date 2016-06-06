package sweets;


 abstract public class Sweets {

   private int sugar;
   private int mass;
   private int price;

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setPrice(int price) {
        this.price = price;
    }
   
   public int getSugar(){
       return sugar;
   }
    public int getMass(){
       return mass;
   }
     public int getPrice(){
       return price;
   }
     public String toString(){
         return this.getClass()+" sugar__"+this.getSugar()+" price__"+this.getPrice()+" mass__"+this.getMass()+"\n";
        
     }
    
}
