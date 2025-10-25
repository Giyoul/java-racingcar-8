package racingcar.domain;

public class RacingCar {
    private final String name;
    private int position;

    public RacingCar(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move(){
        this.position++;
    }

    public String displayPosition() {
        return name + " : " + "-".repeat(position);
    }

    public String addName(String target){
        if (target.equals("최종 우승자 : ")) {
            return target + name;
        }
        return target + ", " + name;
    }

    public int getPosition() {
        return position;
    }
}
