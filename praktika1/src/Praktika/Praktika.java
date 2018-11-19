package Praktika;
public class Praktika {

    public static void main(String[] args){
        Ball object1 = new Ball(4,"jopa");
        System.out.println(object1.getColor());
        System.out.println(object1.getRadius());

        Book object2 = new Book();
        System.out.println(object2.getName());
        System.out.println(object2.getNum());
        }
}

