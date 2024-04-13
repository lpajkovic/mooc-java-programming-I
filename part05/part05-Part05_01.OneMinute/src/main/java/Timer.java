
public class Timer {

    private ClockHand hund;
    private ClockHand secs;
    
    public Timer(){
        this.hund=new ClockHand(100);
        this.secs=new ClockHand(60);
    }
    
    public void advance(){
        this.hund.advance();
        if(this.hund.value()==0){
            this.secs.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.secs + ":" + this.hund;
    }
}
