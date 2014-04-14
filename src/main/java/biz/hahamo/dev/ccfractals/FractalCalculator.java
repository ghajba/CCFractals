/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.hahamo.dev.ccfractals;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Geeez. I spent more hours with this code because I missed a little variable
 * 
 * And currently it the solution only works for 3 and 4 sides
 * does not make sense with other sides, does it? :)
 * 
 * @author GHajba
 */
public class FractalCalculator {

    public BigDecimal calculateFractalPerimeter(int length, int iteration, int sides) {
        BigDecimal bigLength = new BigDecimal(length);

        BigDecimal iterationMultiplier = new BigDecimal(((sides + 1) / 3.0));
        
        System.out.println(iterationMultiplier.pow(iteration));

        BigDecimal perimeter = bigLength.multiply(new BigDecimal(sides))
                .multiply(iterationMultiplier.pow(iteration)).setScale(0, RoundingMode.HALF_UP);

        return perimeter;
    }

}
