package com.example.k4584587.myapplication.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.k4584587.myapplication.Model.Student;
import com.example.k4584587.myapplication.Module.Main.MainMVP;
import com.example.k4584587.myapplication.Module.Main.Presenter;
import com.example.k4584587.myapplication.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainMVP.view {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new Presenter(this);
    }

    @OnClick(R.id.button)
    void ButtonClick() {
        presenter.ButtonClick();
    }


    @Override
    public void ToastMessage(Student student) {
        Toast.makeText(this, "My Profile - " + student.getName() + " " + student.getAge(), Toast.LENGTH_SHORT).show();
    }
}
