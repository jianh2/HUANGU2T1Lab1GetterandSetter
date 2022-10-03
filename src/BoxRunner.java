public class BoxRunner {
    public static void main(String[] args)
    {
        Box box = new Box(5.0, 4.5, 7.2);
        box = new Box(5, 4, 7);
        Box cube = new Box(15.0);
        cube = new Box(15);

        Box newBox = new Box(6, 10, 8);
        public void printVolume() {
        System.out.println("Volume = " + Box.Volume());



    }
}
