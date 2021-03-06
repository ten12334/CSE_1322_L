package Assignment02;

public class Video {
    private int id, minDaysOnHold;
    private boolean isCheckedIn;
    private String title, length;

    public Video () {
        id = 516271;
        title = "John Wick: Chapter 2";
        isCheckedIn =  false;
        length = "1.25 hours";
    }

    public Video (int uId, String uTitle, boolean uIsCheckedIn, String ulength) {
        id = uId;
        title = uTitle;
        isCheckedIn =  uIsCheckedIn;
        length = ulength;
    }

    public String toString() {
        if (minDaysOnHold != 0) {
            return "Id: " + id + "\nTitle: " + title + "\nChecked in: " + isCheckedIn + "\nLength: " + length + "\nNo. of Days On Hold: " + minDaysOnHold;
        }
        return "Id: " + id + "\nTitle: " + title + "\nChecked in: " + isCheckedIn + "\nLength: " + length + "\n";
    }

    // What is this method even for?
    public void putOnHold(int numDaysOnHold) {
        this.minDaysOnHold = numDaysOnHold;
    }
    public void putOnHold(String uTitle, String uLength, int numDaysOnHold) {
        title = uTitle;
        length = uLength;
        this.minDaysOnHold = numDaysOnHold;
    }

    int getId() { return id; }
    void setId(int input) { id = input; }

    String getTitle() { return title; }
    void setTitle(String input) { title = input; }

    boolean getIsCheckedIn() { return isCheckedIn; }
    void setIsCheckedIn(boolean input) { isCheckedIn = input; }

    String getLength() { return length; }
    void setLength(String input) { length = input; }
}