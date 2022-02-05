package BusResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    public void setCapacity(int cap){
        this.capacity = cap;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setAc(boolean val){
        ac = val;
    }

    public boolean getAc(){
        return ac;
    }

    public int getBusNo(){
        return busNo;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: "+ busNo+" Ac: "+ ac+" Capacity: "+capacity);
    }

    Bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
}
