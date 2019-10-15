package components;

import abstractClasses.Component;

public class CDPlayer extends Component {

    public CDPlayer(String make, String model){
        super(make, model);
    }

    public String play(){
        return "CD Playing";
    }
}
