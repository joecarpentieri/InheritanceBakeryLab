import java.util.OptionalDouble;

public class BlueberryPie extends Pie{

    private String freshOrFrozen;
    private double gramsOfBlueberryPerPie;

    public BlueberryPie(String name, String crustType, String fruitType, int producedPerHour, double cost, double soldToForCustomer, int soldPerHour, String FoF){
        super(name, crustType, fruitType, producedPerHour, cost, soldToForCustomer, soldPerHour);
        this.freshOrFrozen = FoF;
        this.gramsOfBlueberryPerPie = 1000;
    }

    public String addBlackberries(){
        return this.fruitType = "Blueberry and Blackberry";
    }

}
