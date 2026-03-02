import java.util.Scanner;
public class MatrixAddition 
{
public static void main(String[] args)
{
int p,q,m,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the number of rows in matrix A: ");
p=s.nextInt();

System.out.print("Enter the number of columns in matrix A: ");
q=s.nextInt();

System.out.print("Enter the number of rows in matrix B: ");
m=s.nextInt();

System.out.print("Enter the number of columns in matrix B: ");
n=s.nextInt();

if(p==m && q==n)
{
int a[][]=new int[p][q];
int b[][]=new int[m][n];
int sum[][]=new int[p][q];

System.out.println("Enter the elements of Matrix A:");
for (int i=0; i<p; i++){
for (int j=0; j<q; j++){
a[i][j] = s.nextInt();
}}

System.out.println("Enter the elements of Matrix B:");
for (int i=0; i<m; i++) {
for (int j=0; j<n; j++) {
b[i][j]=s.nextInt();
}}

System.out.println("\nMatrix A:");
for (int i=0; i<p; i++) {
for (int j=0; j<q; j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}

System.out.println("\nMatrix B:");
for (int i=0; i<m; i++) {
for (int j=0; j<n; j++) {
System.out.print(b[i][j] + " ");
}
System.out.println();
}

for (int i=0; i<p; i++) {
for (int j=0; j<q; j++) {
sum[i][j]=a[i][j]+b[i][j];
}}

System.out.println("\nSum Matrix:");
for (int i=0; i<p; i++) {
for (int j=0; j<q; j++) {
System.out.print(sum[i][j] + " ");
}
System.out.println();
}} 
else {
System.out.println("These matrices cannot be added (dimensions must be same).");
}
s.close();
}}

