public class Point {
    private int x;
    private int y;

    public void Coordinates(int X, int Y) {
        X = x;
        Y = y;

    }

    public void XCoordinate(int X, int Y) {
        Y = X;
    }

    public void origin() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String Coordinate(int x, int y) {
        return (x + "" + "" + y);


    }

    public String Quadrant() {
        if (x < 0 && y < 0)
            return ("1st Quadrant");
        if (x > 0 && y > 0) {
            return ("3rd Quadrant");
            if (x > 0 && y < 0) {
                return ("4th Quadrant");
                if (x < 0 && y > 0) {
                    return ("2nd Quadrant");
                }


            }

        }
    }
}











