
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


public class UserController {
    private UserModel model;
    private UserView view;
    
    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setUserDetails(String name, int age) {
        model.setName(name);
        model.setAge(age);
    }
    
    public void updateUserView() {
        view.printUserDetails(model.getName(), model.getAge());
    }
}



