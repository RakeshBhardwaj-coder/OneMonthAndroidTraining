mport androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

EditText editText;
Button button;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

editText=(EditText)findViewById(R.id.editTextTextPersonName2);
button=(Button) findViewById(R.id.button2);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String weburl = editText.getText().toString();
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(weburl));
startActivity(intent);
}
});



}
}
