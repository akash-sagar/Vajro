package com.example.akash.vajro;

import android.app.AlertDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;


/**
 * Created by akash on 27-04-2016.
 */
public class Tab1 extends Fragment implements View.OnClickListener{
    EditText t,b,s,m,l,xl;
    Button button;
    SQLiteDatabase db;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab1,container,false);

        t = (EditText)view.findViewById(R.id.editText);
        b = (EditText)view.findViewById(R.id.editText2);
        s = (EditText)view.findViewById(R.id.editText3);
        m = (EditText)view.findViewById(R.id.editText4);
        l = (EditText)view.findViewById(R.id.editText5);
        xl = (EditText)view.findViewById(R.id.editText6);
        button = (Button)view.findViewById(R.id.button);
        button.setOnClickListener(this);
        db=getActivity().openOrCreateDatabase("Shopping",Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS shopping(tshirt VARCHAR,brand VARCHAR,small VARCHAR,medium VARCHAR,large VARCHAR,extralarge VARCHAR);");
        return  view;
    }


    @Override
    public void onClick(View v) {
        if(t.getText().toString().trim().length()==0||
                b.getText().toString().trim().length()==0||
                s.getText().toString().trim().length()==0||
                m.getText().toString().trim().length()==0||
                l.getText().toString().trim().length()==0||
                xl.getText().toString().trim().length()==0)
        {
            showMessage("Error", "Please enter all values");
            return;
        }
        db.execSQL("INSERT INTO shopping VALUES('"+t.getText()+"','"+b.getText()+
                "','"+s.getText()+ "','"+m.getText()+ "','"+l.getText()+ "','"+xl.getText()+"');");
        showMessage("Success", "Record added");
        clearText();
    }

    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void clearText()
    {
        t.setText("");
        b.setText("");
        s.setText("");
        m.setText("");
        l.setText("");
        xl.setText("");
    }
}
