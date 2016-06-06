package childrenspresent;

import sweets.*;
import candy.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javafx.print.Collation;

public class Present {

   private List<Sweets> present= new ArrayList<>();

    public List<Sweets> getPresent() {
        return present;
    }

   

    public void add(Sweets s) {
        present.add(s);
    }

    public int getMass() {
        int m = 0;
        Iterator i = present.iterator();

        while (i.hasNext()) {
            Sweets s = (Sweets) i.next();
            m += s.getMass();
        }
        return m;
    }

    public void sortByPrice() {
        Collections.sort(present, new Comparator<Sweets>() {
            @Override
            public int compare(Sweets o1, Sweets o2) {
                if (o1.getPrice() >= o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
    public void findSweetsBySuger(int from,int to){
        Iterator i=present.iterator();
        while (i.hasNext()){
            Sweets s=(Sweets)i.next();
            if (s.getSugar()<=to&&s.getSugar()>=from) {
                System.out.println(s);
            }
                    
        }
    }

}
