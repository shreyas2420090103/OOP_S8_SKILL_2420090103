package Skill4;
public class Finalkeywords {
final int AGE;
final StringBuilder data= new StringBuilder("John");
Finalkeywords(int age)
{
  AGE=age;
}
final void display()
{
  System.out.println("Age:"+AGE);
  System.out.println("String builder method name:" +data);
}
  public static void main(String[] args) {
    Finalkeywords f=new Finalkeywords(20);
    f.data.append("Raj");
    f.display();
    
     
  }

}