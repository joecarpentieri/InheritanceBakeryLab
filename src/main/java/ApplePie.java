public class ApplePie extends Pie {

    private int applesPerPie;

    public ApplePie(String name, String crustType, String fruitType, int producedPerHour, double cost, double soldToForCustomer, int soldPerHour){
        super(name, crustType, fruitType, producedPerHour, cost, soldToForCustomer, soldPerHour);
        this.applesPerPie = 40;
    }

    public String addGenericBirthdayMessage(){
        return "Happy birthday to you!";
    }

}
