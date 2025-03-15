abstract class Shape{
    String myname = "";
    Shape(String name){
        this.myname = name;
    }
    public void moveTo(int x , int y){
        System.out.println("Value of x and y ="+x+ " " +y);
    }
    abstract public double Area();
    abstract public void draw();
}

class Rect extends Shape{
    int len,wid;
    Rect(int len,int wid,String name ){
        super(name);
        this.len = len;
        this.wid = wid;
    }
    public double Area(){
        return len*wid;
    }
    public void draw(){
        System.out.println("Reactangle");
    }
}

class circle extends Shape{
    double pi = 3.14;
    int r;
    circle(int r,String name){
        super(name);
        this.r = r;
    }
    public double Area(){
        return pi*r*r;
    }
    public void draw(){
        System.out.println("Circle=");
    }
}

class abstractClass{
    public static void main(String args[]){
        Shape re = new Rect(12,2,"rectangle");
        System.out.println("Area of rect=" +re.Area());
        re.draw();

        Shape c = new circle(2,"circle");
        System.out.println("Area of circle=" +c.Area());
        c.draw();

        // System.out.println(re.moveTo(12,34));

    }
}