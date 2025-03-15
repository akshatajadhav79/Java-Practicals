import java.util.Scanner;

interface Online {
    void setOnline(String name);
    void getOnline();
}

interface DistEdu{
    void setDistEdu(String data);
    void getDist();
}


class College{
    static collegeName;
    static collegeAdd;
    public void getDetails(){
        System.out.println("Enter COllege Name");

        Scanner sc=new Scanner(System.in);
        collegeName=sc.nextLine();
        System.out.println("Enter COllege Address");
        collegeAdd=sc.nextLine();

               System.out.println("College Name : "+collegeName);
               System.out.println("COllege Address "+collegeAdd);

    }
}

class Online extends College,implements Online{
    String name;
    public void setOnline(String name){
        this.name=name;
    }
    public void getOnline(){
        System.out.println(name);
    }
}

class DistEdu extends College, implements DistEdu{
    String data;
    void setDistEdu(String data){
        this.data=data;
    }
    void getDist(){
        System.out.println("Dist "+data);
    }

}