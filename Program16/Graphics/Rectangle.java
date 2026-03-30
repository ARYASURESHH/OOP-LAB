package Graphics;
public class Rectangle implements GraphicsRec{
int length, breadth;
public Rectangle(int l,int b){
length=l;
breadth=b;
}
public int perimeter(){
return 2*(length+breadth);
}
public int area() {
return length*breadth;
}
}
