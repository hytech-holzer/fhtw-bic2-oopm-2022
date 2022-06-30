package Onlinehandel.entities;

public class Item {
    private int amount = 1;
    private String description;

    private int value;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public Item(String description, int amount, int value){
        this.description = description;
        if(amount > 0) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException();
        }
        if (value > 0) {
            this.value = value;
        } else {
            throw new IllegalArgumentException();
        }

    }

    int totalValue(){
        return amount*value;
    }



    @Override
    public String toString() {
        return description;
    }
}
