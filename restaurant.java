
import java.util.*;

class restaurant
{
       
String dish_name[];int price[];int total;
String dish_name1[]=new String[20];
//storing the items and prices in arrays
int price1[]=new int[20];
String coffee[]={" 1.Expresso"," 2.Cappuccino"," 3.Cold coffee"," 4.Cafe Arabica"," 5.Cafe latte"," 6.Pumpkin spice latte"," 7.Hazelnut coffee"," 8.Caramel coffee"," 9.Flavoured coffee"," 10.Black coffee"," 11.White cream coffee"," 12.Coffee of the day"}; 
int coff_price[]={80,70,120,95,100,150,170,100,80,50,60,110};
String tea[]={" 1.  Iced tea"," 2.  Black tea"," 3.  Green tea"," 4.  Lemon tea"," 5.flavored iced tea"," 6.  Hot tea"," 7.  Assam tea"," 8.Darjeeling tea"," 9.Tea of the day"," 10.Special tea"," 11. mint tea"," 12.Masala tea"};
int tea_price[]={90,80,50,60,100,50,60,100,100,80,90,75};
String snacks[]={" 1.Samosa"," 2.Garlic bread"," 3.French fries"," 4.Cheese sandwich"," 5.Veg grilled sandwich"," 6.Pan pizza"," 7.Veg cutlet"," 8.Veg puff"," 9.Spring roll"," 10.Cheese roll"," 11. Veg burger"," 12.Veg nuggets"};
int snack_price[]={50,70,80,100,120,180,60,50,80,90,150,110};
String desserts[]={" 1.Fudge chocolate cake"," 2.Chocolate mousse"," 3.choice of ice creams"," 4.Mango shot"," 5.Apple pie"," 6.Fruit trifle"," 7.Pineapple pastry"," 8.Chocolate fantasy"," 9.Ice cream cake"," 10.Death by chocolate"," 11.Choice of tarts"," 12.Choice of fruit deserts"};
int dess_price[]={80,80,130,30,60,90,65,100,105,110,70,60};
String specialdrinks[]={" 1.Cool blue"," 2.Ocean green"," 3.Cindrella smile"," 4.Choice of smoothies"," 5.Drink of the day"};
int spec_price[]={150,160,155,100,195};
int ch=0,dish_no=0;char ans;
int q[],q1[]=new int[15];
int k=0,p=0;
//method to display the menu 
void display(String n[],int a[])
{
    int l=a.length;
System.out.println("ITEM"+"\t "+" \t"+"\t "+"\t "+"\t "+"\t"+"\t"+"PRICE");
for (int i=0;i<l;i++)
{
System.out.println(n[i]+"\t "+"\t "+"\t "+"\t "+"\t "+a[i]);
}}
//method to manage the user's choice
void cafe()
{
System.out.println("\t"+"\t"+"\t"+"\t"+"Welcome to 'THE COFFEE CUP'");
System.out.println("WE ARE A CHAIN OF COFFEE SHOPS IN BANGALORE");
System.out.println("WE BELIEVE IN MAXIMUM CHOICE AND CUSTOMER SATISFACTION");
System.out.println();
do
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 'a' to access coffee menu");
System.out.println("Enter 'b' to access tea menu");
System.out.println("Enter 'c' to access snacks menu");
System.out.println("Enter 'd' to access desserts menu");
System.out.println("Enter 'e' to access special drinks menu");
 char s=sc.next().charAt(0);
switch(s) //checking the user's choice
{
case'a': {  
    System.out.println("You can now access the coffee menu");
display( coffee, coff_price);
System.out.println("Please enter the number of items you require");
ch=sc.nextInt();
System.out.println("Number of items required="+ch);//giving the customer choice to change the number of items required
System.out.println("Proceed ? if you want to cancel type'1'otherwise type'2'  ");
int cy=sc.nextInt();
if(cy==2){
q=new int[ch];
dish_name=new String[ch];
price=new int[ch];
for(int i=0;i<ch;i++)
{
System.out.println("Please enter the corresponding number of the dish of your choice");
dish_no=sc.nextInt(); //stores the corresponding number of the dish
dish_name[i]=coffee[dish_no-1];//stores the dish which corresponds to the entered number
price[i]=coff_price[dish_no-1];//stores the price of the chosen dish
dish_name1[p]=coffee[dish_no-1];//adding it to the bill to be displayed
price1[p]=coff_price[dish_no-1];//adding the price to the bill to be displayed
System.out.println("Please enter the quantity required");
q[i]=sc.nextInt();
q1[p]=q[i];//adding the quantity to the bill to calculate the amount
total+=q[i]*price[i];//calculates the total amount
p++;}
}System.out.print("\f");
break;}
case'b': {  System.out.println("You can now access the tea menu");
display( tea, tea_price);
System.out.println("Please enter the number of items you require");
ch=sc.nextInt();
System.out.println("NO of items required="+ch);
System.out.println("Proceed ? if you want to cancel type'1'otherwise type'2'  ");
int cy=sc.nextInt();
if(cy==2){

q=new int[ch];
dish_name=new String[ch];
price=new int[ch];
for(int i=0;i<ch;i++)
{
System.out.println("Please enter the corresponding number of the dish of your choice");
 dish_no=sc.nextInt(); 
dish_name[i]=tea[dish_no-1];
price[i]=tea_price[dish_no-1];
dish_name1[p]=tea[dish_no-1];
price1[p]=tea_price[dish_no-1];
System.out.println("Please enter the quantity required");
q[i]=sc.nextInt();
q1[p]=q[i];
total+=q[i]*price[i];
p++;}}System.out.print("\f");
break;}
case'c': {  System.out.println("You can now access the snacks menu");
display( snacks, snack_price);
System.out.println("Please enter the number of items you require");
ch=sc.nextInt();
System.out.println("NO of items required="+ch);
System.out.println("Proceed ? if you want to cancel type'1'otherwise type'2'  ");
int cy=sc.nextInt();
if(cy==2){
q=new int[ch];
dish_name=new String[ch];
price=new int[ch];
for(int i=0;i<ch;i++)
{
System.out.println("Please enter the corresponding number of the dish of your choice");
 dish_no=sc.nextInt(); 
dish_name[i]=snacks[dish_no-1];
price[i]=snack_price[dish_no-1];
dish_name1[p]=snacks[dish_no-1];
price1[p]=snack_price[dish_no-1];
System.out.println("Please enter the quantity required");
q[i]=sc.nextInt();
q1[p]=q[i];
total+=q[i]*price[i];
p++;}}System.out.print("\f");
break;}
case'd':{  System.out.println("You can now access the desserts menu");
display( desserts, dess_price);
System.out.println("Please enter the number of items you require");
ch=sc.nextInt();
System.out.println("NO of items required="+ch);
System.out.println("Proceed ? if you want to cancel type'1'otherwise type'2'  ");
int cy=sc.nextInt();
if(cy==2)
{
q=new int[ch];
dish_name=new String[ch];
price=new int[ch];
for(int i=0;i<ch;i++)
{
System.out.println("Please enter the corresponding number of the dish of your choice");
 dish_no=sc.nextInt(); 
dish_name[i]=desserts[dish_no-1];
price[i]=dess_price[dish_no-1];
dish_name1[p]=desserts[dish_no-1];
price1[p]=dess_price[dish_no-1];
System.out.println("Please enter the quantity required");
q[i]=sc.nextInt();
q1[p]=q[i];
total+=q[i]*price[i];
p++;}}System.out.print("\f");
break;}
case'e' :{  System.out.println("You can now access the special drinks menu");
display( specialdrinks, spec_price);
System.out.println("Please enter the number of items you require");
ch=sc.nextInt();
System.out.println("NO of items required="+ch);
System.out.println("Proceed ? if you want to cancel type'1'otherwise type'2'  ");
int cy=sc.nextInt();
if(cy==2){
q=new int[ch];
dish_name=new String[ch];
price=new int[ch];
for(int i=0;i<ch;i++)
{
System.out.println("Please enter the corresponding number of the dish of your choice");
 dish_no=sc.nextInt(); 
dish_name[i]=specialdrinks[dish_no-1];
price[i]=spec_price[dish_no-1];
dish_name1[p]=specialdrinks[dish_no-1];
price1[p]=spec_price[dish_no-1];
System.out.println("Please enter the quantity required");
q[i]=sc.nextInt();
q1[p]=q[i];
total+=q[i]*price[i];
p++;}}System.out.print("\f");//clears screen
break;}
default:
System.out.println("Wrong choice");
}
k=k+ch;
System.out.println("Do you want to access any other menu? Type'y' or'n'");
ans=sc.next().charAt(0);
} while(ans=='y'||ans=='Y');
}
//method for printing the bill
void bill()
{   System.out.println("\f");
    Scanner sct=new Scanner(System.in);
    System.out.println("Printing the bill");
int n=0;
System.out.println("  The COFFEE CUP");
System.out.println("  15, M.G. Road");
System.out.println("  Bangalore-560011");
System.out.println("  Contact number: 08022229886");
System.out.println(" ___________________________________________________________________________________________________________________________");
System.out.println(" "+"SL.NO"+"\t"+"\t"+"QUANTITY"+"\t"+"\t"+"ITEMS"+"\t"+"\t"+"PRICE"+"\t"+"\t"+"TOTAL");
for(int i=0;i<p;i++)
{
System.out.println(" "+n+"\t"+"\t"+q1[i]+"\t"+"\t"+dish_name1[i]+"\t"+"\t"+price1[i]+"\t"+"\t"+q1[i]*price1[i]+" ");
n++;} //closing of for
System.out.println("_____________________________________________________________________________________________________________________________");
System.out.println("VAT=10%");
System.out.println("Service charges=8%");

if(total>0){
double gt=total+10%total;//applying VAT to the final amount
double gdt=gt+8%gt;//applying service taxes to the final amount
System.out.println("______________________________________________________________________________________________________________________________");
System.out.println("Grand total ="+gdt);
System.out.println("_______________________________________________________________________________________________________________________________");
if(gdt>=1000&&gdt<2000)
{   //if the bill amount is between Rs.1000 and Rs.2000 then giving a special discount of Rs.100
    System.out.println("Special offer on bill more than Rs.1000");
    System.out.println("Rs.100 off from the bill");
    System.out.println("____________________________________________________________________________________________________________________________");
    double yo=gdt-100;
    System.out.println("New Grand total="+yo);
    System.out.println("_____________________________________________________________________________________________________________________________");
}
if (gdt>=2000)
{   //if the total amount is above Rs.2000 then the customer gets two movie tickets
    System.out.println("You get two movie tickets");
    System.out.println("_____________________________________________________________________________________________________________________________");
}
System.out.println("ENTER MONEY PAID");//to calculate the amount of change to be returned
int pay=sct.nextInt();
double payback=pay-gdt;
System.out.println("Money to be paidback to you=Rs."+payback);
System.out.println("***********************************");
System.out.println();
System.out.println("We value our customers time");
System.out.println("Please wait at the lounge and collect your order");
System.out.println("We regret any inconvinience caused");
System.out.println("Thank you for choosing The coffee cup");
System.out.println("Check out our latest deals and offers on our website-www.coffeecup.com  or contact us for assistance");
System.out.println("Our offers are available only when paid through ICICI bank credit card online");
}
} //bill

public static void main(String args[])throws NumberFormatException
{
    restaurant obj=new restaurant();
    System.out.print("\f");
    obj.cafe();
    obj.bill();
}
}
