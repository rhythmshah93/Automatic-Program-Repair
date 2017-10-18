package triangle;

import junit.framework.TestCase;
//16 failing(5-20), 4 passing
import static triangle.Triangle.Type.*;

public class TestSuiteC6 extends TestCase {
public void test1() {
        assertEquals (triangle.Triangle.classify(1640,1640,1640), EQUILATERAL);
}
public void test2() {
        assertEquals (triangle.Triangle.classify(101,200,300), SCALENE);
}
public void test3() {
        assertEquals (triangle.Triangle.classify(20,30,20), ISOSCELES);
}
public void test4() {
        assertEquals (triangle.Triangle.classify(164,164,164), EQUILATERAL);
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
public void test11() {
        assertEquals (triangle.Triangle.classify(500,600,600), ISOSCELES);
}
public void test12() {
        assertEquals (triangle.Triangle.classify(600,600,500), ISOSCELES);
}
public void test13() {
        assertEquals (triangle.Triangle.classify(600,600,1200), INVALID);
}
public void test14() {
        assertEquals (triangle.Triangle.classify(5,5,100), INVALID);
}
public void test15() {
        assertEquals (triangle.Triangle.classify(5,100,100), ISOSCELES);
}
public void test16() {
        assertEquals (triangle.Triangle.classify(100,100,5), ISOSCELES);
}
public void test17() {
        assertEquals (triangle.Triangle.classify(10,10,200), INVALID);
}
public void test18() {
        assertEquals (triangle.Triangle.classify(10,200,200), ISOSCELES);
}
public void test19() {
        assertEquals (triangle.Triangle.classify(200,200,10), ISOSCELES);
}
public void test20() {
        assertEquals (triangle.Triangle.classify(15,15,300), INVALID);
}
}