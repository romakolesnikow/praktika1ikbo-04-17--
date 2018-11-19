package Praktika;

public class Book {

    private String name;
    private int num;

    public Book(String base_name,int base_num){
        name = base_name;
        num = base_num;
    }

    public Book(String base_name){
        name = base_name;
        num = 1000;
    }

    public Book(){
        name = "Prestuplenie i nakazanie";
        num = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
