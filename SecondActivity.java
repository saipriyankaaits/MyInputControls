package com.muni.myinputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et_nameobj,et_mobileobj,et_emailobj;
RadioButton m,f;
Spinner spin;
CheckBox j,a,p;
String gender;
String lanuage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   et_nameobj=findViewById(R.id.et_username);
   et_mobileobj=findViewById(R.id.et_mobilenumber);
   et_emailobj=findViewById(R.id.editText3);
   m=findViewById(R.id.rb_male);
   f=findViewById(R.id.rb_female);
   spin=findViewById(R.id.spinner);
   j=findViewById(R.id.checkBox);
   p=findViewById(R.id.checkBox2);
   a=findViewById(R.id.checkBox3);
    }

    public void submitValues(View view) {
        String name=et_nameobj.getText().toString();
        String mobile=et_mobileobj.getText().toString();
        String email=et_emailobj.getText().toString();
        String mybranch=spin.getSelectedItem().toString();
        if (m.isChecked()){
            gender="Male";
        }else if(f.isChecked()){
            gender="Female";
        }
        if (j.isChecked()){
            lanuage="Java";
        }else if (p.isChecked()){
            lanuage=lanuage+"Python";

        }else  if(a.isChecked()){
            lanuage=lanuage+"Android";
        }

        StringBuilder sb=new StringBuilder();
        sb.append(name+"\n"+mobile+"\n"+email+"\n"+mybranch+gender+"\n"+lanuage);
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();



    }
}
