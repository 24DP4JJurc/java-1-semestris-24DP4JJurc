package rvt;

public class chapter50 {

    public static class Box {

        private double width;
        private double height;
        private double length;

        public Box(double width, double height, double length) {
            this.width  = width;
            this.height = height;
            this.length = length;
        }

        public Box(double side) {
            this.width  = side;
            this.height = side;
            this.length = side;
        }

        public Box(Box oldBox) {
            this.width  = oldBox.width;
            this.height = oldBox.height;
            this.length = oldBox.length;
        }

        public double width()  { return width; }
        public double height() { return height; }
        public double length() { return length; }

        public double volume() {
            return width * height * length;
        }

        public double area() {
            return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
        }

        private double faceArea() { return width * height; }
        private double topArea()  { return width * length; }
        private double sideArea() { return height * length; }

        public Box biggerBox(Box oldBox) {
            return new Box(
                1.25 * oldBox.width(),
                1.25 * oldBox.height(),
                1.25 * oldBox.length()
            );
        }

        public Box smallerBox(Box oldBox) {
            return new Box(
                0.75 * oldBox.width(),
                0.75 * oldBox.height(),
                0.75 * oldBox.length()
            );
        }

        public boolean nests(Box outsideBox) {
            return this.width  < outsideBox.width() &&
                   this.height < outsideBox.height() &&
                   this.length < outsideBox.length();
        }

        @Override
        public String toString() {
            return String.format(
                "Box [width=%.2f, height=%.2f, length=%.2f, volume=%.2f, area=%.2f]",
                width, height, length, volume(), area()
            );
        }
    }

    public static void main(String[] args) {
        Box box1 = new Box(2, 3, 4);
        Box box2 = new Box(5);
        Box box3 = new Box(box1);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        Box bigger = box1.biggerBox(box1);
        Box smaller = box1.smallerBox(box1);

        System.out.println("Bigger: " + bigger);
        System.out.println("Smaller: " + smaller);

        System.out.println("Does box1 nest inside box2? " + box1.nests(box2));
    }
}
