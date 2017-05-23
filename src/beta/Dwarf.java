package beta;

/**
 * Created by ronald on 01/11/16.
 */
public class Dwarf {
    public static void main(String[] args) {

        new Baggins(){
            @Override
            public void fight() {
                System.out.println("Dwarfs are small, but pack a real punch.");
            }
        }.fight();
    }
}


/*
Now what the deal with these anonymous classes? In this instance, Baggins is an interface. As soon as you try and
create an object of an interface, the methods are overwritten. The real nice thing about this is, that you can use lambda
expressions.
 */