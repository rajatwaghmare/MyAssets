
public interface Car 
{
    public void numberOfWheels();
    public void speedOfVehcile();

public static void main(String args[])
    {
        FortunerCar fortunerCar = new FortunerCar();
        fortunerCar.carColor();
        fortunerCar.numberOfWheels();
        fortunerCar.speedOfVehcile();
        fortunerCar.priceOfCar();
    }
}

class dreamCar
{
    public void carColor()
    {
        System.out.println("Color of the car is \"Blue\",");
    }
}
class FortunerCar extends dreamCar implements Car 
{
    int wheels = 4;
    
    public FortunerCar()
    {
        System.out.println("default constructor will called first");
    }

    public void numberOfWheels() 
    {
        System.out.println("Fortuner car la \""+wheels+"\"  tyre astat,");
    }

    public void speedOfVehcile() 
    {
        int speed = 350;
        System.out.println("Fortuner car jastit-jast \""+speed+"\" kmph evdha speed ne paluu shkte,");
    }
    
    public void priceOfCar()
    {
        String a="fortuner chi kimat kiman 3-4 acre tri vikav lagel bapala.";
        System.out.println(a);
    }
}
