import java.util.ArrayList;

public class Accumulator {
    static ArrayList<String> userName = new ArrayList<>();
    static ArrayList<String> password = new ArrayList<>();
    static int pres1, pres2, tres1, tres2, sec1, sec2, sec3;

    public ArrayList<String> getUserName() {
        return userName;
    }

    public void setUserName(ArrayList<String> userName) {
        this.userName = userName;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }

    public int getPres1() {
        return pres1;
    }

    public void setPres1(int pres1) {
        this.pres1 = pres1;
    }

    public int getPres2() {
        return pres2;
    }

    public void setPres2(int pres2) {
        this.pres2 = pres2;
    }

    public int getTres1() {
        return tres1;
    }

    public void setTres1(int tres1) {
        this.tres1 = tres1;
    }

    public int getTres2() {
        return tres2;
    }

    public void setTres2(int tres2) {
        this.tres2 = tres2;
    }

    public int getSec1() {
        return sec1;
    }

    public void setSec1(int sec1) {
        this.sec1 = sec1;
    }

    public int getSec2() {
        return sec2;
    }

    public void setSec2(int sec2) {
        this.sec2 = sec2;
    }

    public int getSec3() {
        return sec3;
    }

    public void setSec3(int sec3) {
        this.sec3 = sec3;
    }
}
