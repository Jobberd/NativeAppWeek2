package com.example.job.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//    Declaration of global variables
    ImageView imageArms;
    ImageView imageEars;
    ImageView imageEyebrows;
    ImageView imageEyes;
    ImageView imageGlasses;
    ImageView imageHat;
    ImageView imageMouth;
    ImageView imageMustache;
    ImageView imageNose;
    ImageView imageShoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Assign id for the different ImageViews
        imageArms = (ImageView) findViewById(R.id.imageArms);
        imageEars = (ImageView)findViewById(R.id.imageEars);
        imageEyebrows = (ImageView)findViewById(R.id.imageEyebrows);
        imageEyes = (ImageView)findViewById(R.id.imageEyes);
        imageGlasses = (ImageView)findViewById(R.id.imageGlasses);
        imageHat = (ImageView)findViewById(R.id.imageHat);
        imageMouth = (ImageView)findViewById(R.id.imageMouth);
        imageMustache = (ImageView)findViewById(R.id.imageMustache);
        imageNose = (ImageView)findViewById(R.id.imageNose);
        imageShoes = (ImageView)findViewById(R.id.imageShoes);

//        Declare checkbox variables and assign id's
        CheckBox checkboxArms = (CheckBox)findViewById(R.id.checkboxArms);
        CheckBox checkboxEars = (CheckBox)findViewById(R.id.checkboxEars);
        CheckBox checkboxEyebrows = (CheckBox)findViewById(R.id.checkboxEyebrows);
        CheckBox checkboxEyes = (CheckBox)findViewById(R.id.checkboxEyes);
        CheckBox checkboxGlasses = (CheckBox)findViewById(R.id.checkboxGlasses);
        CheckBox checkboxHat = (CheckBox)findViewById(R.id.checkboxHat);
        CheckBox checkboxMouth = (CheckBox)findViewById(R.id.checkboxMouth);
        CheckBox checkboxMustache = (CheckBox)findViewById(R.id.checkboxMustache);
        CheckBox checkboxNose = (CheckBox)findViewById(R.id.checkboxNose);
        CheckBox checkboxShoes = (CheckBox)findViewById(R.id.checkboxShoes);

//        Create ClickListeners for all images
        setClickListener(checkboxArms, imageArms);
        setClickListener(checkboxEars, imageEars);
        setClickListener(checkboxEyebrows, imageEyebrows);
        setClickListener(checkboxEyes, imageEyes);
        setClickListener(checkboxGlasses, imageGlasses);
        setClickListener(checkboxHat, imageHat);
        setClickListener(checkboxMouth, imageMouth);
        setClickListener(checkboxMustache, imageMustache);
        setClickListener(checkboxNose, imageNose);
        setClickListener(checkboxShoes, imageShoes);
    }

//    For a given CheckBox, set an onclick action using the onCheckboxClicked method
    public void setClickListener(final CheckBox checkbox, final ImageView imageview) {
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCheckboxClicked(checkbox, imageview);
            }
        });
    }

//    Checks whether a given CheckBox is clecked and then switches the visibility accordignly
    public void onCheckboxClicked(CheckBox checkbox, ImageView imageview) {
        boolean checked = ((CheckBox) checkbox).isChecked();

        if (checked)
            imageview.setVisibility(View.VISIBLE);
        else
            imageview.setVisibility(View.INVISIBLE);
    }
}
