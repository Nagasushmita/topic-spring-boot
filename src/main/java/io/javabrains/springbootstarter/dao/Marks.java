package io.javabrains.springbootstarter.dao;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marks_id")
    private int marks_id;

    private Character grade;

    private int  tot_marks;

    @NotBlank
    private String certificateno;

    public Marks( Character grade, int tot_marks, String certificateno) {
        this.grade = grade;
        this.tot_marks = tot_marks;
        this.certificateno = certificateno;
    }

    public int getMarks_id() {
        return marks_id;
    }

    public void setMarks_id(int marks_id) {
        this.marks_id = marks_id;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public int getTot_marks() {
        return tot_marks;
    }

    public void setTot_marks(int tot_marks) {
        this.tot_marks = tot_marks;
    }

    public String getCertificateno() {
        return certificateno;
    }

    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    public Marks() {
    }
}
