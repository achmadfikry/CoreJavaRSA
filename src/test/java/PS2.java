public class PS2 {
    int a; //this variable a is global variable

    public PS2(int a) { //this parameter a is an intance variable
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
