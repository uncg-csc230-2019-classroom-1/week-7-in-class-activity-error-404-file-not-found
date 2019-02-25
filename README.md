Week 7 In-Class Activity

Problem Description: A complex number is a number of the form , where a and b are real numbers and i is . The numbers a and b are known as the real part and imaginary part of the complex number, respectively. You can perform addition, subtraction, multiplication, and division for complex numbers using the following formula:

You can also obtain the absolute value for a complex number using the following formula:

(A complex number can be interpreted as a point on a plane by identifying the values as the coordinates of the point. The absolute value of the complex number corresponds to the distance of the point to the origin, as shown in Figure 13.12b.)

Design a class named Complex for representing complex numbers and the methods add, subtract, multiply, divide, abs for performing complex-number operations, and override toString method for returning a string representation for a complex number. The toString method returns a + bi as a string. If b is 0, it simply returns a.

Provide three constructors Complex(a, b), Complex(a), and Complex(). Complex() creates a Complex object for number 0 and Complex(a) creates a Complex object with 0 for b. Also provide the getRealPart() and getImaginaryPart() methods for returning the real and imaginary part of the complex number, respectively.

Your Complex class should also implement the Cloneable interface. Write a test program that prompts the user to enter two complex numbers and display the result of their addition, subtraction, multiplication, and division. Here is a sample run:
Enter the first complex number: 3.5 5.5 Enter the second complex number: -3.5 1 (3.5 + 5.5i) + (-3.5 + 1.0i) = 0.0 + 6.5i (3.5 + 5.5i) - (-3.5 + 1.0i) = 7.0 + 4.5i (3.5 + 5.5i) * (-3.5 + 1.0i) = -17.75 + -15.75i (3.5 + 5.5i) / (-3.5 + 1.0i) = -0.5094 + -1.7i |3.5 + 5.5i| = 6.519202405202649

Design: Draw the UML class diagram for the Complex class here.
