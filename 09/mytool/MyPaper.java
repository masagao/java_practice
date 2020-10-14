package mytool;
import myreport.*;

public class MyPaper {
  public String getName() {
    ExamReport report = new ExamReport();
    return report.toString();
  }
}
