package chapter02.domain;

public class Remote {
    private final DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");

        if (door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }
}
