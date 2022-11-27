package staticCount91;

public class People {
    static int count = 0;

    People(){
        count++;
    }

    void totalPeople(){
        System.out.println("Total people here :" + count);
    }
}
