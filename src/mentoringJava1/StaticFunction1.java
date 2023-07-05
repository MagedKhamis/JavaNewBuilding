package mentoringJava1;

public class StaticFunction1 {
    String employeeName ;
    int employeeID;
    static String companyName = "UTS";


    public static void workGoal(){
        System.out.println("We are working hard");
    }


    public static void main(String[] args) {
        StaticFunction1 stf = new StaticFunction1();
        stf.employeeName = "Keya";
        stf.employeeID = 30009;
        System.out.println(stf.employeeName + " "+ stf.employeeID + " "+ companyName);
        workGoal();

        StaticFunction1 stf1 = new StaticFunction1();
        stf1.employeeName = "Maged";
        stf1.employeeID = 30010;
        System.out.println(stf1.employeeName + " "+ stf1.employeeID + " "+ companyName);
        workGoal();


    }

}
