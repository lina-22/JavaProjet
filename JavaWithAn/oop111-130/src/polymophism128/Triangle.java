package polymophism128;

public class Triangle extends Shape {

    double base, heihgt;

    Triangle(double base, double height){
        this.base = base;
        this.heihgt = height;
    }
    @Override
    double area() {
        System.out.println("area for triangle:");
        return 0.5*base*heihgt;
    }
}
