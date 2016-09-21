
import java.util.ArrayList;

/**
 * Created by wenshuo on 2016/9/21.
 * (@link ReportCard} represents a student's report card.
 * It contains the student's name and his or her grades for each of classes.
 */
public class ReportCard {

    private String mName;
    private ArrayList<String[]> mGrade = new ArrayList<>();
    private int mNumberOfClass;


    /**
     * Create a  new ReportCard object.
     *
     * @param name    is the student's name
     * @param classes are the classes he or she is in
     */
    public ReportCard(String name, String... classes) {
        for (int i = 0; i < classes.length; i++) {
            mGrade.add(new String[]{classes[i], null});
        }
        mName = name;
        mNumberOfClass = classes.length;

    }

    /**
     * Get the student's name.
     */
    public String getName() {
        return mName;
    }

    /**
     * Set the student's name.
     */
    public void setName(String name) {
        mName = name;
    }

    /**
     * Report the grade for one particular class.
     *
     * @param myClass is the class we wanna get the grade for
     * @return the grade for that class
     */
    public String getGrade(String myClass) {

        for (int i = 0; i < mNumberOfClass; i++) {
            if (myClass.equals(mGrade.get(i)[0]))
                return mGrade.get(i)[1];
        }
        return "Class not found";
    }

    /**
     * Set the grade for one particular class.
     *
     * @param myClass is the class we wanna set the grade for
     * @param myGrade is the grade for that class
     */
    public void setGrade(String myClass, String myGrade) {
        for (int i = 0; i < mNumberOfClass; i++) {
            if (myClass.equals(mGrade.get(i)[0])) {
                mGrade.get(i)[1] = myGrade;
                return;
            }
        }
    }

    /**
     * Report the grades for all the classes.
     *
     * @return a String contains all the grades for that student
     */
    public String report() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < mNumberOfClass; i++) {
            output.append(mGrade.get(i)[0] + ": " + mGrade.get(i)[1] + "\n");
        }
        return output.toString();
    }

    @Override
    public String toString() {
        //The content of the class is shown in report() method.
        return "ReportCard{" +
                "NumberOfClass=" + mNumberOfClass +
                ", Name='" + mName + '\'' +
                '}';
    }
}
