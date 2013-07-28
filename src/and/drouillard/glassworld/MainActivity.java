package and.drouillard.glassworld;

import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Window;

public class MainActivity extends Activity {
	protected GameContentView gcv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		DisplayMetrics metrics = getResources().getDisplayMetrics();
        gcv = new GameContentView(this, metrics.widthPixels, metrics.heightPixels);
        
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		return false;
	
	}
	
	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/

}
