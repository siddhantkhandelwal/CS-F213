interface State {
    public void goNext();
}

class CarEngineStartState implements State {
    public void goNext() {
        System.out.println("CarEngine Start");
    }
}

class CarEngineStopState implements State {
    public void goNext() {
        System.out.println("CarEngine Stop");
    }
}

class CarEngineContext implements State {
    private State carEngineState;

    public void setState(State state) {
        carEngineState = state;
    }

    public State getState(State state) {
        return carEngineState;
    }

    public void goNext() {
        carEngineState.goNext();
    }
}

class StatePattern {
    public static void main(String[] args) {
        CarEngineContext carEngineContext = new CarEngineContext();
        CarEngineStartState carEngineStart = new CarEngineStartState();
        CarEngineStopState carEngineStop = new CarEngineStopState();

        carEngineContext.setState(carEngineStart);
        carEngineContext.goNext();
        
        carEngineContext.setState(carEngineStop);
        carEngineContext.goNext();
    }
}