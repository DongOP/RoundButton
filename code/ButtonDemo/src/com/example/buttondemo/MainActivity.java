package com.example.buttondemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity implements OnClickListener {

	
	RoundButton btn_5, btn_6;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
 
        
        
        btn_6=(RoundButton) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);
        
        
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_6:
			btn_6.setSelected(!btn_6.isSelected());
			break;
		 
		default:
			break;
		}
	}


 
}
