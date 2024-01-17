import java.util.Random;

/**
 * lol
 */
public class lol {

    public static void main(String[] args) {
        myObj obj;
        Random rand = new Random();
        obj = new myObj();
       System.out.println( Character.toString(200));
        
        obj.name = "lol";
        obj.names[0] = "please";
        for (int i = 0; i < obj.names.length; i++) {

            obj.names[i] = Character.toString(64+rand.nextInt(80));
            obj.names[i] += Character.toString(64+rand.nextInt(80));
            obj.names[i] += Character.toString(64+rand.nextInt(80));
            obj.names[i] += Character.toString(64+rand.nextInt(80));
            obj.names[i] += Character.toString(64+rand.nextInt(80));

        }
        System.out.println(obj.name + " "+ myObj.count+ " "+ obj.names[0]);
    }
}