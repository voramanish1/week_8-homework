package carpenting;
//programe for calcu;ating the price for carpenting for rectangular room

public class Floor {
    //instance variable
    double width;
    double length;
    Floor(double width, double length){
        this.length= length;
        this.width=width;
        if (width<0)
            width=0;
        if (length<0)
            length=0;}
    //first method with no param
    public double getArea(){
        double area=width*length;
        return area;
    }
}