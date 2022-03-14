package polimorphism;

public class vehicle {
    public void function(){
        System.out.println("Tools Transportation");
    }
    public void fuel() {}
    public void walk() {}
}
class Aeroplane extends vehicle{
    @Override
    public void fuel() {
        System.out.println("Aeroplane fuel");
    }
    @Override
    public void walk() {
        System.out.println("aeroplane flying");
    }
    public static void main(String[] args) {
        Aeroplane garuda = new Aeroplane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
