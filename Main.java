public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.rectArea();
    }

    public class Rectangle {
        int botLX;
        int botLY;
        int topRX;
        int topRY;

        public Rectangle(int botLX, int botLY, int topRX, int topRY) {
            this.botLX = botLX;
            this.botLY = botLY;
            this.topRX = topRX;
            this.topRY = topRY;
        }
    }
Rectangle A = new Rectangle(-1,-1,10,10);
Rectangle B = new Rectangle(-1,0,3,9);

int pointBottomX =  Math.max(A.botLX, B.botLX);
int pointBottomY =  Math.max(A.botLY,B.botLY);
int pointTopX =  Math.min(A.topRX, B.topRX);
int pointTopY =  Math.min(A.topRY, B.topRY);

Rectangle W = new Rectangle(pointBottomX, pointBottomY ,pointTopX , pointTopY );

int sideA = pointTopY - pointBottomY;
int sideB = pointTopX - pointBottomX;

public void rectArea() {

    double area = sideA * sideB;

    System.out.println("Bottom X : "+ W.botLX + "  Bottom Y : " + W.botLY);
    System.out.println("Top Right X : " + W.topRX + "  Top Right Y : " + W.topRY);
    System.out.println(" Area : " + area);
    }
    int output = 0;
    }
