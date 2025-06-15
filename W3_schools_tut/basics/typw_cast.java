package basics;
/*
 * there the casting are automatic for few types and manual for other types
 * converting [int to double] is an automatic one
 * lke these are automatic [byte -> short -> char -> int -> long -> float -> double]
 * but converting [double to int] is a manual one .
 * htese are manual [double -> float -> long -> int -> char -> short -> byte]
 * 
 * and converting float to int always returns the exact value before the point 11.999 = 11
 */
public class typw_cast {
    public static void main(String[] args) {
        int a_int, m_int;
        double a_double, m_double;

        a_int = 10;
        m_double = 11.99999;

        //here i am going to convert the a1 int to a2 double

        a_double = a_int ; //which is automatic

        //here going to convert the m2 double into m1 int

        m_int = (int) m_double ; // here we suppose to mention the datatype inside the parathese 

        System.out.println("int to double(auto): "+a_double+"\ndouble to  int(manual): "+m_int);
    }
    
}
