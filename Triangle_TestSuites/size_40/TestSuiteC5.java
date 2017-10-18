package triangle;

import junit.framework.TestCase;
//26 failing(15-40), 14 passing
import static triangle.Triangle.Type.*;

public class TestSuiteC5 extends TestCase {
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
public void test21() {
        assertEquals (triangle.Triangle.classify(300,300,15), ISOSCELES);
}
public void test22() {
        assertEquals (triangle.Triangle.classify(15,300,300), ISOSCELES);
}
public void test23() {
        assertEquals (triangle.Triangle.classify(20,20,400), INVALID);
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
        assertEquals (triangle.Triangle.classify(1640,1640,1956), ISOSCELES);
}
public void test36() {
        assertEquals (triangle.Triangle.classify(1956,1301,1301), INVALID);
}
public void test37() {
        assertEquals (triangle.Triangle.classify(1301,1301,500), INVALID);
}
public void test38() {
        assertEquals (triangle.Triangle.classify(1,1,20), INVALID);
}
public void test39() {
        assertEquals (triangle.Triangle.classify(1,20,20), ISOSCELES);
}
public void test40() {
        assertEquals (triangle.Triangle.classify(20,20,1), ISOSCELES);
}
}