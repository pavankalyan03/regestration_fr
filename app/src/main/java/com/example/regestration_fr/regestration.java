package com.example.regestration_fr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class regestration extends Fragment {
    EditText first,last,gender,dob,address;
    String firstname,lastname,gen,db,adr;
    Button logout;

    public regestration() {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gen = gen;
        this.db = db;
        this.adr = adr;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_regestration, container, false);


        first = view.findViewById(R.id.editTextText4);
        last = view.findViewById(R.id.editTextText6);
        gender = view.findViewById(R.id.editTextText7);
        dob = view.findViewById(R.id.editTextText8);
        address = view.findViewById(R.id.editTextText9);


        first.setText("Your first name is: " + firstname);
        last.setText("Your Last Name is " + lastname);
        gender.setText("Your Gender is " + gen);
        dob.setText("Your Date of Birth" +db);
        address.setText("Your address is" + adr);

        logout = view.findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) requireActivity()).replacetopfrag(new Homescreen());
                ((MainActivity) requireActivity()).replacebottomfrag(new homebuttons());
            }
        });

        return view;
    }
}