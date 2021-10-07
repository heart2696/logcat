package com.example.logcat;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.logcat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.i("최인영", "onCreate: 실행됩니다");

        binding.one.setOnClickListener(v -> printLog("버튼1 클릭 했습니다."));
        binding.two.setOnClickListener(v -> printLog("버튼2 클릭 했습니다."));
        binding.three.setOnClickListener(v -> printLog("버튼3 클릭 했습니다."));
        binding.four.setOnClickListener(v -> printLog("버튼4 클릭 했습니다."));

        binding.middle.setOnClickListener(v-> {
            Log.i("최인영", "텍스트뷰 내용: " + binding.textview.getText());
            Log.i("최인영", "에디트 텍스트 애용: " + binding.edittext.getText());
        });

    }
    private void printLog(String message){
        Log.i("최인영",message);
    }



}


