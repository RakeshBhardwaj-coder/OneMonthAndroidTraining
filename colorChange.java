import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
Button button,buttonchange;
RelativeLayout relativeLayout;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
button=findViewById(R.id.btnchange);
buttonchange=findViewById(R.id.btnchoice);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
relativeLayout.setBackgroundResource(R.color.sushant);
}
});
buttonchange.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
relativeLayout.setBackgroundResource(R.color.kakhi);
}
});



}
}
