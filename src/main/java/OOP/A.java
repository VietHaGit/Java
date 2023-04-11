package OOP;
/* // Đây là Up - casting nhưng do lớp con đã ghì đè lên phương thức display() của lớp cha nên màn hình sẽ hiển thị là 20
public class A {
    public int x = 10;
    public void display(){
        System.out.println(this.x);
    }
}

class B extends  A {
    public  int x = 20;
    @Override
    public void display() {
        System.out.println(this.x);
    }
}

class Quiz{
    public static void main(String[] args){
        A a = new B();
        a.display();
    }
}
 */

/* // đây là interface hay còn gọi là lớp trừu tượng , khi một lớp con kế thừa interface thì có thể ghì đè lên phương thức của interface đó.
interface A {
    double primeter();
}

interface B {
    double area();
}

class C implements A , B{
    private int h ;
    private  int w;
    public C(int h, int w){
        this.h = h;
        this.w =w;
    }
    public double primeter() {
        return (w+h)*2;
    }
    public double area() {
        return w *h;
    }
}

class Quiz1{
    public static void main(String[] args){
        C c = new C(2,3);
        System.out.println("P:"+c.primeter());
        System.out.println("A:"+c.area());
    }
}
 */

/*
public class A{
    private int x = 0;
    private int y = 0;

    public A(int x , int y){
        this.x=x;
        this.y=y;
    }

}
class quiz12{
    public static void main(String[] args){
        A a = new A(); // lỗi : do mỗi lớp đều sẽ có một phương thức khởi tạo không có tham số sẵn , nhưng nếu đã khởi tạo một phương thức truyền tham số vào thì phải khai báo pt không truyền tham số ra thì mới có thể gọi tới đươc.
        A b = new A(2,3);
    }
}
 */

/*
//khi sử dụng final thì lớp con sẽ không thể kế thừa cũng như là ghì đè lên lớp cha được.
final  class A{
    public  int x = 10;
}

class B extends A{
    public int x = 20;
}
 class quiz1{
    public static void main(String[] args){
        A b = new B();
        System.out.println(b.x);
    }
}

 */

/*
// Biến static là biến có thể dùng để tham chiếu 1 thuộc tính chung của các đối tượng
public class A {
    public static int count = 0;
    public A(){
        count ++; // biến count là static nên mỗi lân dùng constructor của một biến thì count sẽ tăng lên 1
    }

}
class B {
    public static void main(String[] args){
        A a1= new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        System.out.println(a1.count);
    }
}
 */

/*
public class A {
    public String name;
}
class B extends A{
    private String name; // Class con khi kế thừa và ghì đè lên phương thức cha phải có acsess modifier cao hơn hoặc bằng cha
    // thuộc tính cùng tên nhưng có modifier khác nhau sẽ không bị lỗi
}
 */

/*
public class A {
    private  int n = 10;
    public int add(){
        return n;
    }
}
class B extends A {
    public int add( int n) {
        return super.add() + n; // super dùng để tham chiếu tới lớp cha.
    }
}
class quiz11{
    public static void main(String[] args){
        B a = new B();
        System.out.println(a.add(10) + 10);
    }

}
 */

/*
public  class A {
    final public int add(){
        return  x;
    }
}
class B extends A{
    public int add(int x){
        return  super.add(10) + x; // không thể gì đè lên phương thức final trên lớp cha
    }
}
class quiz111{
    public  static void main(String[] args){
        B a = new B();
        System.out.println(a.add(10));

    }
}
 */

/*
public class A {
    public String total(){
        return "A";
    }
}
class B extends  A {
    public String total() {
        return "B";
    }
}
class quiz12 {
    public static void main(String[] args) {
        B n = new A(); // Khi lớp con đã kế thừa lớp cha thì không thể khai báo là new A();
        System.out.println(n.total());
    }
    }
 */

/*
public class A {
    public String total(){
        return "A";
    }
}
class B extends  A {
    // variable Hiding
    public String total() {
        return "B";
    }
}
class quiz12 {
    public static void main(String[] args) {
        A n = new B();
        System.out.println(n.total());
    }
}
 */

/*
public class A {
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}

class C extends B{
    public C(){
        System.out.println("C");
    }
}
class quiz1{
    public static void main(String[] args){
        C c = new C(); // supper(): được gọi tự động từ  A ->B->C
    }

}
 */

/*
public class A {
    private int x = 10;
    public void total(A a){
        a.x = 1; //A a new A(); a.total(a) => a = 1
        System.out.println(a.x);
    }
}
 */

/*
public class A {
    protected int x;
    protected int y;
}
class quiz1{
    public static void main(String[] args){
        A n = new A();
        n.x = 10;// vì x, và y Không phải là private nên sẽ truy xuất được trực tiếp , không phải thông qua method.
        n.y = 20;
        System.out.println(n.x +"/"+n.y );
    }
}
 */

/*
public class A {
    public String total(){
        return "Base";
    }
}
class B extends A{
    public int total(){ // phương thức total() đã bị thay đổi type qua int nên không được xem là overload nên sẽ lỗi.
        return 2;
    }
}

class quiz{
    public static void main(String[] args){
        B b =new B();
        System.out.println(b.total());
    }
}
 */