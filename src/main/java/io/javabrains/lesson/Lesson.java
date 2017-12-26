package io.javabrains.lesson;

import io.javabrains.course.Course;
import io.javabrains.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lesson {

    @Id
    private String id;
    private String name;
    private String decsription;
    @ManyToOne
    private Course course;

    public Lesson(){

    }

    public Lesson(String id, String name, String description, String topicId, String courseId) {
        this.id = id;
        this.name = name;
        this.decsription = description;
        this.course = new Course(courseId, "", "", topicId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
