package MrChibuzoClass;

public class Problem {

    private String name ;
    private boolean isSolve;


    public Problem(){

    }


    Problem(String name, boolean isSolve){
        this.name=name;
        this.isSolve=false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
