public class Sphere extends Circle{
    
    public Sphere(double radius){
        super(radius);
    }

    public void setRadius(double radius){
        super.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double area(){
        return 4*(Math.PI*(this.radius*this.radius));
    }

    
    public double volume(){
        return (4.0/3.0) * Math.PI * (this.radius * this.radius * this.radius);
       
    }
}
