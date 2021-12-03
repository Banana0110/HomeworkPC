package HomeworkPC;

public class Main {

    public static void main(String[] args) {
        PersonalComputer pc;
        pc = new PersonalComputer();

        PersonalComputer.setDisplay("Samsung");
        pc.setModel("AsRock");
        pc.setColor("Black");
        pc.setSSD(1000);
        pc.setOzu(16);
        pc.setGraphicsCard("NVIDIA GeForce GTX 1650");
        pc.setUsbPorts(3.0);
        pc.setKeyboard("ReDragon");
        pc.setDiagonal(32);
        pc.setManufacturerDisplay("South Korea");
        pc.setMatrix("VA");
        pc.setMemory(500);
        pc.setManufactureSSD("Made in China");
        pc.setID(155.334);
        pc.setKeysOnKeyboard(87);
        pc.setRGB(true);
        pc.setNumPad(false);
        System.out.println("My Personal Computer:\n" + "Model: " + PersonalComputer.Display + "\nColor: " + pc.Color + "\tSSD: "
                + pc.SSD + "\nOzu: " + pc.Ozu + "\nGraphicsCard: " + pc.GraphicsCard + "\tUSB: " + pc.UsbPorts
                + " Keyboard: " + pc.Keyboard + "\nDiagonal: " + pc.Diagonal + "\nDisplay Made in: "
                + pc.ManufacturerDisplay + "\nMatrix type: " + pc.Matrix +
                "\nMemory: " + pc.Memory + "\nSSD Made in: " + pc.ManufactureSSD + "\nID: " + pc.ID +
                "\nKeys amount is : " + pc.KeysOnKeyboard + "\nIs it RGB?" + pc.isRGB +
                "\nIs it have NumPad? " + pc.isNumPad);
    }
}
