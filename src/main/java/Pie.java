public abstract class Pie extends Bakery {

    private String name;
    private String crustType;
    protected String fruitType;
    private int producedPerHour;
    private double cost;
    private double soldToForCustomer;
    private int soldPerHour;

//    Constructor:

    public Pie(String name, String crustType, String fruitType, int producedPerHour, double cost, double soldToForCustomer, int soldPerHour){
        this.name = name;
        this.crustType = crustType;
        this.fruitType = fruitType;
        this.producedPerHour = producedPerHour;
        this.cost = cost;
        this.soldToForCustomer = soldToForCustomer;
        this.soldPerHour = soldPerHour;
    }

    public boolean isItProfitable(){
        return soldToForCustomer > cost;
    }

    public boolean doCustomersLikeIt(){
        return soldPerHour == producedPerHour;
    }

}
