package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, ArrayList<Person> persons) {
        super(context, 0, persons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);
        }

        TextView name = convertView.findViewById(R.id.textViewName);
        TextView id = convertView.findViewById(R.id.textViewId);
        TextView phoneNumber = convertView.findViewById(R.id.textViewPhoneNumber);

        name.setText(person.getName());
        id.setText("ID: " + String.valueOf(person.getId()));
        phoneNumber.setText("Phone: " + person.getPhoneNumber());

        return convertView;
    }
}

