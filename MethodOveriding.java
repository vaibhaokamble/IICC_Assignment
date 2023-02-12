package ASSIGNMENT;

class Boys{
    void name(){
        System.out.println("we are friends");
    }

}
public class MethodOveriding extends Boys {
    public static void main(String[] args) {
        Boys b = new Boys();
        b.name();
    }
}
