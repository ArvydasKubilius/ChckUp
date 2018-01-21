package demo.tensorflow.org.customvision_sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jokubas on 21/01/18.
 */

public class Pop4 extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow4);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8), (int)(height*0.65));

        EditText text = (EditText) findViewById(R.id.textView4);

        Button browse = (Button) findViewById(R.id.button44);
        browse.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nhs.uk/conditions/vitiligo/")));
            }
        });

        Button button = (Button) findViewById(R.id.button34);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Pop4.this, ClassifierActivity.class));
            }
        });



    }
}
