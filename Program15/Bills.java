import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
interface Billing {
void addProduct(int productId, String name, int quantity, double unitPrice);
void generateBill(int orderNumber);}
class Product {
int productId;
String name;
int quantity;
double unitPrice;
Product(int productId, String name, int quantity, double unitPrice) {
this.productId = productId;
this.name = name;
this.quantity = quantity;
this.unitPrice = unitPrice;}
double getTotal() {
return quantity * unitPrice;}}
class BillGenerator implements Billing {
List<Product> products = new ArrayList<>();
public void addProduct(int productId, String name, int quantity, double unitPrice) {
products.add(new Product(productId, name, quantity, unitPrice));}
public void generateBill(int orderNumber) {
double netAmount = 0;
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss EEEE");
System.out.println("====================Bill No   : " + orderNumber+"========================");
System.out.println(""+ now.format(dateTimeFormat));
System.out.println("------------------------------------------------------------");
System.out.printf("%-6s %-20s %-6s %-10s %-10s\n",
"ID", "Product Name", "Qty", "Price", "Total");
System.out.println("------------------------------------------------------------");
for (Product p : products) {
double total = p.getTotal();
netAmount += total;
System.out.printf("%-6d %-20s %-6d %-10.2f %-10.2f\n",
p.productId, p.name, p.quantity, p.unitPrice, total);}
System.out.println("------------------------------------------------------------");
System.out.printf("%-35s : %.2f\n", "Net Amount", netAmount);}}
public class Bills {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of orders: ");
int orders = sc.nextInt();
sc.nextLine();
List<BillGenerator> allOrders = new ArrayList<>();
for (int o = 1; o <= orders; o++) {
BillGenerator bill = new BillGenerator();
System.out.print("\nEnter number of products for Order " + o + ": ");
int n = sc.nextInt();
sc.nextLine();
for (int i = 0; i < n; i++) {
System.out.println("\nEnter product " + (i + 1) + " details:");
System.out.print("Product ID: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Product Name: ");
String name = sc.nextLine();
System.out.print("Quantity: ");
int qty = sc.nextInt();
System.out.print("Unit Price: ");
double price = sc.nextDouble();
sc.nextLine();
bill.addProduct(id, name, qty, price);}
allOrders.add(bill);}
int orderNumber = 1;
for (BillGenerator bill : allOrders) {
bill.generateBill(orderNumber++);}
sc.close();}}
