public class ImmutableData{

    void display() {
        double drupe = 65.54;
        int i = (int)drupe;
        System.out.println(i);
    }

    void showing(){
        int num = 50;
        int product = num * num ;
        System.out.println(product);
    }

    public static void main(String[] args) {
        ImmutableData joe = new ImmutableData(); joe.display();
        joe.showing();
    }



}
