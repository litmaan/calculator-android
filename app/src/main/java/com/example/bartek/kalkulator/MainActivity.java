package com.example.bartek.kalkulator;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;

import android.os.Bundle;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
import static android.view.View.generateViewId;

public class MainActivity extends Activity {

    public EditText display;
    TextView input;
    TextView result;

    Integer c, d, e, r, temp1;
    Integer j = 0;
    String a = "0", temp;
    int[] array = new int[10];
    ArrayList<String> arrayList = new ArrayList<>();

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, addBtn, minusBtn, multiplyBtn, divideBtn, equalsBtn, clearBtn;
    double finalResult = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
        result = (EditText) findViewById(R.id.result);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button0);
        addBtn = (Button) findViewById(R.id.addBtn);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        divideBtn = (Button) findViewById(R.id.divideBtn);
        equalsBtn = (Button) findViewById(R.id.equalsBtn);
        clearBtn = (Button) findViewById(R.id.clearBtn);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //1
                a = input.getText().toString();
                a = a + "1";
                input.setText(a);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //2
                a = input.getText().toString();
                a = a + "2";
                input.setText(a);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //3
                a = input.getText().toString();
                a = a + "3";
                input.setText(a);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //4
                a = input.getText().toString();
                a = a + "4";
                input.setText(a);

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //5
                a = input.getText().toString();
                a = a + "5";
                input.setText(a);

            }
        });


        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //6
                a = input.getText().toString();
                a = a + "6";
                input.setText(a);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //7
                a = input.getText().toString();
                a = a + "7";
                input.setText(a);
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //8
                a = input.getText().toString();
                a = a + "8";
                input.setText(a);

            }
        });


        b9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //9
                a = input.getText().toString();
                a = a + "9";
                input.setText(a);
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {          //0
                a = input.getText().toString();
                a = a + "0";
                input.setText(a);
            }
        });


        addBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // adding

//                temp = a;
//                temp1 = 1;
//                a = "";
//                e = Integer.parseInt(temp); //wrzucanie podanej liczby do tablicy
//                arrayList.add(temp);
//                Toast.makeText(MainActivity.this, "1st: " + array[j], 10000).show();
//                j = j + 1;
//                input.setText(input.getText().toString() + "+");
//                input.setText("+");
                //input.setText("");


                temp = input.getText().toString();
                ArrayList<String> arrayTEMP = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                //System.out.println(arrayTEMP);

                if((arrayTEMP.get(arrayTEMP.size() - 1).equals("*") || arrayTEMP.get(arrayTEMP.size() - 1).equals("-") || arrayTEMP.get(arrayTEMP.size() - 1).equals("/"))) {
                    arrayTEMP.set(arrayTEMP.size() - 1, "+");
                    //System.out.println(arrayTEMP);

                    temp = "";
                    for(int i=0; i<arrayTEMP.size(); i++) {
                        temp += arrayTEMP.get(i) + " ";
                    }
                    //System.out.println(temp);
                }

                if(arrayTEMP.get(arrayTEMP.size() - 1).equals("+")) {
                    input.setText(temp);

                } else {
                    input.setText(temp + " + ");
                }

            }
        });


        minusBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // subtraction
//                temp = a;
//                temp1 = 2;
//                a = "";
//                input.setText("-");
//                //input.setText("");

                temp = input.getText().toString();
                ArrayList<String> arrayTEMP = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                //System.out.println(arrayTEMP);

                if((arrayTEMP.get(arrayTEMP.size() - 1).equals("+") || arrayTEMP.get(arrayTEMP.size() - 1).equals("*") || arrayTEMP.get(arrayTEMP.size() - 1).equals("/"))) {
                    arrayTEMP.set(arrayTEMP.size() - 1, "-");
                    //System.out.println(arrayTEMP);
                    temp = "";
                    for(int i=0; i<arrayTEMP.size(); i++) {
                        temp += arrayTEMP.get(i) + " ";
                    }
                }

                if(arrayTEMP.get(arrayTEMP.size() - 1).equals("-")) {
                    input.setText(temp);

                } else {
                    input.setText(temp + " - ");
                }
            }
        });


        multiplyBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // multiplying
//                temp = a;
//                temp1 = 3;
//                a = "";
//                input.setText("*");
//                //input.setText("");

                temp = input.getText().toString();
                ArrayList<String> arrayTEMP = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                //System.out.println(arrayTEMP);

                if((arrayTEMP.get(arrayTEMP.size() - 1).equals("+") || arrayTEMP.get(arrayTEMP.size() - 1).equals("-") || arrayTEMP.get(arrayTEMP.size() - 1).equals("/"))) {
                    arrayTEMP.set(arrayTEMP.size() - 1, "*");
                    //System.out.println(arrayTEMP);
                    temp = "";
                    for(int i=0; i<arrayTEMP.size(); i++) {
                        temp += arrayTEMP.get(i) + " ";
                    }
                }

                if(arrayTEMP.get(arrayTEMP.size() - 1).equals("*")) {
                    input.setText(temp);

                } else {
                    input.setText(temp + " * ");
                }
            }
        });


        divideBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // dividing
//                temp = a;
//                temp1 = 4;
//                a = "";
//                input.setText("/");
//                //input.setText("");

                temp = input.getText().toString();
                ArrayList<String> arrayTEMP = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                //System.out.println(arrayTEMP);

                if((arrayTEMP.get(arrayTEMP.size() - 1).equals("+") || arrayTEMP.get(arrayTEMP.size() - 1).equals("-") || arrayTEMP.get(arrayTEMP.size() - 1).equals("*"))) {
                    arrayTEMP.set(arrayTEMP.size() - 1, "/");
                    //System.out.println(arrayTEMP);

                    temp = "";
                    for(int i=0; i<arrayTEMP.size(); i++) {
                        temp += arrayTEMP.get(i) + " ";
                    }
                }

                if(arrayTEMP.get(arrayTEMP.size() - 1).equals("/")) {
                    input.setText(temp);

                } else {
                    input.setText(temp + " / ");
                }
            }
        });

        equalsBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                temp = input.getText().toString();

                ArrayList<String> array = new ArrayList<String>(Arrays.asList(temp.split(" "))); // dzialanie do listy stringow

                String checkIfFirstItemOfListIsEmpty = array.get(0);

                if(checkIfFirstItemOfListIsEmpty == "") {
                    Toast.makeText(MainActivity.this,"There is no mathematical operation!",500).show();
                } else {
                    if(array.get(0).equals("")) {
                        array.subList(0, 1).clear();
                    }

                    if(array.get(0).equals("-") && array.size()>1) {
                        String pom = array.get(1);
                        double pom1 = Double.parseDouble(pom);
                        pom1 *= -1;
                        pom = String.valueOf(pom1);
                        array.set(0, pom);
                        array.subList(1,2).clear();
                    }

                    if ((array.get(0).equals("+") || array.get(0).equals("*") || array.get(0).equals("/")) && array.size()>=1) {
                        //Toast.makeText(MainActivity.this, "Nie możesz rozpocząć ciągu z tym znakiem!", Toast.LENGTH_SHORT).show();
                        array.subList(0,1).clear();
                        if(array.size()>1) {
                            String pom = "";
                            for (int i = 0; i < array.size(); i++) {
                                pom += array.get(i);
                            }
                            input.setText(pom);
                        } else {
                            //input.setText("");
                            //Toast.makeText(MainActivity.this,"Nie podałeś żadnych działań!",500).show();
                            double pom = 0;
                            String pom1 = String.valueOf(pom);
                            array.add(0, pom1);
                            input.setText("");
                            Toast.makeText(MainActivity.this,"There has to be a digit at the end!",500).show();
                        }
                    }

                    if(array.get(0).equals("0") && array.size() == 1) {
                        input.setText("");
                    } else {



                        ArrayList<String> resultString = (ArrayList)array.clone();

                        if (array.get(array.size() - 1).equals("+") || array.get(array.size() - 1).equals("-") || array.get(array.size() - 1).equals("*") || array.get(array.size() - 1).equals("/")) {
                            Toast.makeText(MainActivity.this,"There has to be a digit at the end!",500).show();
                        } else {
                            for (int i = 0; i < resultString.size(); i++) {

                                if (resultString.get(i).equals("*")) {
                                    double temp = Double.parseDouble(resultString.get(i - 1));
                                    double temp1 = Double.parseDouble(resultString.get(i + 1));
                                    resultString.set(i - 1, String.valueOf(temp * temp1));
                                    resultString.subList(i, i + 2).clear();
                                    i = 0;
                                }

                                if(resultString.size() == 1) {
                                    i = 0;
                                }

                                if (resultString.get(i).equals("/")) {
                                    double temp = Double.parseDouble(resultString.get(i - 1));
                                    double temp1 = Double.parseDouble(resultString.get(i + 1));
                                    if(temp1 == 0) {
                                        Toast.makeText(MainActivity.this, "Dividing by 0!",500).show();
                                        temp1 = 1;
                                    }
                                    resultString.set(i - 1, String.valueOf(temp / temp1));
                                    resultString.subList(i, i + 2).clear();
                                    i = 0;
                                }

                                if(resultString.size() == 1) {
                                    i =0;
                                }
                            }

                            finalResult = Double.valueOf(resultString.get(0));

                            for(int i = 1; i < resultString.size(); i++) {
                                if (resultString.get(i).equals("+")) {
                                    finalResult += Double.valueOf(resultString.get(i+1));
                                } else if (resultString.get(i).equals("-")) {
                                    finalResult -= Double.valueOf(resultString.get(i+1));
                                }
                            }
                        }
                    }


                    //                System.out.println(finalResult);
                    //                System.out.println(resultString);

                    //                if(finalResult == 0) {
                    //                    result.setText(String.valueOf(resultString).replace("[","").replace("]",""));
                    //                } else {
                    //                    result.setText(String.valueOf(finalResult));
                    //                }


                    result.setText((String.valueOf(finalResult)));
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View v) {
                input.setText("");
                result.setText("");
                Toast.makeText(MainActivity.this, "Cleared!", 100).show();
            }
        });

    }
}