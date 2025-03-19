public class ParametersAndArguments {
    // Method to calculate area
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }

    public static void main(String[] args) {
        // Declare room dimensions
        int roomWidth = 10;
        int roomHeight = 15;

        // Calculate the area by calling calculateArea method
        int area = calculateArea(roomWidth, roomHeight);

        // Output the calculated area
        System.out.println("The calculated area is: " + area);
    }
}