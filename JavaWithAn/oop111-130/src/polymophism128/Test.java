package polymophism128;

public class Test {
    public static void main(String[] args) {
        Shape [] s = new Shape[3];

        s [0]= new Shape();
       s[1] = new Rectangle(10, 20);
       s[2] = new Triangle(40,50);

        for (int i = 0; i <3 ; i++) {
            System.out.println(s[i].area());

        }


        // or
       // System.out.println(s[0].area());
        //System.out.println(s[1].area());
        //System.out.println(s[2].area());
    }
}
