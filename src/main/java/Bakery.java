import java.util.ArrayList;

public class Bakery {

    private String bakeryName;
    private String managerName;
    private double expectedProfit;
    private ArrayList<Pie> piesInOven;

    public Bakery(){
        this.piesInOven = new ArrayList<>();
    }

    public void addPiesToOven(Pie pie){
        this.piesInOven.add(pie);
    }

    public int countPiesInOven(){
        return piesInOven.size();
    }


}
