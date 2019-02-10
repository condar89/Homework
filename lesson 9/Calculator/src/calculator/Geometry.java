package calculator;

/**
 * This is a class that contains geometry operation.
 *
 * @author 37367
 */
public class Geometry {

    public int calculateSquarePerimeter(int sideLength) {
        int perimeter = sideLength * 4;
        return perimeter;
    }

    public int calculateSquareSurface(int sideLength) {
        int surface = sideLength * sideLength;
        return surface;
    }

    public int calculateRectanglePerimeter (int rectWidth, int rectLenght) {
        int rectanglePerimeter;
        rectanglePerimeter = (rectWidth + rectLenght) * 2;
        return rectanglePerimeter;
    }

    public int calculateRecatangleSurface(int rectWidth, int rectLenght) {
        int rectangleSurface = rectLenght * rectWidth;
        return rectangleSurface;
    }

    public int calculateRhombusPerimeter(int rhombusSideLenght) {
        int rhombusPerimeter = rhombusSideLenght * 4;
        return rhombusPerimeter;
    }

    public int calculateRhombusSurface(int rhombusSideLenght, int rhombusHeight) {
        int rhombusSurface = rhombusSideLenght * rhombusHeight;
        return rhombusSurface;
    }

    public int calculateTrianglePerimeter(int hypotenuse, int cathetesA, int cathetesB) {
        int trianglePerimeter = hypotenuse + cathetesA + cathetesB;
        return trianglePerimeter;
    }

    public int calculateTriangleSurface(int hypotenuse, int triangleHeight) {
        int triangleSurface = hypotenuse * triangleHeight;
        return triangleSurface;
    }
}
