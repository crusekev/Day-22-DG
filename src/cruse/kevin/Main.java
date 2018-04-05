package cruse.kevin;

public class Main
{

    public static void main(String[] args)
    {
        Animal MyAnimal;
        Dog MyDog;
        Cat MyCat;
        MyAnimal = new Animal();
        MyDog = new Dog();
        MyCat = new Cat();
        MyCat.Mean = true;
        ShowAnimalInfo(MyAnimal);
        System.out.println();
        ShowAnimalInfo(MyDog);
        System.out.println();
        ShowAnimalInfo(MyCat);
        System.out.println();
    }
    public static void ShowAnimalInfo(Animal Creature)
    {
        Creature.ShowSpecies();
        Creature.MakeSound();
        //specific animal info will go here
    }

}