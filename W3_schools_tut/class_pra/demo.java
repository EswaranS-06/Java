package class_pra;

public class demo {

    String name;
    int age;
    public demo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void call(){
        System.out.println(name+" is ["+age+"] years old, ");
    }

    public static void main(String[] args) {
        
        demo stu1 = new demo("Eswaran", 19);
        demo stu2 = new demo("Rahul", 20);
        demo stu3 = new demo("Maxwell", 20);
        demo stu4 = new demo("Naveen", 19);
        demo stu5 = new demo("jeevi", 21);

        stu1.call();
        stu2.call();
        stu3.call();
        stu4.call();
        stu5.call();

    }
    
}
