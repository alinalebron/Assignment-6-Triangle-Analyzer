/* File: Triangle.java
 */

/*I affirm that this program is entirely 
 * my own work and none of it is the work of any other person.
 * @author Alina Lebron - Section 1
 */
/**
 * Create a class that analyzes the type of triangle & finds the area
 */

public class Triangle 
{
   
    //create instance variables

    private int sideA ; // the length of side A
    private int sideB ; // the length of side B
    private int sideC ; // the length of side C

    /**
     * Create a triangle object
     *
     * @param sideA the length of side A
     * @param sideB the length of side B
     * @param sideC the length of side C
     */
    
    public Triangle(int sideA, int sideB, int sideC) 
    
    { 
    
    //initialize instance variables

        this.sideA = sideA ;
        this.sideB = sideB ;
        this.sideC = sideC ;
    }

    /**
     * Create an assessor method to return the sides
     * @return the length of sides A, B, and C
     */
   
    public String getSides() 
    
    {
        return "The length of side A is: " + sideA
                + "\tThe length of side B is: " + sideB
                + "\tThe length of side C is: " + sideC ;
    }

    /**
     * Create a boolean method that returns true or false if the 3 side lengths
     * form a triangle
     *
     * @return true if it is a triangle
     * @return false if it is not a triangle
     */
    
    public boolean isTriangle() 
    
    {
        /* if 2 sides are greater than or equal to the sum of the other 2
         * 2 sides, then there is no triangle
         */

        if ((sideA >= sideB + sideC)
                || (sideB >= sideA + sideC)
                || (sideC >= sideA + sideB)) 
        
        {
            return false ;
        } 
        
        else 
        
        {
            return true ;
        }
    }

    /**
     * Create string method that returns the type of triangle while keeping in
     * mind an isosceles triangle can be acute, right, or obtuse
     *
     * @return no triangle, equilateral, right,obtuse, acute or isosceles (right
     * isosceles, obtuse isosceles, or acute isosceles)
     */
    
    public String triangleType() 
    
    {
        /**
         * use the existing boolean method to return if a triangle exists
         *
         * @return a string saying it is not a triangle
         */

        if (!isTriangle()) 
        
        {
            return "This is NOT a triangle" ;
        } 
        
        /** if all sides are equal, it is an equilateral
         * @return a string saying it is equilateral
         */
       
        else if (sideA == sideB && sideB == sideC)
        
        {
            return "This is an equilateral triangle" ;
        } 
        
        /** Otherwise, if the sum of the square of 2 sides are equal to the
         * square of the other side, then it is a right triangle
         * @return a string saying it is a right triangle
         */
        
        else if (((sideA * sideA) + (sideB * sideB) == (sideC * sideC))
                || ((sideA * sideA) + (sideC * sideC) == (sideB * sideB))
                || ((sideC * sideC) + (sideB * sideB) == (sideA * sideA))) 
        
        {
            return "This is a right triangle" ;
        } 
        
        /** otherwise, if the sum of the square of 2 sides is less than the
         * square of the other side, then it is an obtuse triangle
         * @return a string saying it is an obtuse triangle
         */
        
        else if (((sideA * sideA) + (sideB * sideB) < (sideC * sideC))
                || ((sideA * sideA) + (sideC * sideC) < (sideB * sideB))
                || ((sideC * sideC) + (sideB * sideB) < (sideA * sideA))) 
        
        {
            return "This is an obtuse triangle" ;
        } 
        
        /* otherwise, if either 2 sides are equal to each other, then it is
         * an isosceles triangle
         */ 
        else if ((sideA == sideB) || (sideA == sideC) || (sideB == sideC)) 
        
        {

            /** copy each former statement to classify whether it is isosceles
             * right, isosceles acute, or isosceles obtuse
             * @return a string saying it is a right isosceles triangle
             * @return a string saying it is an obtuse isosceles triangle
             * @return a string saying it is an acute isosceles triangle
             */
            
            if (((sideA * sideA) + (sideB * sideB) == (sideC * sideC))
                    || ((sideA * sideA) + (sideB * sideB) == (sideC * sideC))
                    || ((sideA * sideA) + (sideB * sideB) == (sideC * sideC))) 
            
            {
                return "This is a right isoceles triangle" ;
            } 
            
            else if (((sideA * sideA) + (sideB * sideB) < (sideC * sideC))
                    || ((sideA * sideA) + (sideB * sideB) < (sideC * sideC))
                    || ((sideA * sideA) + (sideB * sideB) < (sideC * sideC))) 
            
            {
                return "This is an obtuse isoceles triangle" ;
            } 
            
            else 
            
            {
                return "This is an acute isoceles triangle" ;
            }
        }
        
        /** End with the same statement that classifies whether it is not a
         * triangle
         * @return a string saying it is not a triangle
         * @return a string saying it is an acute triangle
         */
        
        else if ((sideA >= sideB + sideC) || (sideB >= sideA + sideC)
                || (sideC >= sideA + sideC)) 
        
        {
            return "This is NOT a triangle" ;
        }
        
        else 
        
        {
            return "This is an acute triangle" ;
        }

    }

    /**Use heron's formula to compute the area of the triangle 
     * Heron's formula = area = √ ( s (s-a) (s-b) (s-c))
     * where s = the perimeter of the triangle
     * @return area the area of the triangle
     */
   
    public double getArea() 
    
    {
        double perimeter = ((sideA + sideB + sideC) / 2.0) ;

        double area = (Math.sqrt(perimeter * ((perimeter - sideA)
                * (perimeter - sideB) * (perimeter - sideC)))) ;

        return area ;
    }

}
