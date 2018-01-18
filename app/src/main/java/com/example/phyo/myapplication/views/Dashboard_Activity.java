package com.example.phyo.myapplication.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.Toast;

import com.example.phyo.myapplication.R;
import com.example.phyo.myapplication.constants.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Z3uS on 1/18/2018.
 */

public class Dashboard_Activity extends AppCompatActivity implements Dashboard_Transition{

    /**
     * Binding Controls With Butter Knife.
     * Created by: Z3uS
     * Created date:1/18/2018
     */
    @BindView(R.id.cv_learn)CardView cv_learn;
    @BindView(R.id.cv_quiz)CardView cv_quiz;
    @BindView(R.id.cv_code)CardView cv_code;
    @BindView(R.id.cv_cheat_sheet)CardView cv_cheat;
    @BindView(R.id.cv_rate) CardView cv_rate;

    /**
     * Main method For Dashboard
     * @param savedInstanceState
     * Created by:Z3uS
     * Created date:1/18/2018
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
    }
    /**
     * Learn Card is Clicked
     * Created by: Z3uS
     * Created date:1/18/2018
     */
    @OnClick(R.id.cv_learn)
    public  void Submit(){
        Activity_Transition(Constants.LEARN_SCREEN);
    }

    /**
     * For Going to Next Screen
     * @param PAGE_ID
     * Created by:Z3uS
     * Created date:1/18/2018
     */
    @Override
    public void Activity_Transition(int PAGE_ID) {

        switch (PAGE_ID){
            case 1:
                Toast.makeText(this,"Learn is clicked",Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this,"Quiz is clicked",Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(this,"Code is clicked",Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(this,"Cheat is clicked",Toast.LENGTH_LONG).show();
            default:
                Toast.makeText(this,"Rate is clicked",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
