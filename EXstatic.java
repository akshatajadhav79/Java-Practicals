// object pass Inject Dependency
// You can transform standard Java classes into manageable objects by using dependency injection. Your programs can define dependencies on any managed object by using dependency injection.
interface myclass{
    
    String my_fun(String name);
}
class myclass1{
    private myclass my;
    myclass1(myclass a){
        this.my = a;
        System.out.println("construnctor");
    }
    String my_fun(String name){
        return my.my_fun(name);
    }
}
class NewCLass implements myclass{
    @Override
    public String my_fun(String name){
        return name;
    }
}

class EXstatic{

    //static variable
    static int no = m1();

    EXstatic(){
        System.out.println("Akshata");
    }

    // static block
    static{
        System.out.println("Static Block");
    }

    // static method
    static int m1(){
        System.out.println("Static Method.");
        return 20;
    }

    public static void main(String[] args){
        System.out.println("Main Method." +no);
        EXstatic s = new EXstatic();

        NewCLass m = new NewCLass();
        myclass1 m1 = new myclass1(m);
        String res = m1.my_fun("Sahil");
        System.out.println("res = "+res);

    }
}

