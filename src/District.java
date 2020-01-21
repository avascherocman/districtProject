import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
public class District {
    Student[] students = new Student[1000];
    District(){

    }



    District(int numStudents){
        //create arrays of first and last names
        String strLine = "";
        String[] fNames = new String[4276];
        String[] mNames = new String[1220];
        String[] lNames = new String[65537];
        try {
            int i = 0;
            BufferedReader br = new BufferedReader(new FileReader("src/FemaleNamesDictionary.txt"));
            while (strLine != null) {
                strLine = br.readLine();
                fNames[i] = strLine;
                i++;
                if (strLine == null)
                    break;
            }
            br.close();
        } catch (FileNotFoundException f) {
            System.err.println("File not found");
        } catch (IOException f) {
            System.err.println("Unable to read the file.");
        }
        strLine = "";
        try {
            int j = 0;
            BufferedReader br = new BufferedReader(new FileReader("src/MaleNamesDictionary.txt"));
            while (strLine != null) {
                strLine = br.readLine();
                mNames[j] = strLine;
                j++;
                if (strLine == null)
                    break;

            }
            br.close();
        } catch (FileNotFoundException f) {
            System.err.println("File not found");
        } catch (IOException f) {
            System.err.println("Unable to read the file.");
        }
        strLine = "";
        try {
            int k = 0;
            BufferedReader br = new BufferedReader(new FileReader("src/LastNames.txt"));
            while (strLine != null) {
                strLine = br.readLine();
                lNames[k] = strLine;
                k++;
                if (strLine == null) {
                    break;
                }
            }
            br.close();
        } catch (FileNotFoundException f) {
            System.err.println("File not found");
        } catch (IOException f) {
            System.err.println("Unable to read the file.");
        }
        //make new random object to use
        Random r= new Random();

        int grade;
        for (int i=0; i<numStudents;i++){
            //create random gender to choose first name
            int gender = r.nextInt(2)+1;
            //create first name for student
            String fname;
            if (gender ==1){
                fname = fNames[r.nextInt(4275)+1];
            } else {
                fname = mNames[r.nextInt(1219)+1];
            }
            //create random last name for student
            String lname = lNames[r.nextInt(65536)+1];
            //create random scores for each subject for each student
            int mathScore = r.nextInt(100)+1;
            int scienceScore = r.nextInt(100)+1;
            int englishScore = r.nextInt(100)+1;
            int studentType = (r.nextInt(3)+1);
            if (studentType ==1){
                grade = r.nextInt(6)+1;
                students[i]=new ESstudent(fname, lname, grade, mathScore,scienceScore, englishScore, i);
            } else if (studentType==2){
                grade = r.nextInt(8)+7;
                students[i] = new MSstudent(fname, lname, grade, mathScore,scienceScore, englishScore, i);
            } else {
                grade = r.nextInt(12)+9;
                students[i]=new HSstudent(fname, lname, grade, mathScore,scienceScore, englishScore, i);

            }
        }
    }

}
