package alpha;

/**
 * Created by ronald on 23/10/16.
 */
public class Application {
    public static void main(String[] args) {

        //The stuff below, is creating the anonymous class.
        Machine machine = new Machine() {
            @Override
            public void start() {
                super.start();
                System.out.println("Camera is snapping...");
            }
        };
        machine.start();
        machine.blender();
    }}
