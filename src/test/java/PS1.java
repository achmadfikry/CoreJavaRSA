import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS{

    @Test
    public void testRun(){
        int a = 3;
        PS2 ps2 = new PS2(a); //create object of the class, //constructor
        System.out.println(ps2.increment());
        System.out.println(ps2.decrement());
        doThis(); //inheritance
    }
}
