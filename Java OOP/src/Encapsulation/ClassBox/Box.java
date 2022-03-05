package Encapsulation.ClassBox;

public class Box {

    private double length;
    private double width;
    private  double height;

    public Box(double length, double width, double height) {
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    private void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) {
        if (width>0) {
            this.width = width;
        }else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) {
        if (height>0) {
            this.height = height;
        }else {
            throw new IllegalArgumentException ("Height cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea (){
        //2*l*w + 2*l*h + 2*w*h
        return (2*this.length*this.width)+(2*this.length*this.height)+(2*this.width*this.height);
    }

    public double calculateLateralSurfaceArea (){

        //2*l*h + 2*w*h
        return (2*this.length*this.height) + (2*this.width*this.height);
    }
    public double calculateVolume (){
        //l*w*h
        return  this.length*this.height*this.width;
    }

}
