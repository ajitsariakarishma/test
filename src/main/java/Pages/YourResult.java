package Pages;

import Ctm_Sdet_test.LoadProperties;
import Ctm_Sdet_test.utils;

public class YourResult extends utils {

    LoadProperties props = new LoadProperties();

    public void validateTittle(){
        validateTittle(props.getProperty("expectedYourTittle"));
    }

}
