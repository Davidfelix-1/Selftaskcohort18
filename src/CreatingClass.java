public class CreatingClass {

    private String make;
    private String model;
    private String colour;


    public CreatingClass(String make, String model, String colour){
        this.make = make ;
        this.model=model;
        this.colour=colour;
    }

    public CreatingClass(){

    }

    public void setMake(String toyota) {
        this.make=toyota;
    }

    public String getMake(){
        return make;
    }
}
