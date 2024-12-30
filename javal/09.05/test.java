public class test
{
    public static void main(String[] args)
    {
        Kid kid1 = new Kid("Kidname", 5.0);
        YoungAdoult youngAdoult1 = new YoungAdoult("yname", 3.0 );
        Adoult adoult1 = new Adoult("Aname", 3.0);
        kid1.buyCandy();
        kid1.buyCigarette();
        youngAdoult1.buyCandy();
        youngAdoult1.buyCigarette();
        adoult1.buyCandy();
        adoult1.buyCigarette();
        System.out.println("---------------------------------------------");

        Driving obj = new Driving("alalsdf", 400.000000);
        obj.setPrice(-400);
    }
}
