public class Crab implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("The crab is running away");
    }
    @Override
    public void hunt() {
        System.out.println("The crab is hunting");
    }

    @Override
    public void stalk() {
        System.out.println("The crab is stalking");
    }
}
