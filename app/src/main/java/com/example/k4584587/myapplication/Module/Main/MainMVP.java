package com.example.k4584587.myapplication.Module.Main;

import com.example.k4584587.myapplication.Model.Student;

/**
 * Created by k4584587 on 2017. 6. 26..
 */

public class MainMVP {

    public interface view {
        void ToastMessage(Student student);
    }

    interface  presenter {
        void ButtonClick();
    }

}
