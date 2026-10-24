package Com.jsp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private int id;
    private String name;
    private String email;
    private String password;
    private List<Integer> li;
    private Set<Integer> set;
    private Map<Integer, Integer> map;

    void m1(){
        System.out.println("M1Method");
    }

    // Getters and Setters
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

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Integer> map) {
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
