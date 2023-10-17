import interfaces.Reheatable;

import java.util.ArrayList;

public class Bakery {

    private String bakeryName;
    private String managerName;
    private double expectedProfit;
    private ArrayList<Pie> piesInOven;
    private ArrayList<Reheatable> reheatableArrayList;

    public Bakery(){
        this.piesInOven = new ArrayList<>();
        this.reheatableArrayList = new ArrayList<>();
    }

    public void addPiesToOven(Pie pie){
        this.piesInOven.add(pie);
    }

    public int countPiesInOven(){
        return piesInOven.size();
    }

    public void addPiesToReheatable(Reheatable reheatable){
        this.reheatableArrayList.add(reheatable);
    }

    public int countPiesInReheatable(){
        return reheatableArrayList.size();
    }


}
