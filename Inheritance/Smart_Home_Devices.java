public class Smart_Home_Devices {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T1001", "Online", 24);
        Thermostat t2 = new Thermostat("T1002", "Offline", 20);

        t1.displayStatus();
        t2.displayStatus();
    }
}

class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("Thermostat -> Device ID: " + deviceId + ", Status: " + status + ", Temp Setting: " + temperatureSetting + "°C");
    }
}
