public class Student {
    String fname;
    String lname;
    int grade;
    int mathScore;
    int scienceScore;
    int englishScore;
    int id;

    Student(String f, String l, int g, int m, int s, int e, int i){
        fname = f;
        lname = l;
        grade = g;
        mathScore = m;
        scienceScore = s;
        englishScore = e;
        id = i;
    }

    @Override
    public String toString(){
       return "Name: "+ fname+" "+lname+"\nGrade: "+grade+ " Id: "+ id+"\nMath: " + mathScore + " Science: " + scienceScore+ " English: "+ englishScore+"\nAverage Score: "+averageScore();
    }

    public double averageScore(){
        return ((double)mathScore+(double)scienceScore+(double)englishScore)/3;
    }
}
