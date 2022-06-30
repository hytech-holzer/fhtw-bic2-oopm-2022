package Onlinehandel.entities;

import Onlinehandel.provided.Costumer;

import java.util.Collection;

public class InternationalOrder extends Order{

    public float custom = 2;

    public InternationalOrder(long id, Costumer c, Collection<Item> items){
        super(id, c, items);
        if (items.isEmpty()){
            throw new IllegalArgumentException();
        }
        if (id == 0) {
            throw new IllegalArgumentException();
        }
    }

    public InternationalOrder(long id, Costumer c, Collection<Item> items, float custom){
        super(id, c, items);
        if (items.isEmpty()){
            throw new IllegalArgumentException();
        }
        if (id == 0) {
            throw new IllegalArgumentException();
        }
        if (custom <= 0){
            this.custom = 1;
        } else {
            this.custom = custom;
        }

    }


    @Override
    public int getTotal(){
        int total = 0;
        for (Item i : this.goods ){
            total += i.totalValue();
        }
        return (int)( total * custom);
    }

}
