public class Streetcat extends Cat
{
    String disease;
    int KilledBird;
    String enemy;
    public Streetcat()
    {
        KilledBird=20;
        enemy="janitor";
        disease="cough";
    }
    public Streetcat(int killedBird,String enemy,String disease)
    {
        this.KilledBird=killedBird;
        this.enemy=enemy;
        this.disease=disease;
    }
    public void ShowFullInfo()
    {
        ShowInfo();
        System.out.println("Killed Birds: " +KilledBird +" enemy: "+enemy + " disease: "+disease );
    }
    public void heal()
    {
        disease="none";
    }
    public void StealToy(HomeCat a)
    {
        a.FavoritToy="none";
    }


}
