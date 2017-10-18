package triangle;

import junit.framework.TestCase;
//12 failing(24-35), 23 passing
import static triangle.Triangle.Type.*;

public class TestSuiteC3 extends TestCase {
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
        assertEquals (triangle.Triangle.classify(11,20,30), SCALENE);
}
public void test6() {
        assertEquals (triangle.Triangle.classify(2,3,2), ISOSCELES);
}
public void test7() {
        assertEquals (triangle.Triangle.classify(5,5,5), EQUILATERAL);
}
public void test8() {
        assertEquals (triangle.Triangle.classify(5,6,7), SCALENE);
}
public void test9() {
        assertEquals (triangle.Triangle.classify(5,6,5), ISOSCELES);
}
public void test10() {
        assertEquals (triangle.Triangle.classify(10,10,10), EQUILATERAL);
}
public void test11() {
        assertEquals (triangle.Triangle.classify(10,12,14), SCALENE);
}
public void test12() {
        assertEquals (triangle.Triangle.classify(10,12,10), ISOSCELES);
}
public void test13() {
        assertEquals (triangle.Triangle.classify(20,20,20), EQUILATERAL);
}
public void test14() {
        assertEquals (triangle.Triangle.classify(20,24,28), SCALENE);
}
public void test15() {
        assertEquals (triangle.Triangle.classify(20,24,20), ISOSCELES);
}
public void test16() {
        assertEquals (triangle.Triangle.classify(30,30,30), EQUILATERAL);
}
public void test17() {
        assertEquals (triangle.Triangle.classify(30,36,42), SCALENE);
}
public void test18() {
        assertEquals (triangle.Triangle.classify(30,36,30), ISOSCELES);
}
public void test19() {
        assertEquals (triangle.Triangle.classify(40,40,40), EQUILATERAL);
}
public void test20() {
        assertEquals (triangle.Triangle.classify(40,48,56), SCALENE);
}
public void test21() {
        assertEquals (triangle.Triangle.classify(40,48,40), ISOSCELES);
}
public void test22() {
        assertEquals (triangle.Triangle.classify(50,50,50), EQUILATERAL);
}
public void test23() {
        assertEquals (triangle.Triangle.classify(50,60,70), SCALENE);
}
public void test24() {
        assertEquals (triangle.Triangle.classify(400,400,20), ISOSCELES);
}
public void test25() {
        assertEquals (triangle.Triangle.classify(20,400,400), ISOSCELES);
}
public void test26() {
        assertEquals (triangle.Triangle.classify(25,25,500), INVALID);
}
public void test27() {
        assertEquals (triangle.Triangle.classify(500,500,25), ISOSCELES);
}
public void test28() {
        assertEquals (triangle.Triangle.classify(25,500,500), ISOSCELES);
}
public void test29() {
        assertEquals (triangle.Triangle.classify(30,30,500), INVALID);
}
public void test30() {
        assertEquals (triangle.Triangle.classify(500,500,30), ISOSCELES);
}
public void test31() {
        assertEquals (triangle.Triangle.classify(1500,1500,130), ISOSCELES);
}
public void test32() {
        assertEquals (triangle.Triangle.classify(111,111,1500), INVALID);
}
public void test33() {
        assertEquals (triangle.Triangle.classify(111,111,30), ISOSCELES);
}
public void test34() {
        assertEquals (triangle.Triangle.classify(20,20,3333), INVALID);
}
public void test35() {
        assertEquals (triangle.Triangle.classify(1502,1502,30), ISOSCELES);
}
}