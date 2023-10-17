public abstract class Pie extends Bakery {

    protected String name;
    protected String crustType;
    protected String fruitType;
    protected int producedPerHour;
    protected double cost;
    protected double soldToForCustomer;
    protected int soldPerHour;

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

//    This is my abstract method in the super-class.
    public abstract String messageForCustomer();

}
