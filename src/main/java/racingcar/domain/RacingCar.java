package racingcar.domain;

public class RacingCar {
    private final String name;
    private int position;

    public RacingCar(String name) {
        this.name = name;
        this.position = 0;
    }

    /**
     * Moves the car forward by one position
     */
    public void move(){
        this.position++;
    }

    /**
     * Returns the current position as a formatted string
     * @return formatted string in "carName : ---" format
     */
    public String displayPosition() {
        return name + " : " + "-".repeat(position);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getNameLength(){
        return name.length();
    }
}
