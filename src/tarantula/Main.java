package tarantula;

import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;

/**
 * This class outputs the suspiciousness and confidence of suspiciousness per line of a program. It requires two arguments
 * (1) the file path to a .json coverage matrix (produced by tacoco)
 * (2) the name of the JUnit test class
 */

public class Main {
     
    public static void main(String[] args) throws ClassNotFoundException {
            
        // create the Matrix Reader to get Test -- Stmt information
        File f = new File(args[0]); // example: "/home/Downloads/triangle-mvn-compact-cov-matrix.json"
        CovMatrixReader reader = new CovMatrixReader(f);
            
        // The test count is a Long in the Json file, must parse it to an Integer
        Long testCountLong = reader.getTestCount();
        String testCountString = testCountLong.toString();
        int testCountInt = Integer.parseInt(testCountString);
            
        // create Runner class to get the failing cases from JUnit tests
        Class testClass = Class.forName(args[1]); // example: "TarantulaCalculator.TriangleTest"
        Runner r = new Runner(testClass);
        r.determineFailCases();
        ArrayList<Integer> fails = r.getFailCases();
         
        // set coverage matrix -- [test] [stmt]
        boolean[][] M = reader.getM();
        TarantulaSuspiciousnessCalculation calc = new TarantulaSuspiciousnessCalculation(M);
             
        // set coverable statements -- [stmt]
        boolean[] C = reader.getC();
        calc.setC(C);
             
        // set failing test cases -- [test]
        boolean[] F =new boolean[testCountInt];
        Arrays.fill(F, false); 
        for(Integer i : fails) {
            F[i - 1] = true; //true=failing test
        }
        calc.setF(F);
             
        // set live test cases -- [test]
        // by default all test cases are used
        boolean[] L = new boolean[testCountInt];
        Arrays.fill(L, true);
        calc.setL(L);
             
        // compute the suspiciousness using the tarantula technique
        calc.compute();
             
        //display the results
        System.out.println("For program: " + reader.getFullName());
        display(calc.getConfidence(), calc.getSuspiciousness(), reader.getFirstLine());
        }

        /** Displays the suspicion and confidence per line of the program starting from the
        first line of the program identified by tacoco **/
        public static void display(double[] c, double[] s, Long firstLine){
            for(int i = 0; i < s.length; i++) {
                System.out.printf("line " + (i+firstLine) + ": suspiciousness: %f, confidence: %f\n", s[i], c[i] );
            }  
        }
}
