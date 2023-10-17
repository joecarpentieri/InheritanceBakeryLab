import java.util.OptionalDouble;

public class BlueberryPie extends Pie{

    private String freshOrFrozen;
    private double gramsOfBlueberryPerPie;

    public BlueberryPie( int producedPerHour, double cost, double soldToForCustomer, int soldPerHour, String FoF){
        super("Joe's Blueberry Pie", "Hard", "Blueberry", producedPerHour, cost, soldToForCustomer, soldPerHour);
        this.freshOrFrozen = FoF;
        this.gramsOfBlueberryPerPie = 1000;
    }

    public String addBlackberries(){
        return this.fruitType = "Blueberry and Blackberry";
    }

    public String messageForCustomer(){
        return "Here is your " + super.name + ".";
    }

}
