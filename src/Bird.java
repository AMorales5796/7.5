public class Bird extends Pet
{
    private double wingspan; // inches
    private String color;
    private String species;

    public Bird(String name, int age, double weight, String color, double wingspan, String species, String food)
    {
        super(name,age,weight,food);
        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
    }

    public String Speak()
    {
        return "The Universe is a simulation";
    }
    public int monthlyFeeding() { return 40; }

    public String toString()
    {
        String output = super.toString();
        output += "\nColor: " + color;
        output += "\nWingspan: " + wingspan + " inches";
        output += "\nSpecies: " + species;

        return output;
    }
}
