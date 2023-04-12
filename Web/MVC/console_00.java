
public class UserModel {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}


public class UserView {
    public void printUserDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

