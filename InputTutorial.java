import java.util.Scanner;

public class InputTutorial {
    public static void main(String[] args) {
        // รับข้อมูล
        // ข้อมูลแบบไหน ? ตัวเลข integer, float, long, double, ข้อความ String
        // ข้อความทำอะไร
        // ข้อความแบบตัวเลข => คำนวณได้ | คำนวณไม่ได้

        // ประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ = ");
        String name = sc.nextLine(); // รับค่า String จากแป้นพิมพ์ => name

        System.out.print("ป้อนปีเกิดของคุณ = ");
        int age = sc.nextInt();

        System.out.println("ชื่อของคุณ คือ = " + name); // แสดงข้อความที่พิมพ์
        System.out.println("คุณเกิด พ.ศ. = " + age);
    }
}