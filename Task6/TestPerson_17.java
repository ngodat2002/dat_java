package Task6;

public class TestPerson_17 {
    public static void main(String[] args) {
       //Test person_17
        Person_17 p=new Person_17("Ngo Chi Thanh Dat","Bac Ninh");
        System.out.println(p);
        System.out.println("Name is:"+p.getName());
        System.out.println("Address is:"+p.getAddress());
        System.out.println("");
        //test setter person_17
        p.setAddress("Ha Noi");
        System.out.println(p);
        System.out.println("Name is:"+p.getName());
        System.out.println("Address is:"+p.getAddress());
        System.out.println("====================================================================");
        //Test Student
        Student_17 s= new Student_17("Anh Tam","Dong Xuyen","T2010B",2021,44.44);
        System.out.println(s);
        System.out.println("Program is:"+s.getProgram());
        System.out.println("Year is:"+s.getYear());
        System.out.println("Fee is:"+s.getFee());
        System.out.println("");
        //test setter
        s.setProgram("T2010C");
        s.setYear(2022);
        s.setFee(55.55);
        System.out.println(s);
        System.out.println("Program is:"+s.getProgram());
        System.out.println("Year is:"+s.getYear());
        System.out.println("Fee is:"+s.getFee());
        System.out.println("====================================================================");
        //Test Staff
       Staff_17 st= new Staff_17("Quang Tuan","Tam Giang","Viet Hung",22.22);
        System.out.println(st);
        System.out.println("School is:"+st.getSchool());
        System.out.println("Pay is:"+st.getPay());
        System.out.println("");
        //test setter staff
        st.setSchool("Fpt Aptech");
        st.setPay(33.33);
        System.out.println(st);
        System.out.println("School is:"+st.getSchool());
        System.out.println("Pay is:"+st.getPay());

    }
}
