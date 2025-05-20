public class Circle {

    protected double radius;
    
    public Circle(double radius1){
        this.radius = radius1;
    }

    public void setRadius(double radiusNew){
        this.radius = radiusNew;
    }

    public double getRadius(){
        return this.radius;
    }

    public double diameter(){
        return this.radius*2;
    }

    public double perimeter(){
        return 2*(Math.PI*this.radius);
    }

    public double area(){
        return Math.PI*(this.radius*this.radius);
    }

}
