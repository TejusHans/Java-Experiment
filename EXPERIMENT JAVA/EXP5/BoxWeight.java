public class BoxWeight extends Box {
    private float weight;

    public BoxWeight() {
        super();
        weight = 0;
    }

    public BoxWeight(float w, float h, float d, float wt) {
        super(w, h, d);
        weight = wt;
    }

    public BoxWeight(BoxWeight bw) {
        super(bw);
        this.weight = bw.weight;
    }

    public void setWeight(float wt) { weight = wt; }
    public float getWeight() { return weight; }

    public void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}
