package and.drouillard.glassworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartActivity extends Activity implements OnClickListener {
	private Button startBtn;
	private Button resumeBtn;
	private Button helpBtn;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);     
        setContentView(R.layout.activity_start);
        startBtn =(Button)findViewById(R.id.StartButton);
        resumeBtn =(Button)findViewById(R.id.ResumeButton);
        helpBtn =(Button)findViewById(R.id.HelpButton);
        
        startBtn.setOnClickListener(this);
        resumeBtn.setEnabled(false);
        helpBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		if (arg0 == startBtn) {
			startActivity(new Intent(StartActivity.this, MainActivity.class));
		} else if (arg0 == resumeBtn) {
			
		} else if (arg0 == helpBtn) {
			
		}
	}
}
