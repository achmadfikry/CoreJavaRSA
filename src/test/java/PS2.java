public class PS2 extends PS3{
    int a; //this variable a is global variable

    public PS2(int a) { //this parameter a is an intance variable
        super(a); //parent class constructor is invoked, super keyword is onl used when there is an inheritance
        //1. When you don't have any parent class, then the super key word will go nowhere because the duty of this is to invoke parent class constructor.
        //2. And another rule is whenever you are writing super keyword, make sure that should be the first line in your child constructor.
        this.a = a; //change the global variable equals to instance variable
    }

    public int increment(){
        a = a + 1;
        return a;
    }

    public int decrement(){
        a = a - 1;
        return a;
    }
}
