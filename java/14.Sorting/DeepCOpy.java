public class DeepCOpy {
    public static void main(String[] args) {

        try {
            Student s = new Student("Rushikesh", new Address("Nashik", 400001));
            Student s2 = (Student)s.clone();
            System.out.println(s);
            s2.setName("Rushi");
            s2.setAddress(new Address("Pune", 401));
            System.out.println(s2);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Student implements Cloneable {
    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
     public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone();
       // clonedStudent.address = (Address) address.clone(); // Clone the Address object
        return clonedStudent;
    }
}

class Address  {
    private String city;
    private int pincode;

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public void setCity(String city){
        this.city = city;
    }
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     return  super.clone();
    // }
}
