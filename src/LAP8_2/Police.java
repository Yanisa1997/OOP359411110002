package LAP8_2;

public class Police extends Person {

    private String workContry;

    //Constructor
     public Police(String name, String bornYear, String workContry) {
        super(name, bornYear);
        this.workContry = workContry;
    }

    // introduce
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm Police,I working at "+this.workContry);
    }

    // getter ans setter
    public String getworkContry() {
        return workContry;
    }

    public void setWorkState(String workState) {
        this.workContry = workState;
    }
}
