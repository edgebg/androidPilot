package org.edgebg.androidpilot.activity;

import org.edgebg.androidpilot.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Aktivnost za opis programa.
 * @author Ivica
 *
 */
public class AboutActivity extends Activity{
	
	Button okButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		okButton = (Button) findViewById(R.id.about_ok_button);
		
		okButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	

}
