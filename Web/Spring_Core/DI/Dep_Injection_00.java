
//  here is an simple example Java code that demonstrates dependency injection using the Spring frameworks core module
/*
First you need to define the bean to be injected
Lets say you have a "UserRepository" class that implements a "UserDAO" interface
you can define this bean in our Spring configuration file (lets call it "application-context.xml") as follows

<bean id="userRepository" class="com.example.UserRepositoryImpl"/>

Next  define the class that will use the "UserRepository" bean lets say you have a "UserService" class that depends on the "UserRepository" bean
you can define this class as follows:
*/
