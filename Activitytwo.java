package ma.cabsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activitytwo extends AppCompatActivity {
    RadioButton rb1,rb2,rb3;
    Button btn1,btn2,btn3;
    TextView txtview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        txtview1=(TextView)findViewById(R.id.txtview1);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),Activitytwo.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),Activitytwo.class);
                startActivity(intent);
            }
        });
    }


}
