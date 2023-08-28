package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.model.Unicode;
import com.example.jpastudent.repositories.StudentRepository;
import com.example.jpastudent.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    UnicodeRepository unicodeRepository;

    @Value("${loadunicode}")
    private boolean loadunicode;

    @Value("${notloaduni}")
    private boolean notloaduni;


    public void saveUnicode() {
        Set<Character> chars = new HashSet<>();
        for (int i=-1; i<chars.size(); i++) {
            chars.add((char)i);
            Unicode u = new Unicode();
            u.setUnicode(i);
            unicodeRepository.save(u);
        }
    }

    @Override
    public void run(String... args) throws Exception {

        //saveUnicode();
        //System.out.println(loaddata);
        System.out.println(loadunicode);
        System.out.println(notloaduni);


        Student s1 = new Student();
        s1.setBornDate(LocalDate.of(2000,10,11));
        s1.setBornTime(LocalTime.now());
        s1.setName("Erik");
        studentRepository.save(s1);
        s1.setName("Bruce");
        studentRepository.save(s1);
        s1.setName("Finish");
        studentRepository.save(s1);



    }
}
