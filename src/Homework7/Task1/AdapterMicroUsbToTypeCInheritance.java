package Homework7.Task1;
import com.mobile.Legacy.Charger;
public class AdapterMicroUsbToTypeCInheritance extends Charger implements TypeCCharger {


    public AdapterMicroUsbToTypeCInheritance(float voltage, float amperage) {
        super(voltage, amperage);
    }

    @Override
    public float getOutputPower() {
        return getOutputVoltage() *
                getOutputAmperage();
    }


}
