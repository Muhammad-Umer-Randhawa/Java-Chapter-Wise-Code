class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("You started " + this.type);
    }
}