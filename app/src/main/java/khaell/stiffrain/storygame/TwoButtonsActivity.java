package khaell.stiffrain.storygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

public class TwoButtonsActivity extends AppCompatActivity {

    private Button mButtonTop;
    private Button mButtonBottom;
    private TextView mTextView;

    private Story mStory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_buttons);

        mButtonTop = findViewById(R.id.buttonsStoryButton1);
        mButtonBottom = findViewById(R.id.buttonsStoryButton2);
        mTextView = findViewById(R.id.buttonsStoryTextView);

        mStory = getIntent().getParcelableExtra("story");

        Map<String, Object> pages = mStory.getPages();
        Map<String, Object> initialPage = (Map<String, Object>) pages.get("page1");

        mTextView.setText(initialPage.get("text").toString());


        // todo: assign button 1 stuff

        // todo: assign button 2 stuff

        // todo: change text

        // todo: create exit button
    }
}
