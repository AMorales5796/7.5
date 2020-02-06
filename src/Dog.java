public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.breed = breed;
    }// end full constructor with call to super

    public String Speak()
    {
        if(this.age < 2)
        {
            return "Yip";
        }
        else
            {
                return "Woof";
            }
    }
    public int monthlyFeeding() { return 60; }

    public String toString()
    {
        String output = super.toString();
        output += "\nBreed: " + breed;

        return output;
    }// end toString with call to super
}// end class Dog
