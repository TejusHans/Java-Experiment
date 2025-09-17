public class Box {
    private float width;
    private float height;
    private float depth;

    public Box() {
        width = height = depth = 0;
    }

    public Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    public void setWidth(float w) { width = w; }
    public void setHeight(float h) { height = h; }
    public void setDepth(float d) { depth = d; }

    public float getWidth() { return width; }
    public float getHeight() { return height; }
    public float getDepth() { return depth; }

    public void displayVolume() {
        System.out.println("Volume: " + (width * height * depth));
    }
}
