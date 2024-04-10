interface Product{
    void PName();
    void PPrice();
    void PRating();
}
interface User{
    void Login();
    void Name();
}
class Tomato implements Product{
    String Name;
    int Price;
    double Rating;
    Tomato(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void PName() {
        System.out.println(Name);
    }

    @Override
    public void PPrice() {
        System.out.println(Price);
    }

    @Override
    public void PRating() {
        System.out.println(Rating);
    }
}
class Cucumber implements Product{
    String Name;
    int Price;
    double Rating;
    Cucumber(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void PName() {
        System.out.println(Name);
    }

    @Override
    public void PPrice() {
        System.out.println(Price);
    }

    @Override
    public void PRating() {
        System.out.println(Rating);
    }
}
class Apple implements Product{
    String Name;
    int Price;
    double Rating;
    Apple(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void PName() {
        System.out.println(Name);
    }

    @Override
    public void PPrice() {
        System.out.println(Price);
    }

    @Override
    public void PRating() {
        System.out.println(Rating);
    }
}
class Student implements User {
    String Login;
    String Name;
    Student(String Login, String Password){
        this.Login = Login;
        this.Name=Name;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Name() {
        System.out.println(Name);
    }
}
class Teacher implements User {
    String Login;
    String Name;
    Teacher(String Login, String Password){
        this.Login = Login;
        this.Name=Name;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Name() {
        System.out.println(Name);
    }
}
class Director implements User {
    String Login;
    String Name;
    Director(String Login, String Password){
        this.Login = Login;
        this.Name = Name;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Name() {
        System.out.println(Name);
    }
}
class Realise implements User, Product{
    Product product;
    String UserName;
    int Price;
    double Rating;
    String Login;
    String Name;
    String ProductName;
    Realise(String UserName, int Price, double Rating, String Login, String Name, String ProductName){
        this.UserName = UserName;
        this.Price = Price;
        this.Rating = Rating;
        this.Login = Login;
        this.Name=Name;
        this.ProductName = ProductName;
    }
    @Override
    public void PName() {
        System.out.println(ProductName);
    }

    @Override
    public void PPrice() {
        System.out.println(Price);
    }

    @Override
    public void PRating() {
        System.out.println(Rating);
    }

    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Name() {
        System.out.println(Name);
    }
    void display(){
        System.out.println(UserName + " купила " + ProductName );
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("LlL", "Liza");
        Realise realise = new Realise("Елизавета", 987, 23, "LlL", "Eliz", "Огурец");
        realise.display();
        Product pp = new Tomato("", 22, 4);

    }
}