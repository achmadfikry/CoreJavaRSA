import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

    public void doThis(){
        System.out.println("I am here");
    }

    @BeforeMethod
    public void BeforeRun(){
        System.out.println("Run me first");
    }

    @AfterMethod
    public void AfterRun(){
        System.out.println("Run me last");
    }

}
