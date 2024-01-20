public class newabstract {
    public static void main(String[]args){
        animal l=new lion();
        l.display();
        l.sound();
        l.display1();
        l.house();
        animal c=new cow();
        c.display();
        c.sound();
        c.display1();
        c.house();
    }
}
abstract class animal{
    public abstract void sound();//method
    void display(){
        System.out.println("voice:");
    }
    abstract void house();//method
    void display1(){
        System.out.println("house:");
    }
    
    
}
class lion extends animal{
   public void sound(){
    System.out.println("roar");
   }
   public void house(){
    System.out.println("den");
   }
}
class cow extends animal{
    public void sound(){
        System.out.println("maa");
    }
    public void house(){
        System.out.println("stable");
    }
}
