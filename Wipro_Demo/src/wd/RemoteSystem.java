package wd;
abstract class Remote{
abstract void turnOn();
abstract void turnOff();
}


class TvRemote extends Remote {

void turnOn() {
    System.out.println("TV is now ON.");
}


void turnOff() {
    System.out.println("TV is now OFF.");
}
}
public class RemoteSystem {
    public static void main(String[] args) {
        Remote myRemote = new TvRemote();  
        myRemote.turnOn();                
        myRemote.turnOff();                
    }
}

