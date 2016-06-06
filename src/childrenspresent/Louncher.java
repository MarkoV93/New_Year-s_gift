package childrenspresent;

import sweets.*;
import candy.*;
import chocolate.Milenium;
import chocolate.Milka;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import shugarcandy.Chupachups;
import shugarcandy.Cockerel;

public class Louncher {

    public static void main(String[] args) {
        Present p = new Present();
        p.add(new Snikers());
        p.add(new Milenium());
        p.add(new Milka());
        p.add(new Chupachups());
        p.add(new Snikers());
        p.add(new Cockerel());
        p.add(new Bounty());
        p.add(new Twix());
        System.out.println("Mass of present :" + p.getMass());
        System.out.println(p.getPresent());
        p.sortByPrice();
        System.out.println(p.getPresent());
        p.findSweetsBySuger(11, 18);
    }
}
