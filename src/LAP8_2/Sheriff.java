package LAP8_2;

public class Sheriff extends Person {

    private String WorkState;

    //Constructor
    public Sheriff(String name, String bornYear, String workState) {
        super(name, bornYear);
        WorkState = workState;
    }
    //introduce
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm Sheriff, I working at "+this.WorkState);
    }
    // getter and setter
    public String getWorkState() {
        return WorkState;
    }

    public void setWorkState(String workState) {
        WorkState = workState;
    }
}
