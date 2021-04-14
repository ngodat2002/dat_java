package Task6;

public class Staff_17 extends Person_17{
    private String school;
    private double pay;
    public Staff_17(String name,String address,String school,double pay){
        super(name, address);
        this.school=school;
        this.pay=pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff_17{" +super.toString()+
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
