public class Method {
    public static void main(String[] args) {
        Method m = new Method();

        m.sayHelloWithName("Cân nặng là 85kg");
        m.sayHelloWithName("Chiều cao là 1.75m");
        m.sayHelloWithName("Chỉ số BMI:");
        float data = m.bmi(85f, 1.75f);
        System.out.println(data);
    }

    public void sayHelloWithName(String name) {
        System.out.println("Thông tin " + name);
    }

    public float bmi(float a, float b) {
        return a/b/b;
    }
}
