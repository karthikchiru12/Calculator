package com.karthik.calculator;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText term;
    private TextView disp;
    private String temp = "";
    private String op = "";
    private double val1;
    private String avoid;
    private String type_val1 = "";
    private String type_val2 = "";
    private int dotCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        term = findViewById(R.id.term);
        disp = findViewById(R.id.disp);

    }


    public void one(View view) {
        temp = temp.concat("1");
        term.setText(temp);
    }

    public void two(View view) {
        temp = temp.concat("2");
        term.setText(temp);
    }

    public void three(View view) {
        temp = temp.concat("3");
        term.setText(temp);
    }

    public void four(View view) {
        temp = temp.concat("4");
        term.setText(temp);
    }

    public void five(View view) {
        temp = temp.concat("5");
        term.setText(temp);
    }

    public void six(View view) {
        temp = temp.concat("6");
        term.setText(temp);
    }

    public void seven(View view) {
        temp = temp.concat("7");
        term.setText(temp);
    }

    public void eight(View view) {
        temp = temp.concat("8");
        term.setText(temp);
    }

    public void nine(View view) {
        temp = temp.concat("9");
        term.setText(temp);
    }

    public void zero(View view) {
        temp = temp.concat("0");
        term.setText(temp);
    }

    public void percentile(View view) {
        if (op == "")
            op = "%";


        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat(val1 + "%");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat((int) val1 + "%");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public void square_root(View view) {


        if (op == "")
            op = "√";

        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat("√" + val1);
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat("√" + (int) val1);
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public void square(View view) {
        if (op == "")
            op = "²";

        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat(val1 + "²");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat((int) val1 + "²");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public void one_by_x(View view) {


        if (op == "")
            op = "1/x";

        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat("1" + "/" + val1);
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat("1" + "/" + (int) val1);
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public void CE(View view) {
        term.setText("");
        disp.setText("");
        temp = "";
        dotCount = 0;
        op = "";
    }

    public void C(View view) {
        finish();
    }

    public void back(View view) throws StringIndexOutOfBoundsException {
        try {

            if (temp.length() > 0) {
                int last;
                last = temp.length();
                if (temp.charAt(last - 1) == '.') {
                    dotCount = 0;
                }
                String x = temp.substring(0, last - 1);
                temp = x;
                term.setText(x);
                x = "";
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


    }

    public void division(View view) throws NumberFormatException {
        if (op == "")
            op = "/";

        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat(val1 + "/");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat((int) val1 + "/");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public void product(View view) throws NumberFormatException {
        if (op == "")
            op = "*";

        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat(val1 + "*");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat((int) val1 + "*");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public void minus(View view) throws NumberFormatException {

        if (op == "")
            op = "-";

        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat(val1 + "-");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat((int) val1 + "-");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public void add(View view) throws NumberFormatException {
        if (op == "")
            op = "+";

        try {

            val1 = Double.parseDouble(temp);
            temp = "";
            type_val1 = Standardize(val1);
            if (type_val1 == "double") {
                temp = temp.concat(val1 + "+");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }
            if (type_val1 == "int") {
                temp = temp.concat((int) val1 + "+");
                disp.setText(temp);
                temp = "";
                term.setText("");
                dotCount = 0;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public void equal_to(View view) throws NumberFormatException {
        try {
            if (op == "%") {
                double val2 = Double.parseDouble(temp);
                type_val2 = Standardize(val2);
                temp = "";

                if ((type_val1 == "double") || (type_val2 == "double")) {
                    double cal = val1 % val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat(val1 + "%" + val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if ((type_val1 == "int") && (type_val2 == "int")) {


                    int cal = (int) val1 % (int) val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat((int) val1 + "%" + (int) val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val2 = "";
                type_val1 = "";


            }

            if (op == "/") {

                double val2 = Double.parseDouble(temp);
                type_val2 = Standardize(val2);
                temp = "";

                if ((type_val1 == "double") || (type_val2 == "double")) {
                    double cal = val1 / val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat(val1 + "/" + val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if ((type_val1 == "int") && (type_val2 == "int")) {


                    int cal = (int) val1 / (int) val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat((int) val1 + "/" + (int) val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val2 = "";
                type_val1 = "";

            }

            if (op == "*") {

                double val2 = Double.parseDouble(temp);
                type_val2 = Standardize(val2);
                temp = "";

                if ((type_val1 == "double") || (type_val2 == "double")) {
                    double cal = val1 * val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat(val1 + "*" + val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if ((type_val1 == "int") && (type_val2 == "int")) {


                    int cal = (int) val1 * (int) val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat((int) val1 + "*" + (int) val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val2 = "";
                type_val1 = "";


            }

            if (op == "-") {


                double val2 = Double.parseDouble(temp);
                type_val2 = Standardize(val2);
                temp = "";

                if ((type_val1 == "double") || (type_val2 == "double")) {
                    double cal = val1 - val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat(val1 + "-" + val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if ((type_val1 == "int") && (type_val2 == "int")) {


                    int cal = (int) val1 - (int) val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat((int) val1 + "-" + (int) val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val2 = "";
                type_val1 = "";

            }

            if (op == "+") {

                double val2 = Double.parseDouble(temp);
                type_val2 = Standardize(val2);
                temp = "";

                if ((type_val1 == "double") || (type_val2 == "double")) {
                    double cal = val1 + val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat(val1 + "+" + val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if ((type_val1 == "int") && (type_val2 == "int")) {


                    int cal = (int) val1 + (int) val2;
                    String res = String.valueOf(cal);
                    temp = temp.concat((int) val1 + "+" + (int) val2);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val2 = "";
                type_val1 = "";


            }

            if (op == "²") {


                temp = "";

                if (type_val1 == "double") {
                    double cal = val1 * val1;
                    String res = String.valueOf(cal);
                    temp = temp.concat(val1 + "²");
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if (type_val1 == "int") {


                    int cal = (int) ((int) val1 * val1);
                    String res = String.valueOf(cal);
                    temp = temp.concat((int) val1 + "²");
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val1 = "";

            }

            if (op == "√") {


                temp = "";

                if (type_val1 == "double") {
                    double cal = Math.sqrt(val1);
                    String res = String.valueOf(cal);
                    temp = temp.concat("√" + val1);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if (type_val1 == "int") {


                    double cal = Math.sqrt(val1);
                    String res = String.valueOf(cal);
                    temp = temp.concat("√" + (int) val1);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val1 = "";


            }

            if (op == "1/x") {
                temp = "";

                if (type_val1 == "double") {
                    double cal = 1 / val1;
                    String res = String.valueOf(cal);
                    temp = temp.concat("1" + "/" + val1);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }
                if (type_val1 == "int") {


                    int cal = 1 / (int) val1;
                    String res = String.valueOf(cal);
                    temp = temp.concat("1" + "/" + (int) val1);
                    disp.setText(temp);
                    temp = "";
                    temp = temp.concat(res);
                    term.setText(res);

                }


                op = "";
                type_val1 = "";


            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public void dot(View view) {
        if ((term.getText().toString().length() != 0) && (dotCount == 0) && (op == "")) {
            temp = temp.concat(".");
            term.setText(temp);
            dotCount = 1;
        }
        if ((term.getText().toString().length() != 0) && (op != "") && (dotCount == 0)) {
            temp = temp.concat(".");
            term.setText(temp);
            dotCount = 1;

        }


    }

    public void plus_minus(View view) {

        double x = Double.parseDouble(temp);
        if (x - (int) x == 0) {
            temp = "";
            temp = temp.concat(String.valueOf(-(int) x));
            term.setText(temp);
        }
        if (x - (int) x != 0) {
            temp = "";
            temp = temp.concat(String.valueOf(-x));
            term.setText(temp);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) throws NullPointerException {

        if (item.getItemId() == R.id.main_item) {
            term.setText("");
            disp.setText("");
            temp = "";
            dotCount = 0;
            op = "";
            return true;
        }

        if (item.getItemId() == R.id.item1) {
            Toast.makeText(this, "Created by karthik chiru", Toast.LENGTH_SHORT).show();


           /* final Dialog dialog=new Dialog(this);
            dialog.setContentView(R.layout.about_popup);
            dialog.setTitle("ABOUT!..");
            Objects.requireNonNull(dialog.getWindow()).setLayout(1000,800);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            {
                dialog.getWindow().setAllowEnterTransitionOverlap(true);
            }

            dialog.getWindow().setTitle("ABOUT!..");
            dialog.show();


        }
        */

        }
        return super.onOptionsItemSelected(item);
    }

        public String Standardize ( double x)
        {
            String tp = "";
            if (x - (int) x != 0) {
                tp = "double";

            }
            if (x - (int) x == 0) {
                tp = "int";
            }

            return tp;

        }



    }




