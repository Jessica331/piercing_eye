package com.wangyp.piercing_eye.domain;

public class Person {

    private Integer pid;
    private String pname;
    private String ppsd;

    public Person(Integer pid, String pname, String ppsd) {
        this.pid = pid;
        this.pname = pname;
        this.ppsd = ppsd;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", ppsd='" + ppsd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (pid != null ? !pid.equals(person.pid) : person.pid != null) return false;
        if (pname != null ? !pname.equals(person.pname) : person.pname != null) return false;
        return ppsd != null ? ppsd.equals(person.ppsd) : person.ppsd == null;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (ppsd != null ? ppsd.hashCode() : 0);
        return result;
    }

    public Integer getPid() {

        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPpsd() {
        return ppsd;
    }

    public void setPpsd(String ppsd) {
        this.ppsd = ppsd;
    }
}
