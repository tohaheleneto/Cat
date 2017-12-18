public class Cat
{
    public String name;
    public int age;
    public String breed;
    public String color;
    public String sex;
    private static int CountOfCats=0;
    public Cat(String name,int age,String Sex)
    {
        this.name = name;
        this.age=age;
        this.sex = sex;
        CountOfCats++;
    }
    public Cat(String name,int age,String breed,String color,String Sex)
    {
    this.name = name;
    this.age=age;
    this.breed = breed;
    this.color = color;
    this.sex = sex;
    CountOfCats++;
    }
    public Cat()
    {
        this.name = "Anton";
        this.age=7;
        this.breed = "American Shorthair";
        this.color = "black";
        this.sex = "Male";
        CountOfCats++;
    }
    public void ShowCountOfCats()
    {
        System.out.println("CountOfCats: "+CountOfCats);
    }
    public void ShowInfo()
    {
        System.out.println("Name: "+name+", age: "+age +", breed: "+breed+", color: "+color+", sex: "+sex );
    }
    public void ShowColor()
    {
        System.out.println("Name: "+name+", color: ");
    }
    public void ShowSex()
    {
        System.out.println("Name: "+ name+ ", sex: "+sex);
    }
    public void ShowAge()
    {
        System.out.println("Name: "+name+", age: "+age);
    }
    public void ShowBreed()
    {
        System.out.println("Name: "+name + ", breed: "+breed);
    }
}

