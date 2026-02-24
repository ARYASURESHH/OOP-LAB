class ComplexNo{
double real,img;
ComplexNo(double r,double i)
{
real=r;
img=i;
}
public static ComplexNo sum(ComplexNo c1,ComplexNo c2)
{
ComplexNo temp=new ComplexNo(0,0);
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
public static void main(String args[])
{
ComplexNo c1=new ComplexNo(5.5,4);
ComplexNo c2=new ComplexNo(1.2,3.5);
ComplexNo temp=sum(c1,c2);
System.out.println("Sum is: "+temp.real + " + " + temp.img+"i");
}
}


