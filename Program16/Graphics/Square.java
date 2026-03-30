package Graphics;
public class Square implements
GraphicsSq{
int side;
public Square(int s){
side=s;
}
public int perimeter(){
return 4*side;
}
public int area(){
return side*side;
}
}
