package com.jsp;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Employee {

    private int id;
    private String name;
    private String email;
    private String password;
    List<Integer> li;
    Set<String> set;
    Map<Integer,String> map;

    public void m1(){
        System.out.println("I am employee class method");

    }

    public Employee (){

    }

    public Employee(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getLi() {
        return li;
    }

    public void setLi(List<Integer> li) {
        this.li = li;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", li=" + li +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}

