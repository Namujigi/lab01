package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button toggleButton;
    private ImageView imageView;
    private boolean isImageVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View 초기화
        toggleButton = findViewById(R.id.toggleButton);
        imageView = findViewById(R.id.imageView);

        // 초기 상태: 이미지 숨김
        imageView.setVisibility(View.GONE);

        // 버튼 클릭 리스너
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isImageVisible) {
                    // 이미지 숨기기
                    imageView.setVisibility(View.GONE);
                    toggleButton.setText("이미지 보기");
                    isImageVisible = false;
                } else {
                    // 이미지 보이기
                    imageView.setVisibility(View.VISIBLE);
                    toggleButton.setText("이미지 숨기기");
                    isImageVisible = true;
                }
            }
        });
    }
}