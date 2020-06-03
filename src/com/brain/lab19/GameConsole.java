package com.brain.lab19;

public class GameConsole implements Powered{
    private Brand brand = Brand.MICROSOFT;
    private Model model = Model.XBOX_360;
    private String serial = "XC123QeWR";
    private boolean isOn;

    {
        if (isOn) {
            this.isOn = true;
            System.out.println("Вкл");
        } else this.isOn = false;
        System.out.println("Выкл");
    }

    public GameConsole(Brand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
   }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }


    class Gamepad implements Powered{
        private Brand brand = Brand.MICROSOFT;
        private String consoleSerial;
        private final int connectedNumber;
        private Color color = Color.GRAY;
        private int chargeLevel = 100;
        private boolean isOn;

        {
            if (isOn) {
                this.isOn = true;
                System.out.println("Вкл");
            } else this.isOn = false;
            System.out.println("Выкл");
        }

         private Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial = serial;
            Gamepad firstGamepad = new Gamepad(brand,1);
            Gamepad secondGamepad = new Gamepad(brand,2);
        }

        @Override
        public void powerOn() {

        }

        @Override
        public void powerOff() {

        }
    }
}

