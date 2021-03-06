/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_view);

        //we collect the transferred data from the previous activity
        String profession_string = getIntent().getStringExtra("PROFESSION");
        String name_string = getIntent().getStringExtra("NAME");
        //put data to new textView
        TextView profession = (TextView) findViewById(R.id.profession_text);
        profession.setText(profession_string);
        TextView name = (TextView) findViewById(R.id.name_text);
        name.setText(name_string);

        // TEMPORARY CODE - OPEN QUIZ
        // Find View that opens Quiz
        TextView quiz = (TextView) findViewById(R.id.tv_quiz);
        if (quiz != null) {
            // Set a click listener on that View
            quiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DetailsActivity.this, QuizActivity.class);
                    startActivity(i);
                }
            });
        }

    }
}
