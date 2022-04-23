package com.company;
import com.company.Solution;
import com.company.AreaCalculator;
import java.util.HashMap;

public class SolutionDriver {
    public static void main(String[] args) {
        Solution sc= new Solution();
        int output= sc.solve(8);
        System.out.println(output);

        AreaCalculator ac = new AreaCalculator(); // Way to instiate / create objects
        Double fg= ac.areaTriangle(18.56d, 67.89d);
        System.out.println(fg);
        System.out.println(AreaCalculator.areaTriangle(18.56d, 67.89d));
    }
}
