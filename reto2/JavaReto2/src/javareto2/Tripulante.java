/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareto2;

/**
 *
 * @author GIOVANNI
 */
public class Tripulante {
    private String name, lastname, doc, age, tel, email;

    public Tripulante() {
    }

    public Tripulante(String name, String lastname, String doc, String age, String tel, String email) {
        this.name = name;
        this.lastname = lastname;
        this.doc = doc;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tripulante{name=").append(name);
        sb.append(", lastname=").append(lastname);
        sb.append(", doc=").append(doc);
        sb.append(", age=").append(age);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
    
    
}
