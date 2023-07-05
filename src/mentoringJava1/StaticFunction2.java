package mentoringJava1;

public class StaticFunction2 {
//    public static void main(String[] args) {
//        StaticFunction1 stf = new StaticFunction1();
//        StaticFunction1.workGoal();
//        System.out.println(StaticFunction1.companyName);
//    }
    public void splitandReplace(){
        String myEmail = "maged#gmail#com";
        String [] newEmail = myEmail.split("#",2);
        System.out.println(newEmail[0]);
        System.out.println(newEmail[1]);
        String xEmail = newEmail[0].concat("@").concat(newEmail[1]);
        System.out.println(xEmail);
        String finalEmail = xEmail.replace("#", ".");
        System.out.println(finalEmail);
       // String finalEmail =

    }
    public void revString(){
        int i;
        //String rev = "";
        String email="Civic"; // mom, dad, civic , level , kayak , lol , madam , wow , uhu

        for(i=email.length()-1; i>=0; i--){
            char rev = email.charAt(i);
            System.out.print(rev);
        }
    }

    public static void main(String[] args) {
        StaticFunction2 obj = new StaticFunction2();
        //obj.splitandReplace();
        obj.revString();

    }

}
