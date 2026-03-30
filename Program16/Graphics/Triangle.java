package Graphics;
public class Triangle implements
GraphicsTr{
int s1,s2,s3;
public Triangle(int a, int b,int c){
s1=a;
s2=b;
s3=c;
}
public int perimeter(){
return s1+s2+s3;
}
public double area(){
double s=(s1+s2+s3)/2.0;
return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
}
}
