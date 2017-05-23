package beta;

/**
 * Created by ronald on 23/10/16.
 */
public class Hobbit {

    public static void main(String[] args) {

        // ((Baggins) () -> System.out.println("Hobbits like to fight.")).fight();

        new Baggins(){
            public void fight(){
                System.out.println("Hobbits like to fight.");
            }
        }.fight();

        new Baggins(){
            @Override
            public void fight() {
                System.out.println("Hobbits have flat feet and dislike " + Baggins.bugs);
            }
        }.fight();

        ((Baggins) () -> System.out.println(Baggins.bugs + " carry disease!")).fight();
    }
}
