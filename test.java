abstract class A
{
  abstract public void show();
}
class test 
{
public static void main(String s[])
{
 A obj = new A(){
     public void show() {
  System.out.println("test");
   };
  };
obj.show();

}
}