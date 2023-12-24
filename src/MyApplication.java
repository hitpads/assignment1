import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("C:\\Users\\Ansar\\Desktop\\Java\\assignment_intro\\src\\source");
        Scanner sc= new Scanner(file);

        ArrayList<Point> pointArrayList =new ArrayList<>();
        while (sc.hasNextLine()){
            double x= sc.nextDouble();
            double y= sc.nextDouble();
            pointArrayList.add(new Point(x ,y));



        }
        Shape shape= new Shape(pointArrayList);
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.findAverageSide());
        System.out.println(shape.findLongestSide());
    }
}