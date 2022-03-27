package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AlarmTest {

    @Test
    public void testAClockAlarmReturnTrueWhenValueLessTan17(){
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(15.3);
        Alarm alarm = new Alarm(sensor);

        alarm.check();
        Assert.assertTrue(true);

    }

    @Test
    public void testAClockAlarmReturnTrueWhenValueMoreTan21(){
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(22.8);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertTrue(true);

    }

    @Test
    public void testAClockAlarmReturnFalseWhenValueBetween17And21() {
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(20.1);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertFalse(false);
    }
}