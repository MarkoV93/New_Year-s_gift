/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shugarcandy;

import sweets.*;

public class Chupachups extends ShugarCandy {

    public Chupachups() {
         this.setSugar(10);
       this.setMass(25);
       this.setPrice(6);
       this.setFilling(false);
    }
    private int size=2;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
