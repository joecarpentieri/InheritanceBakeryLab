public class LemonMeringuePie extends Pie{

    private int lemonsPerPie;
    private int meringuesPerPie;

    public LemonMeringuePie(String name, String crustType, String fruitType, int producedPerHour, double cost, double soldToForCustomer, int soldPerHour){
        super(name, crustType, fruitType, producedPerHour, cost, soldToForCustomer, soldPerHour);
        this.lemonsPerPie = 30;
        this.meringuesPerPie = 20;
    }

    public String cutIntoSlices(){
        return "Cut into slices now!";
    }

}
