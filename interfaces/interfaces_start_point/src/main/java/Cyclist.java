public class Cyclist extends Athlete implements ICycle{
    public void cycle(int distance){
        this.distanceTravelled += distance;
    }
}
