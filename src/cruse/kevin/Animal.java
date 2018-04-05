package cruse.kevin;

public class Animal
{
    private int AnimalWeight;
    private String AnimalColor = "Yellow";
    private char AnimalGender = 'M';
    public boolean Mean;
    public void setWeight(int Weight)
    {
        AnimalWeight = Weight;
    }
    public int getWeight()
    {
        System.out.println(AnimalWeight);
        return AnimalWeight;
    }
    public void setGender(char Gender)
    {
        AnimalGender = Gender;
    }
    public char getGender()
    {
        System.out.println(AnimalGender);
        return AnimalGender;
    }
    public void setColor(String Color)
    {
        AnimalColor = Color;
    }
    public String getColor()
    {
        System.out.println(AnimalColor);
        return AnimalColor;
    }
    public void ShowSpecies()
    {
        System.out.println("I am a regular animal");
    }
    public void MakeSound()
    {
        System.out.println("GRRR!");
    }
}
