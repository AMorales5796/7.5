public abstract class Pet
{
    //Instance Variables
    private String name;
    protected int age;
    private double weight; // in kilograms
    public String food;

    //Constructors
    public Pet(String name, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }// end full constructor called child classes

    abstract public String Speak();
    abstract public int monthlyFeeding();
    //Getters
    public String getName()
    {
        return name;
    }// end name getter
    public int getAge()
    {
        return age;
    }// end age getter
    public double getWeight()
    {
        return weight;
    }// end weight getter
    public String getFood(){ return food; }// end food getter

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }// end name setter
    public void setAge(int age)
    {
        this.age = age;
    }// end age setter
    public void setWeight(double weight)
    {
        this.weight = weight;
    }// end weight setter
    public void setFood (String food) { this.food = food; }// end food getter

    //Brain Method
    public double AmericanFreedomUnits()
    {
        return weight*2.205;
    }// end method to convert weight value into pounds

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight;
        output += "\nFood: " + food;

        return output;
    }
}

