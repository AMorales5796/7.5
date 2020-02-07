public class MyPetsDriver
{
    public static void main (String args[])
    {
        Dog Rex = new Dog("Rex", "German Shepherd", 2, 160.2, "Kibbles");
        System.out.println(Rex);

        Lizard Zuckerberg = new Lizard("Zuckerberg","Blue-Tounged-Skink", 8, 2, "Pineapple");
        System.out.println(Zuckerberg);

        Bird Speedy = new Bird("Speedy",33,20.4,"Blue",40.5,"Roadrunner","Seeds");
        System.out.println(Speedy);

        //System.out.println("Rex says: " + Rex.Speak());
        //System.out.println("Zuckerberg says: " + Zuckerberg.Speak());
        //System.out.println("Speedy says: " + Speedy.Speak());

        //Check unit conversion
        //System.out.println("Rex's weight in pounds is: " + Rex.AmericanFreedomUnits());

        //Pet secret = new Pet("Secret",7, 40.2); Pet is an abstract class that cannot be instantiated.
    }
}
