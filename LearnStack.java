import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> animal = new Stack<>(); 
        animal.push("cat");
        animal.push("horse");
        animal.push("dog");
        animal.push("donkey");
        System.out.println(animal);
        System.out.println(animal.peek());
        System.out.println(animal.pop());
        System.out.println(animal.peek());
    }    
}
