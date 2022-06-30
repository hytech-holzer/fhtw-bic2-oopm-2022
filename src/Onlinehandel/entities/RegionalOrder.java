package Onlinehandel.entities;

import Onlinehandel.provided.Costumer;

import java.util.Collection;

public class RegionalOrder extends Order{
    private boolean express = false;

    public RegionalOrder(long id, Costumer c, Collection<Item> items) {
    super(id, c, items);
    }

    public RegionalOrder(long id, Costumer c, Collection<Item> items, boolean express){
        super(id, c, items);
        this.express = express;
    }

    @Override
    public int getTotal(){
       /*int total = 0;
        for (Item i: goods) {
            total += i.totalValue();
        }
        if (express){
            return (int) (total * 1.2);
        } else {
        return total;
        }*/
        return 1;
    }
}
