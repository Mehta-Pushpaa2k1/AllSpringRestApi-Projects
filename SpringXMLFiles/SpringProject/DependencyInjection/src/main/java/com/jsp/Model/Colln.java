package com.jsp.Model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colln {
    private List<Integer> li;
    private Set<Integer> set;
    private Map<Integer,String> map;
    private List<Address> address;

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public List<Integer> getLi() {
        return li;
    }

    public void setLi(List<Integer> li) {
        this.li = li;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
