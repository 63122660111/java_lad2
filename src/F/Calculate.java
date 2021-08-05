package F;

public class Calculate {

    // เรียกว่า static method --> ไม่่ต้องสร้าง object
    int sumAdd(int a, int b) {
        int z;
        z = a + b;
        return z;
    }
    public static void main(String[] args) {
        int numbers; //กำหนดตัวแปลนำเบอร์
        numbers = sumAdd(20,30);  //ท้าไม่ระบุบmethodก้จะทำงานไม่ได้
        System.out.println(numbers);
    }
    }

    }

