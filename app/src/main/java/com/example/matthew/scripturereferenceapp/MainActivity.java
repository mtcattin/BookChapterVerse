package com.example.matthew.scripturereferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // what does this do?
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Called when the user clicks submit
    public void sendMessage(View v) {
        // Create an Intent, binds the actions together
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Chanage this to store all values to an ArrayList
        EditText editText = (EditText) findViewById(R.id.editBook);
        EditText editText1 = (EditText) findViewById(R.id.editChapter);
        EditText editText2 = (EditText) findViewById(R.id.editVerse);

        // create an arraylist
        ArrayList<String> messageArrayList = new ArrayList<String>();
        //Using add() to add the String to the ArrayList object
        messageArrayList.add("Your favorite scripture is ");
        messageArrayList.add(editText.getText().toString() + " ");
        messageArrayList.add(editText1.getText().toString() + ": ");
        messageArrayList.add(editText2.getText().toString() + " ");

       /* EditText et_chapter = (EditText) findViewById(R.id.editChapter);
        String chapter = et_chapter.getText().toString();
        EditText et_verse = (EditText) findViewById(R.id.editVerse);
        String verse = et_verse.getText().toString();
        intent.putExtra("book",book);
        intent.putExtra("chapter",chapter);
        intent.putExtra("verse",verse);*/

        // what is the purpose of the EXTRA_MESSAGE?
        // intent.put<CLASSTYPE>
        intent.putStringArrayListExtra(EXTRA_MESSAGE,messageArrayList);

        startActivity(intent);
    }
}