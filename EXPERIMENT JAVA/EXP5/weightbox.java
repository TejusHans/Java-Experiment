public class weightbox {
    public static void main(String[] args) {
        System.out.println("Tejus Hans, 24csu222");
        Box b1 = new Box(2, 3, 4);
        b1.displayVolume();

        BoxWeight bw1 = new BoxWeight(2, 3, 4, 10);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1);
        bw2.displayVolume();
        bw2.displayWeight();
    }
}
