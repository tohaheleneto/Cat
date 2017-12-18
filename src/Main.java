public class Main{

    public static void main( String[] args)
    {
    Cat a = new Cat();
    a.ShowCountOfCats();
    a.ShowSex();
    a.ShowColor();
    a.ShowAge();
    a.ShowBreed();
    Streetcat b = new Streetcat();
    b.ShowFullInfo();
    b.heal();
    b.ShowFullInfo();
    HomeCat c = new HomeCat();
    c.ShowFullInfo();
    c.eat();
    c.ShowFullInfo();
    b.StealToy(c);
    c.ShowFullInfo();
    HomeCat d = new HomeCat("Max","feather",5);
    d.ShowFullInfo();
    Streetcat e = new Streetcat(45,"dog","cough");
    e.ShowFullInfo();
    Cat a2 = new Cat("Black",13,"Male");
    a2.ShowInfo();
    Cat a3 = new Cat("White",8,"Siamese cat","White","Female");
    a3.ShowInfo();
    }
}
