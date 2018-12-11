abstract class Fighter {
    KickStrategy kickStrategy;
    JumpStrategy jumpStrategy;

    public Fighter(KickStrategy kickStrategy, JumpStrategy jumpStrategy) {
        this.kickStrategy = kickStrategy;
        this.jumpStrategy = jumpStrategy;
    }

    public void punch() {
        System.out.println("Defualt Punch");
    }

    public void kick() {
        this.kickStrategy.kick();
    }

    public void jump() {
        this.jumpStrategy.jump();
    }

    public void roll() {
        System.out.println("Default Roll");
    }

    public void setKickStrategy(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public void setJumpStrategy(JumpStrategy jumpStrategy) {
        this.jumpStrategy = jumpStrategy;
    }

    public abstract void display();
}

interface KickStrategy {
    public void kick();
}

class LightningKick implements KickStrategy {
    public void kick() {
        System.out.println("Lightning Kick");
    }
}

class TornadoKick implements KickStrategy {
    public void kick() {
        System.out.println("Tornado Kick");
    }
}

interface JumpStrategy {
    public void jump();
}

class ShortJump implements JumpStrategy 
{ 
    public void jump() { 
        System.out.println("Short Jump"); 
    } 
} 
class LongJump implements JumpStrategy 
{ 
    public void jump() { 
        System.out.println("Long Jump"); 
    } 
}

class Ryu extends Fighter {
    public Ryu(KickStrategy kickStrategy, JumpStrategy jumpStrategy) {
        super(kickStrategy, jumpStrategy);
    }

    public void display() {
        System.out.println("Ryu");
    }
}

class StrategyPattern {
    public static void main(String[] args) {
        JumpStrategy shortJump = new ShortJump();
        JumpStrategy longJump = new LongJump();
        KickStrategy tornadoKick = new TornadoKick();

        Fighter ryu =  new Ryu(tornadoKick, shortJump);
        ryu.display();
        ryu.punch();
        ryu.kick();
        ryu.jump();
    }
}