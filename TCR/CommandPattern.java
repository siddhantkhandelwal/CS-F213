interface Command {
    public void execute();
}

class Light {
    public void on() {
        System.out.println("Lights on");
    }

    public void off() {
        System.out.println("Lights off");
    }
}

class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }
}

class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }
}

class Stereo 
{ 
    public void on() 
    { 
        System.out.println("Stereo is on"); 
    } 
    public void off() 
    { 
        System.out.println("Stereo is off"); 
    } 
    public void setCD() 
    { 
        System.out.println("Stereo is set " + 
                           "for CD input"); 
    } 
    public void setDVD() 
    { 
        System.out.println("Stereo is set"+ 
                         " for DVD input"); 
    } 
    public void setRadio() 
    { 
        System.out.println("Stereo is set" + 
                           " for Radio"); 
    } 
    public void setVolume(int volume) 
    { 
       // code to set the volume 
       System.out.println("Stereo volume set"
                          + " to " + volume); 
    } 
} 
class StereoOffCommand implements Command 
{ 
    Stereo stereo; 
    public StereoOffCommand(Stereo stereo) 
    { 
        this.stereo = stereo; 
    } 
    public void execute() 
    { 
       stereo.off(); 
    } 
} 
class StereoOnWithCDCommand implements Command 
{ 
     Stereo stereo; 
     public StereoOnWithCDCommand(Stereo stereo) 
     { 
         this.stereo = stereo; 
     } 
     public void execute() 
     { 
         stereo.on(); 
         stereo.setCD(); 
         stereo.setVolume(11); 
     } 
}

class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}

class CommandPattern {
    public static void main(String[] args) {
        SimpleRemoteControl src = new SimpleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        src.setCommand(new LightOnCommand(light));
        src.buttonWasPressed();
        src.setCommand(new LightOffCommand(light));
        src.buttonWasPressed();
    }
}