public class Upcasting {
    public Upcasting(){

    }
    public void print(){
        System.out.println("print from Superclass");
    }
}

class B extends Upcasting{
    public B() {

    }
    @Override
    public void print(){
        System.out.println("print from Subclass");
    }

    public void nonOverridden(){
        System.out.println("non overriden method");
    }
}

class Program{
   public static void main(String[] args) {
    Upcasting u = new B();   //upcasting 
    u.print();
    B b= (B)u;      //downcasting
    b.nonOverridden();

   }
}