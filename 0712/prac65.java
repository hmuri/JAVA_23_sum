class HealthData<W, H> {
    private String name;
    private W weight;
    private H height;

    public HealthData(String name, W weight, H height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeight() {
        return weight;
    }

    public void setWeight(W weight) {
        this.weight = weight;
    }

    public H getHeight() {
        return height;
    }

    public void setHeight(H height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + height + ", " + weight + ")";
    }
}

public class prac65 {
    public static void main(String[] args) {
        HealthData<Integer, Integer> person1 = new HealthData<>("김동덕", 50, 160);
        HealthData<Double, Integer> person2 = new HealthData<>("홍길동", 100.35, 180);
        HealthData<Integer, Double> person3 = new HealthData<>("성춘향", 65, 156.7);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        double totalWeight = person1.getWeight() + person2.getWeight() + person3.getWeight();
        System.out.println("3사람 체중의 합: " + totalWeight);
    }
}

