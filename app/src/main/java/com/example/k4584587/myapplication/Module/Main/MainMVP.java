package com.example.k4584587.myapplication.Module.Main;

/**
 * Created by k4584587 on 2017. 6. 26..
 */

public class MainMVP {

    public interface view {
        void ToastMessage();
    }

    interface  presenter {
        void ButtonClick();
    }

}
