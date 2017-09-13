package shallowClone;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    int diskSize;
    double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = processorSpeed;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computePower(){
        return ramSize*processorSpeed;
    }

    @Override
    public String toString() {
        return "shallowClone.Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", diskSize=" + diskSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }

    @Override
    public boolean equals(Object ob){
        if (ob==null)return false;
        if (!(ob instanceof Computer)) return false;
        Computer comp= (Computer) ob;
        if(this.manufacturer==(comp.manufacturer)&&this.processorSpeed==(comp).processorSpeed&& this.processor==(comp).processor&&this.ramSize==comp.ramSize&&this.diskSize==comp.diskSize)
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        int s=27;
        s=s+ this.manufacturer.hashCode()+this.processor.hashCode()+(int)(this.diskSize ^ (this.diskSize >>> 32))+(int)(this.ramSize ^ (this.ramSize >>> 32))+Double.valueOf(this.processorSpeed).hashCode();
        return s;
    }


}


