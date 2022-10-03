public class RectangleRunner {
    public static void main(String[] args)
    {
    Rectangle plot1 = new Rectangle(150,200);
    Rectangle plot2 = new Rectangle(125);
    Rectangle plot3 = new Rectangle();



    plot1.setWidth(75);
    plot2.setWidth(75);
    plot2.setLength(75);
    plot3.setWidth(75);

    int l1 = plot1.getLength();
    int W1 = plot1.getWidth();
    int A1 = plot1.calculateArea();


    int l2 = plot2.getLength();
    int W2 = plot2.getWidth();
    int A2 = plot2.calculateArea();

    int l3 = plot1.getLength();
    int W3 = plot1.getWidth();
    int A3 = plot1.calculateArea();
    int totalArea = A1 + A2 + A3;

    System.out.println("These three plots require" + totalArea + "square feet of seed");















    }
}
