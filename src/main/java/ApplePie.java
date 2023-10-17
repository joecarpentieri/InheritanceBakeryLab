public class ApplePie extends Pie {

    private int applesPerPie;

    public ApplePie(int producedPerHour, double cost, double soldToForCustomer, int soldPerHour){
        super("Joe's Apple Pie", "Puff Pastry", "Apple", producedPerHour, cost, soldToForCustomer, soldPerHour);
        this.applesPerPie = 40;
    }

    public String addGenericBirthdayMessage(){
        return "Happy birthday to you!";
    }

//    Where I added the method overload
    public String addGenericBirthdayMessage(String addName){
        return "Happy birthday to you " + addName + "!";
    }

    public String addGenericBirthdayMessage(int age){
        return "Happy birthday, you're " + age + ".";
    }

    public String messageForCustomer(){
        return "Here is your " + super.name + ".";
    }

}
