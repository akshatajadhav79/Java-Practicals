// multilevel
class parent{
    String name;
    parent(String name){
        this.name = name;
    }
    void show(){
        System.out.println("I am in parent Class.");
    }
}

class child extends parent{
    child(String name){
        super(name);
    }
    void show(){
        System.out.println("Child");
    }
}

class schild extends child{
    schild(String name){
        super(name);
    }
    void show(){
        System.out.println("schild "+name);
    }
}

// Hierarchical Inheritance
class child1 extends parent{
    child1(String name){
        super(name);
    }
    void disp(){
        System.out.println("Child1" +name);
    }
}
class child2 extends parent{
    child2(String name){
        super(name);
    }
    void disp(){
        System.out.println("Child2" +name);
    }
}

// hybrid pan done.


class inheritance{
    public static void main(String args[]){
        System.out.println("hi");
        schild c = new schild("Akshata");
        c.show();

        // hirarchical obj
        child1 c1 = new child1("Akshata");
        c1.disp();
        child2 c2 = new child2("Akshata");
        c2.disp();
    }
}