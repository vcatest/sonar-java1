public class UseMotionSensorWithoutGyroscopeCheck {

    // Noncompliant - Using MotionSensor without checking for gyroscope availability
    public void example1() {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) getApplicationContext().getSystemService(android.content.Context.SENSOR_SERVICE);
        android.hardware.Sensor motionSensor = sensorManager.getDefaultSensor(android.hardware.Sensor.TYPE_LINEAR_ACCELERATION);
        if (motionSensor != null) {
            sensorManager.registerListener(new android.hardware.SensorEventListener() {
                @Override
                public void onSensorChanged(android.hardware.SensorEvent event) {
                    // Process motion data
                }

                @Override
                public void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {

                }
            }, motionSensor, android.hardware.SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    // Noncompliant - Directly accessing motion sensor without gyroscope check
    public void example2() {
        android.hardware.SensorManager sm = (android.hardware.SensorManager) getApplicationContext().getSystemService(android.content.Context.SENSOR_SERVICE);
        android.hardware.Sensor accelerometer = sm.getDefaultSensor(android.hardware.Sensor.TYPE_ACCELEROMETER);
        if (accelerometer != null) {
            float[] values = new float[3];
            sm.getSensorEventData(accelerometer, values);
            // Use accelerometer values
        }
    }

    // Compliant - Checking for gyroscope before using motion sensor
    public void example3() {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) getApplicationContext().getSystemService(android.content.Context.SENSOR_SERVICE);
        android.hardware.Sensor gyroscopeSensor = sensorManager.getDefaultSensor(android.hardware.Sensor.TYPE_GYROSCOPE);

        if (gyroscopeSensor != null) {
            android.hardware.Sensor motionSensor = sensorManager.getDefaultSensor(android.hardware.Sensor.TYPE_LINEAR_ACCELERATION);
            if (motionSensor != null) {
                sensorManager.registerListener(new android.hardware.SensorEventListener() {
                    @Override
                    public void onSensorChanged(android.hardware.SensorEvent event) {
                        // Process motion data
                    }

                    @Override
                    public void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {

                    }
                }, motionSensor, android.hardware.SensorManager.SENSOR_DELAY_NORMAL);
            }
        }
    }

    // Compliant - Using accelerometer only, no gyroscope dependency
    public void example4() {
        android.hardware.SensorManager sm = (android.hardware.SensorManager) getApplicationContext().getSystemService(android.content.Context.SENSOR_SERVICE);
        android.hardware.Sensor accelerometer = sm.getDefaultSensor(android.hardware.Sensor.TYPE_ACCELEROMETER);
        if (accelerometer != null) {
            float[] values = new float[3];
            sm.getSensorEventData(accelerometer, values);
            // Use accelerometer values
        }
    }

    private android.content.Context getApplicationContext() {
        return null;
    }
}
