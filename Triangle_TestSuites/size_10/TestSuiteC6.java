package triangle;

import junit.framework.TestCase;
//8 failing(3-10), 2 passing
import static triangle.Triangle.Type.*;

public class TestSuiteC6 extends TestCase {
public void test1() {
        assertEquals (triangle.Triangle.classify(1640,1640,1640), EQUILATERAL);
}
public void test2() {
        assertEquals (triangle.Triangle.classify(101,200,300), SCALENE);
}
public void test3() {
        assertEquals (triangle.Triangle.classify(1301,1301,500), INVALID);
}
public void test4() {
        assertEquals (triangle.Triangle.classify(1,1,20), INVALID);
}
public void test5() {
        assertEquals (triangle.Triangle.classify(1,20,20), ISOSCELES);
}
public void test6() {
        assertEquals (triangle.Triangle.classify(20,20,1), ISOSCELES);
}
public void test7() {
        assertEquals (triangle.Triangle.classify(500,500,300), ISOSCELES);
}
public void test8() {
        assertEquals (triangle.Triangle.classify(300,500,500), ISOSCELES);
}
public void test9() {
        assertEquals (triangle.Triangle.classify(500,500,1), INVALID);
}
public void test10() {
        assertEquals (triangle.Triangle.classify(50000,50000,100), INVALID);
}
}