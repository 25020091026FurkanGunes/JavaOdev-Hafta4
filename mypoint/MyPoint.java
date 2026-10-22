package mypoint;

public class MyPoint {
    
    private double x;
    private double y;

    public MyPoint() {
    this.x=0;
    this.y=0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
  
    public double getX() {
        return x;
    }

   
    public double getY() {
        return y;
    }
    
    public double distance(double x,double y){
    return Math.sqrt((x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY()));    
    }
    public static double distance(MyPoint p1,MyPoint p2){
         double farkX=p2.getX()-p1.getX();
         double farkY=p2.getY()-p1.getY();
         return Math.sqrt((farkX*farkX)+(farkY*farkY));
    }
    
    
    public static void main(String[] args) {
        MyPoint m1=new MyPoint(0,0);
        MyPoint m2=new MyPoint(10,30.5);
        
               System.out.println(MyPoint.distance(m1, m2));
    }

   
    
}
