public class DistrictTester {
    public static void main(String args[]){
        District d = new District(1000);
        for (int i =0; i<1000;i++){
            System.out.println(d.students[i].toString());
        }
    }
}
