package com.example.regestration_fr;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;

import android.widget.*;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Calendar;

public class details extends Fragment {

    Button register,fix;
    EditText first,last,address,dob;
    RadioGroup rg;
    RadioButton male,female;
    String sex, date;
    DatePicker dp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        rg = view.findViewById(R.id.group);
        male = view.findViewById(R.id.radioButton);
        female = view.findViewById(R.id.radioButton2);
        register = view.findViewById(R.id.button3);
        fix = view.findViewById(R.id.button4);
        dob = view.findViewById(R.id.date);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (male.isChecked()){
                    sex = "Male";
                }
                if (female.isChecked()){
                    sex = "Female";
                }
            }
        });

        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialouge();
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), date , Toast.LENGTH_SHORT).show();

            }
        });

        return view;

    }

    private void showDatePickerDialouge() {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Create a new DatePickerDialog
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                requireContext(),
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        // Handle the selected date
                        date = dayOfMonth + " - " + (monthOfYear + 1) + " - " + year;
                        dob.setText(date);
                    }
                },
                year, month, day);

        // Show the DatePickerDialog
        datePickerDialog.show();
    }
}