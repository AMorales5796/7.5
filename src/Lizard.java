public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.species = species;
    }// end full constructor with call to super

    public String Speak()
    {
        return "Hissss";
    }

    @Override
    public int monthlyFeeding() { return 25; }

    public String toString()
    {
        String output = super.toString();
        output += "\nSpecies: " + species;

        return output;
    }// end toString with call to super
}// end class Dog