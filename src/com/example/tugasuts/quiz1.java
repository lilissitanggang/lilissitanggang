package com.example.tugasuts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class profile extends Activity{
	
	TextView t1;
	TextView t2;
	TextView t3;
	TextView t4;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_profile);
        t1 = (TextView)findViewById(R.id.nama);
        t2 = (TextView)findViewById(R.id.usia);
        t3 = (TextView)findViewById(R.id.prodi);
        t4 = (TextView)findViewById(R.id.semester);
}}
