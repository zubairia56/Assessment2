 class Student3 {
    private String name;
     private int age;
      private int roll_no;
      public String getName(){
          return name;
      }
     public int getAge(){
         return age;
     }
     public int getRoll_no(){
         return roll_no ;
     }
     public void setName(String name){
          this.name=name;
     }
     public void setAge(int age){
          this.age=age;
     }
     public void setRoll_no(int roll_no){
          this.roll_no=roll_no;
     }
 }
 public class Main1{
      public static void main(String[] args) {
          Student3 obj= new Student3();
          obj.setName("Rahul");
          obj.setAge(21);
          obj.setRoll_no(1);
          System.out.println(obj.getName());
          System.out.println(obj.getAge());
          System.out.println (obj.getRoll_no());


      }
 }