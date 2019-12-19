package io.javabrains.springbootstarter.dto;

import javax.validation.constraints.NotBlank;

public class TopicDto {
    private String name;
    private String description;
    private int branch;
    private Character grade;
    private int  tot_marks;
    private String certificateno;

    public TopicDto(String name, String description, int branch, Character grade, int tot_marks, String certificateno) {
        this.name = name;
        this.description = description;
        this.branch = branch;
        this.grade = grade;
        this.tot_marks = tot_marks;
        this.certificateno = certificateno;
    }

    public TopicDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
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
}
