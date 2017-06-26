package com.example.k4584587.myapplication.Module.Main;

import com.example.k4584587.myapplication.Model.Student;

/**
 * Created by k4584587 on 2017. 6. 26..
 */

public class Presenter implements MainMVP.presenter {

    private final MainMVP.view view;

    public Presenter(MainMVP.view view) {
        this.view = view;
    }

    @Override
    public void ButtonClick() {
        Student student = new Student("Micle", 20);
        view.ToastMessage(student);
    }
}
