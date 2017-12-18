public class HomeCat extends Cat
{
    String OwnerName ;
    String FavoritToy;
    int weight;
    public HomeCat()
    {
        OwnerName="Maria";
        FavoritToy="ball";
        weight=5;
    }
    public HomeCat(String OwnerName,String FavoritToy,int Weight)
    {
        this.OwnerName=OwnerName;
        this.FavoritToy="ball";
        this.weight=5;
    }
    public void ShowFullInfo()
    {
        ShowInfo();
        System.out.println("Owner name: "+OwnerName+" favorit toy: "+" weight "+weight);
    }
    public void ShowOwnerName()
    {
    System.out.println ("Owner name: "+OwnerName);
    }
    public void eat()
    {
        weight++;
    }

}
