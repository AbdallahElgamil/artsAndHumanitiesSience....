package com.example.eljoker.artsandhumanitiessience;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {
    String dep ;   // stands for which department is selected
                  // E stands for english department , F for french department and so on
    int ye;      // stands for which year is selected
    int sem;    //stands for which semester is selected
    String ur ;//virable to store links of materials
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner faculty = (Spinner) findViewById(R.id.faculty);
        final Spinner department = (Spinner)findViewById(R.id.department);
        final Spinner year = (Spinner)findViewById(R.id.year);
        final Spinner semester = (Spinner)findViewById(R.id.semester);
        final Spinner material = (Spinner)findViewById(R.id.material);

        ArrayAdapter facultyAdapter = ArrayAdapter.createFromResource(this,R.array.faculty,
                android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(facultyAdapter);

        faculty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                department.setVisibility(View.GONE);
                year.setVisibility(View.GONE);
                semester.setVisibility(View.GONE);
                material.setVisibility(View.GONE);
                if(faculty.getSelectedItem().toString().equals("Arts and Humanities science Faculty")) {
                    department.setVisibility(View.VISIBLE);

                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.department, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
      department.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              year.setVisibility(View.GONE);
              semester.setVisibility(View.GONE);
              material.setVisibility(View.GONE);


              if(department.getSelectedItem().toString().equals("English Dapartment")){
                  dep="E";
                  year.setVisibility(View.VISIBLE);
                  ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                          R.array.E_dep_year, android.R.layout.simple_spinner_dropdown_item);
                  year.setAdapter(yearAdapter);
              }
              else if(department.getSelectedItem().toString().equals("French Department")){
                  dep="F";
                  year.setVisibility(View.VISIBLE);
                  ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                          R.array.F_dep_year, android.R.layout.simple_spinner_dropdown_item);
                  year.setAdapter(yearAdapter);
              }
              else if(department.getSelectedItem().toString().equals("Geography")){
                  dep="G";
                  year.setVisibility(View.VISIBLE);
                  ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                          R.array.G_dep_year, android.R.layout.simple_spinner_dropdown_item);
                  year.setAdapter(yearAdapter);
              }
              else if(department.getSelectedItem().toString().equals("Physiology Department")){
                  dep="PH";
                  year.setVisibility(View.VISIBLE);
                  ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                          R.array.PH_and_S_dep_year, android.R.layout.simple_spinner_dropdown_item);
                  year.setAdapter(yearAdapter);
              }
              else if(department.getSelectedItem().toString().equals("Sociology Department")){
                  dep="S";
                  year.setVisibility(View.VISIBLE);
                  ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                          R.array.PH_and_S_dep_year, android.R.layout.simple_spinner_dropdown_item);
                  year.setAdapter(yearAdapter);
              }

          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });
        year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                semester.setVisibility(View.GONE);
                material.setVisibility(View.GONE);

                if (dep == "E" & year.getSelectedItem().toString().equals("first year")) {
                    ye=1;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                } else if (dep == "E" & year.getSelectedItem().toString().equals("second year")) {
                    ye=2;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                } else if (dep == "E" & year.getSelectedItem().toString().equals("third year")) {
                    ye=3;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                } else if (dep == "E" & year.getSelectedItem().toString().equals("امتحانات قسم انجليزى")) {
                    material.setVisibility(View.GONE);
                    semester.setVisibility(View.GONE);

                    ur="https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1dvFWHkRZ8jNmAzwfWpc1aAl-tJ0C7-fs&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                    Intent intent = new Intent(MainActivity.this, materials.class);
                    intent.putExtra("url", ur);
                    startActivity(intent);
                }
                else if (dep == "F" & year.getSelectedItem().toString().equals("first year")) {
                    ye=1;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                } else if (dep == "F" & year.getSelectedItem().toString().equals("second year")) {
                    ye=2;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                } else if (dep == "F" & year.getSelectedItem().toString().equals("third year")) {
                    ye=3;
                   material.setVisibility(View.GONE);
                    semester.setVisibility(View.GONE);

                    Intent intent = new Intent(MainActivity.this, materials.class);
                    intent.putExtra("url","https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1DGNEhr3KAhuSzPtAAqZSNTK2v9evqTeY&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                    startActivity(intent);
                } else if (dep == "G" & year.getSelectedItem().toString().equals("first year")){
                    ye=1;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester3, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                }
                else if (dep == "PH" & year.getSelectedItem().toString().equals("first year")) {
                    ye=1;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                }
                else if(dep == "PH" & year.getSelectedItem().toString().equals("second year")){
                    ye=2;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                }
                else if (dep == "S" & year.getSelectedItem().toString().equals("first year")) {
                    ye=1;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                }
                else if(dep == "S" & year.getSelectedItem().toString().equals("second year")){
                    ye=2;
                    semester.setVisibility(View.VISIBLE);
                    ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                    semester.setAdapter(semesterAdapter);
                }
            }





            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        semester.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                material.setVisibility(View.GONE);

                if(dep =="E"&ye==1 & semester.getSelectedItem().toString().equals("first semester")){
                    sem=1;
                material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter =ArrayAdapter.createFromResource(MainActivity.this
                            ,R.array.E_Y1_S1_material,android.R.layout.simple_spinner_dropdown_item);
                material.setAdapter(materialAdapter);


                }
                else if(dep =="E"&ye==1 & semester.getSelectedItem().toString().equals("second semester")) {
                    sem=2;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.E_Y1_S2_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="E"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.E_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="E"&ye==2 & semester.getSelectedItem().toString().equals("second semester")) {
                    sem=2;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.E_Y2_S2_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }

                else if(dep =="E"&ye==3 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.E_Y3_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }

                else if(dep =="F"&ye==1 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.F_Y1_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="F"&ye==1 & semester.getSelectedItem().toString().equals("second semester")) {
                    sem=2;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.F_Y1_S2_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="F"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.E_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="F"&ye==2 & semester.getSelectedItem().toString().equals("second semester")) {
                    sem=2;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.E_Y2_S2_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                /*else if(dep =="F"&ye==3 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.F_Y3_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }*/
                else if(dep =="G"&ye==1 & semester.getSelectedItem().toString().equals("امتحانات ترم اول")) {
                    sem=1;
                    material.setVisibility(View.GONE);
                    Intent intent = new Intent(MainActivity.this, materials.class);
                    intent.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFRHN6WUp5eGF3LU0&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin);
                    startActivity(intent);
                    /*material.setVisibility(View.VISIBLE);

                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.G_Y1_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                */
                }
                else if(dep =="PH"&ye==1 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.PH_Y1_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="PH"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.PH_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="S"&ye==1 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.S_Y1_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="S"&ye==1 & semester.getSelectedItem().toString().equals("second semester")) {
                    sem=2;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.S_Y1_S2_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }
                else if(dep =="S"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                    sem=1;
                    material.setVisibility(View.VISIBLE);
                    ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                            , R.array.PH_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                    material.setAdapter(materialAdapter);
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        material.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (dep == "E" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("ادب انجليزى")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFTDBDY1ByZU9Ndzg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1hn3W0fyGe9k_06jNNQ-Mm1ZIQfS293Kh&service=writely";
                 Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("جغرافيا غرب اوربا")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFZlZSakdERS1sVXc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("phonotics-صوتيات1")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFdzgtQ0RIT01YUU0&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("لغه فرنسيه")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFVk55d0hGUTJFckk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);


                } else if (dep == "E" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("تاريخ غرب اوربا")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFUkFZQktWc0lMZEE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("حضاره-civilization")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFVzJCbmRPUG9vLXM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("لغه عربيه")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFaTRlVmtkakFkRXc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("من الادب الانجليزى")) {
                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0ByJz1l2rodbFdURmdmpiUjlsQUk&service=writely";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("drama(shakespearean drama)")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFOFRTVnl6TlZxUDA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("poetry")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1nYLrDf7K6Oq0PenvY9E1HbwSa_c8wx6I&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("phonotics-صوتيات2")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFR1JwX2pyMFM3Ykk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 2 & sem == 2 & material.getSelectedItem().toString().equals("essay writing")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFR1JwX2pyMFM3Ykk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 2 & sem == 2 & material.getSelectedItem().toString().equals("novel")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFMk9GR3dEeDNNNDQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 2 & sem == 2 & material.getSelectedItem().toString().equals("حضاره-civilization")) {
                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFbGVDQkhwbTA5M28&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "E" & ye == 3 & sem == 1 & material.getSelectedItem().toString().equals("د/شاكر رزق")) {
                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1dvFWHkRZ8jNmAzwfWpc1aAl-tJ0C7-fs&service=writely";
  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("grammer")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFVU90V2VwWWdXemc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0Bx1TXZ-UjRguSHNYNDd5YWt3a0k&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("تعبير كتابى")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmaTWZva1JTY0RuOWc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("صوتيات")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1HiJsGLlWEZcJdZsbTW0pIojGDn2AtLp6&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("امتحانات")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0Bx1TXZ-UjRguS1FnbDFRZ1REUGs&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("حضاره د/دعاء")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaTGdUVzFnRWFPS1U&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("حضاره د/منى")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaT2phbUFIREZYYkU&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("عربى")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaTXlNVVFoeVFIbUU&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("قراءه د/ابراهيم")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmaOHJuOGxVWndTZ0k&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("محادثه د/ عبده")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaNG1NdTNqdEdoNHc&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("نصوص د/ منى")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0Bx1TXZ-UjRguNE0yRl81R1dwUTQ&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("grammer")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmaaW5scTFuT2JUUE0&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات1")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0Bx1TXZ-UjRguQ0lla01YWlZkS2c&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات2")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1-c-aKiFwclBdA2Xjoonql5Nb1zqQ2I4-&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات3")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1w3BDN29exg0v6t2ZVZ7QoRRon_nvHzT1&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "F" & ye == 2 & sem == 2 & material.getSelectedItem().toString().equals("امتحانات")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F14VKt2K9_b_0ZKmZaRxzi7wB3et7-Iwtj&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "PH" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("اخلاق - د/محروس")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0Bx1TXZ-UjRgudXhJTUFHbXNteUU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "PH" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("تفكير علمى-د/منتصر")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0Bx1TXZ-UjRguR3NFc20yczNRSms&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "PH" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("رياضه")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0Bx1TXZ-UjRguNmcydkVqYmJ3RG8&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "PH" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("سياسه د/منتصر")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0Bx1TXZ-UjRguaEpZekhHS3VXN2c&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "PH" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("علم الكلام د/منتصر")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0Bx1TXZ-UjRguOEg5cUsyYzFhaGM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                 Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("الاسس النظريه")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmadEtrenFDZkhjWjQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0Bx1TXZ-UjRgudS1Rb3RpQU43LVE&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("تاريخ الفكر الاجتماعى")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmaZVQ4X18xQ1phbkU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("جغرافيا عامه")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaX0lYQXFUXzBQVTA&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("فلسفه عامه")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmabTZiSW5ZNVF3RHc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("لغه عربيه")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaZDhpTHBIcXlReU0&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("مدخل فى علم الاجتماع")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1r7q3pqn16jwN7u8RoMxwPkAJ5WCFbhXv&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("الاحصاء")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaZDhpTHBIcXlReU0&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("انثروبولوجيا")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6VmaRk92VVBNbE1kc28&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("بناء المجتمع ونظمه")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmaWmtaRk9naVdSWnc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("علم السكان")) {

                    ur = "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0BzYYW8dU6Vmaem9TdGYwVDBWUnc&service=writely";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("علم النفس")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmaZzlLeGhzWjNyX0k&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 1 & sem == 2 & material.getSelectedItem().toString().equals("لغه انجليزيه")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0BzYYW8dU6VmaeWNITF96VXd6b2M&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                } else if (dep == "S" & ye == 2 & sem == 1 & material.getSelectedItem().toString().equals("امتحانات ترم اول")) {

                    ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1nwZxToYr7QGDcatbX0aqrKrh7P2HgWrW&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                  Intent intent = new Intent(MainActivity.this, materials.class);
                intent.putExtra("url", ur);
                startActivity(intent);

                }
                  
            }





            

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
