import com.example.demo.Person;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person("Tom",66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());

        int score = 88;
        System.out.println(score > 80 && score < 90);
        System.out.println(score < 80 || score > 90);

        char c = 'A';
        System.out.println( c > 60);
        System.out.println( c < 60);
    }
}
