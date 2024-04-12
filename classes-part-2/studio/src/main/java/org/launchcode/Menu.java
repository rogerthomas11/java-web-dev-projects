package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

//    for (ArrayList<MenuItem> item : items){
//        System.out.println(item);
//        System.out.println();
//    }
}


