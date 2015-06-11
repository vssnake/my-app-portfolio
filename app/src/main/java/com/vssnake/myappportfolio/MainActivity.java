package com.vssnake.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {


    String strMeatFormat;

    @InjectView(R.id.main_btn_spotify_app) Button btnSpotify;
    @InjectView(R.id.main_btn_scores_app) Button btnScores;
    @InjectView(R.id.main_btn_library_app) Button btnLibrary;
    @InjectView(R.id.main_btn_buildit_app) Button btnBuildIt;
    @InjectView(R.id.main_btn_xyz_app) Button btnXYZReader;
    @InjectView(R.id.main_btn_capstone_app) Button btnCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        strMeatFormat = getResources().getString(R.string.main_activity_button_push_toast);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @OnClick(R.id.main_btn_spotify_app) void onBtnSpotifyClick() {
        showToast(String.format
                (strMeatFormat, getResources().getString(R.string.spotify)));
    }
    @OnClick(R.id.main_btn_scores_app) void onBtnScoresClick() {
        showToast(String.format
                (strMeatFormat, getResources().getString(R.string.scores)));
    }

    @OnClick(R.id.main_btn_library_app) void onBtnLibraryClick() {
        showToast(String.format
                (strMeatFormat, getResources().getString(R.string.library)));
    }

    @OnClick(R.id.main_btn_buildit_app) void onBtnBuilditClick() {
        showToast(String.format
                (strMeatFormat, getResources().getString(R.string.builtit)));
    }

    @OnClick(R.id.main_btn_xyz_app) void onBtnXYZClick() {
        showToast(String.format
                (strMeatFormat, getResources().getString(R.string.xyz)));
    }

    @OnClick(R.id.main_btn_capstone_app) void onBtnCapstoneClick() {
        showToast(String.format
                (strMeatFormat, getResources().getString(R.string.capstone)));
    }

    public void showToast(String text){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
