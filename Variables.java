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

    }
}