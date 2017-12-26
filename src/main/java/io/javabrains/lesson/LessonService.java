package io.javabrains.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String courseId) {
        List<Lesson> lesson = new ArrayList<>();
        lessonRepository.findByCourseId(courseId)
                .forEach(lesson::add);
        return lesson;
    }

    public Lesson getLesson(String id){
        return lessonRepository.findOne(id);
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void updateLesson(Lesson newLesson) {
        lessonRepository.save(newLesson);
    }

    public void deleteLesson(String id) {
        lessonRepository.delete(id);
    }
}
