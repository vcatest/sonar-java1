public class BluetoothLowPowerModeCheck {

    // Noncompliant - Directly accessing BluetoothAdapter without checking power mode.
    public void example1() {
        android.bluetooth.BluetoothAdapter adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        adapter.enable();
    }

    // Noncompliant - Starting a Bluetooth scan without considering low power mode.
    public void example2() {
        android.bluetooth.BluetoothAdapter adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        adapter.startDiscovery();
    }

    // Compliant - Checking BluetoothAdapter's state before enabling.
    public void example3() {
        android.bluetooth.BluetoothAdapter adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (adapter != null && !adapter.isEnabled()) {
            adapter.enable();
        }
    }

    // Compliant - Using a BluetoothLeScanner with appropriate scan settings.
    public void example4() {
        android.bluetooth.BluetoothAdapter adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        android.bluetooth.le.BluetoothLeScanner scanner = adapter.getBluetoothLeScanner();
        android.bluetooth.le.ScanSettings settings = new android.bluetooth.le.ScanSettings.Builder()
                .setScanMode(android.bluetooth.le.ScanSettings.SCAN_MODE_LOW_POWER)
                .build();
        scanner.startScan(null, settings, null);
    }
}
