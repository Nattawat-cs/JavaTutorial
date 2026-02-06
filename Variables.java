public class Variables{
    public static void main(String[] args) {
        //นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น
        int number;
        boolean status;
        char alphabet;
        float number2;
        double number3;
        
        //นืยามตัวแปรแบบระบุค่าเริ่มต้น
        int number1 = 10;
        float count = 20.5f;
        char d = 'A';
        boolean s = true;

        //หลายบรรทัดในครั้งเดียว
        int a = 0, b = 1, c = 2;

        //Example
        int num1 = 10; //ค่าเริ่มต้น = 10
        int num2 = 20; //ค่าเริ่มต้น = 20
        num1 = 50;
        System.out.println("ค่าของตัวเลขที่ 1 = " + num1);
        System.out.println("ค่าของตัวเลขที่ 2 = " + num2);

        // Global & Local Variable

        // Global variable
        int a1 = 100;
        int b1 = 200;
        System.out.println(a1);
        {
            int c1 = 300; // Local variable
            System.out.println("A " + a1);
        }
        System.out.println(b1);

        // Find Max & Min of Primitive variables

        System.out.println(Integer.MIN_VALUE);

        // Type Casting

        // 1.Widening Casting
        // เล้ก -> ใหญ่
        int numInt = 10;
        double numDouble = numInt;
        
        System.out.println(numInt);
        System.out.println(numDouble);       

        // 2.Narrowing Casting
        // ใหญ่ -> เล็ก
        double numDouble1 = 10.0;
        int numInt1 = (int)numDouble1;

        System.out.println(numInt1);
        System.out.println(numDouble1);

        /*
        String คือ ชนิดข้อมูลที่เก็บชุดข้อความ
        symbol = ""
        
        char คือ เก็บตัวอักษร
        symbol = ''

        char เรียงต่อกัน => String
        */
        
        char letter = 'A';
        System.out.println(letter);

        String word = "ABC";
        System.out.println(word);

        String h = "100" , j = "200";
        h = h + 50; // "100" + 50
        
        int g;
        //String -> int
        g = Integer.parseInt(h);
        g = g + 50;

        System.out.println(g);
        System.out.println(h);
        System.out.println(j);

        //String -> Double 
        double u = Double.parseDouble(h);
        System.out.println(u);

        //Integer -> String
        int number4 = 100;
        String age = String.valueOf(number4);
        System.out.println(age);

        // เช็คชนิดข้อมูล
        Integer q = 10;
        double w;
        String e = "Hello";
        boolean t;
        char p;
        
        //เป้น (true) / ไม่เป็น (false)
        boolean result = e instanceof String;
        System.out.println(result);

    }
}