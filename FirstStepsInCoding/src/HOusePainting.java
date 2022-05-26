import java.util.Scanner;

public class HOusePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	x – височината на къщата – реално число в интервала [2...100]
        //2.	y – дължината на страничната стена – реално число в интервала [2...100]
        //3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]

        double xHeight = Double.parseDouble(scanner.nextLine());
        double yLenght = Double.parseDouble(scanner.nextLine());
        double hHeightTriangle = Double.parseDouble(scanner.nextLine());

        double frontQuadrat = xHeight * xHeight;
        double totalFrontQuadrat = frontQuadrat * 2;
        double aDoor = 1.2;
        double bDoor = 2.00;
        double finalAreaQuadrat = totalFrontQuadrat - (aDoor * bDoor);

        double sideWalls = xHeight * yLenght;
        double totalSideWalls = sideWalls * 2;
        double window = 1.5;
        double windowArea = (window * window) * 2;
        double finalAreaWalls = totalSideWalls - windowArea;

        double greenPaintArea = finalAreaQuadrat + finalAreaWalls;
        double totalGreenPaint = greenPaintArea/3.4;

        double roofSide = xHeight * yLenght;
        double totalRoofSide = roofSide * 2;
        double roofTriangle = (xHeight * hHeightTriangle)/2;
        double roofTriangleArea = roofTriangle * 2;

        double redPaintArea = totalRoofSide + roofTriangleArea;
        double totalRedPaint = redPaintArea/4.3;

        System.out.printf("%.2f %n %.2f", totalGreenPaint, totalRedPaint);




    }
}
