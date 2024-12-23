package TestDrivenDevelopment;

public class Shapes {

    /* Test Driven Method is a method where initially testcase failed which means we does write the actual logic,
     which is shown below . After the test cases fails we will write the actual logic of the program
      */



//    public double ComputeAreaOfSquare(double length)
//    {
//        return 0;
//    }

//    public double ComputeAreaOfCircle(double length)
//    {
//        return 0;
//    }

//    When we run the testcases it fails,then we need the provide the coorect ouput;


        public double ComputeAreaOfSquare(double length)
    {
        return length*length;
    }

    public double ComputeAreaOfCircle(double length)
    {
        return 3.14*length*length;
    }
}
