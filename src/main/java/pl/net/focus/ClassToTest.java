package pl.net.focus;

public class ClassToTest {
    @Getter
    private Integer a = 10;
    @Getter
    private int b = 20;
    public ClassToTest(){}

    public ClassToTest(Integer a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @param a
     * @param b
     * @return sum
     */
    public int sum(Integer a, int b){
        return a+b;
    }

    /**
     *
     * @return object
     */
    public static ClassToTest returnObject(){
        ClassToTest classToTest = new ClassToTest(10, 20);
        return classToTest;
    }
}
