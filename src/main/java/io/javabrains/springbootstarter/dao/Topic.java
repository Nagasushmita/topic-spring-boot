package io.javabrains.springbootstarter.dao;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private int branch;

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @OneToOne
    @JoinColumn(name = "marks_id")
    private Marks marks;

    public Topic(String name, String description, int branch) {
        this.name = name;
        this.description = description;
        this.branch = branch;
    }

    public Topic(int id, @NotBlank String name, @NotBlank String description, int branch, Marks marks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.branch = branch;
        this.marks = marks;
    }

    public Topic() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setBranch(Integer branch){ this.branch = branch;}
    public Integer getBranch(){ return branch;}

}
