package HomeworkPC;

public class PersonalComputer {
    public static String Display;

    public String Model;
    public String Color;
    public double SSD;
    public double Ozu;
    public String GraphicsCard;
    public double UsbPorts;
    public String Keyboard;
    public int Diagonal;
    public String ManufacturerDisplay;
    public String Matrix;
    public int Memory;
    public String ManufactureSSD;
    public double ID;
    public int KeysOnKeyboard;
    public boolean isRGB;
    public boolean isNumPad;

    public static void setDisplay(String display) {
        Display = display;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public void setSSD(double SSD) {
        this.SSD = SSD;
    }

    public void setOzu(double ozu) {
        this.Ozu = ozu;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.GraphicsCard = graphicsCard;
    }

    public void setUsbPorts(double usbPorts) {
        this.UsbPorts = usbPorts;
    }

    public void setKeyboard(String keyboard) {
        this.Keyboard = keyboard;
    }

    public void setDiagonal(int diagonal) {
        this.Diagonal = diagonal;
    }

    public void setManufacturerDisplay(String manufacturerDisplay) {
        this.ManufacturerDisplay = manufacturerDisplay;
    }

    public void setMatrix(String matrix) {
        this.Matrix = matrix;
    }

    public void setMemory(int memory) {
        this.Memory = memory;
    }

    public void setManufactureSSD(String manufactureSSD) {
        this.ManufactureSSD = manufactureSSD;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public void setKeysOnKeyboard(double keysOnKeyboard) {
        KeysOnKeyboard = (int) keysOnKeyboard;
    }

    public void setRGB(boolean RGB) {
        this.isRGB = RGB;
    }

    public void setNumPad(boolean numPad) {
        this.isNumPad = numPad;
    }
}
