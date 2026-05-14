public class Dogs {

    int size;
    String name;


    Dogs(int size, String name){
        this.name = name;
        this.size = size;
    }

    void bark(){

        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
