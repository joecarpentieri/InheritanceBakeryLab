import interfaces.Reheatable;

import java.util.ArrayList;
import java.util.List;

public class LemonMeringuePie extends Pie implements Reheatable {

    private int lemonsPerPie;
    private int meringuesPerPie;

    public LemonMeringuePie(int producedPerHour, double cost, double soldToForCustomer, int soldPerHour){
        super("Joe's Lemon Meringue Pie", "soft", "Lemon", producedPerHour, cost, soldToForCustomer, soldPerHour);
        this.lemonsPerPie = 20;
        this.meringuesPerPie = 15;
    }

    public String cutIntoSlices(){
        return "Cut into slices now!";
    }

    public String messageForCustomer(){
        return "Here is your " + super.name + ".";
    }

    public String reheat(String temperature){
        return "This " + super.name + " has been reheated to " + temperature + ".";
    }

}
