public class Main {
    public static void main(String[] args) {
        // Menggunakan fitur autocomplete
        MyClass myClass = new MyClass();
        myClass.myMethod();

        // Menggunakan custom live template
        int a = 5;
        int b = 10;
        int hasil = hitung(a, b);
        System.out.println("Hasil: " + hasil);
    }

    public static int hitung(int a, int b) {
        return a + b;
    }
}

class MyClass {
    public void myMethod() {
        System.out.println("Hello, World!");
    }
}