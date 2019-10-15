package components ;

import abstractClasses.Component;

public class Radio extends Component {

    public Radio(String make, String model){
        super(make, model);
    }

    public String play(){
        return "Radio 1";
    }

}
