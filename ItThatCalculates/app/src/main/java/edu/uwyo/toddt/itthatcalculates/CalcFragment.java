package edu.uwyo.toddt.itthatcalculates;

import android.content.Context;
import android.icu.text.DecimalFormat;
import android.inputmethodservice.KeyboardView;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CalcFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CalcFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalcFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    // Variables for fragment
    private Button plus, minus, multi, divide, pow, equal, deci, sign, clear, clearAll;
    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    TextView numEntry;
    String name;
    double num1;
    double num2;
    double ans;
    String stringAns;
    String op = "";
    Boolean opPress = false;

    public CalcFragment() {
        // Required empty public constructor
    }

    public static CalcFragment newInstance(String param1, String param2) {
        CalcFragment fragment = new CalcFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View calcInflater = inflater.inflate(R.layout.fragment_calc, container, false);

        // Text view
        numEntry = (TextView) calcInflater.findViewById(R.id.num_field);

        // The buttons
        one = (Button) calcInflater.findViewById(R.id.b_1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("1");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        two = (Button) calcInflater.findViewById(R.id.b_2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("2");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        three = (Button) calcInflater.findViewById(R.id.b_3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("3");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        four = (Button) calcInflater.findViewById(R.id.b_4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("4");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        five = (Button) calcInflater.findViewById(R.id.b_5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("5");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        six = (Button) calcInflater.findViewById(R.id.b_6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("6");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        seven = (Button) calcInflater.findViewById(R.id.b_7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("7");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        eight = (Button) calcInflater.findViewById(R.id.b_8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("8");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        nine = (Button) calcInflater.findViewById(R.id.b_9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("9");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        zero = (Button) calcInflater.findViewById(R.id.b_0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                numEntry.append("0");

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        // Operation buttons
        plus = (Button) calcInflater.findViewById(R.id.b_add);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(false)){
                    String tmp = numEntry.getText().toString();
                    if(tmp.equals("")){
                        num1 = 0;
                    } else{
                        num1 = Double.parseDouble(tmp);
                    }
                    opPress = true;
                    op = "add";
                }

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        minus = (Button) calcInflater.findViewById(R.id.b_sub);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(false)){
                    String tmp = numEntry.getText().toString();
                    if(tmp.equals("")){
                        num1 = 0;
                    } else{
                        num1 = Double.parseDouble(tmp);
                    }
                    opPress = true;
                    op = "sub";
                }

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        divide = (Button) calcInflater.findViewById(R.id.b_divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(false)){
                    String tmp = numEntry.getText().toString();
                    if(tmp.equals("")){
                        num1 = 0;
                    } else{
                        num1 = Double.parseDouble(tmp);
                    }
                    opPress = true;
                    op = "divide";
                }

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        multi = (Button) calcInflater.findViewById(R.id.b_times);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(false)){
                    String tmp = numEntry.getText().toString();
                    if(tmp.equals("")){
                        num1 = 0;
                    } else{
                        num1 = Double.parseDouble(tmp);
                    }
                    opPress = true;
                    op = "times";
                }

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        pow = (Button) calcInflater.findViewById(R.id.b_pow);
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(false)){
                    String tmp = numEntry.getText().toString();
                    if(tmp.equals("")){
                        num1 = 0;
                    } else{
                        num1 = Double.parseDouble(tmp);
                    }
                    opPress = true;
                    op = "pow";
                }

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        deci = (Button) calcInflater.findViewById(R.id.b_dec);
        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }
                name = numEntry.getText().toString();
                if(!name.contains(".")){
                    numEntry.append(".");
                }


                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        sign = (Button) calcInflater.findViewById(R.id.b_sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(true)){
                    numEntry.setText("");
                    opPress = false;
                }

                double num;
                String tmp = numEntry.getText().toString();
                if(tmp.equals("")){
                    num = 0;
                } else{
                    num = Double.parseDouble(tmp);
                }
                num = num * (-1);
                tmp = Double.toString(num);
                numEntry.setText(tmp);


                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        clear = (Button) calcInflater.findViewById(R.id.b_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numEntry.setText("");
                ans = 0;

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        clearAll = (Button) calcInflater.findViewById(R.id.b_clearAll);
        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numEntry.setText("");
                ans = 0;
                opPress = false;
                op = "";
                num1 = 0;
                num2 = 0;

                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        equal = (Button) calcInflater.findViewById(R.id.b_eq);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opPress.equals(false)){

                    String test = numEntry.getText().toString();
                    if(test.equals("")){
                        num2 = 0;
                    }
                    else {
                        num2 = Double.parseDouble(test);
                    }

                    switch(op){
                        case "add":
                            ans = num1 + num2;
                            break;
                        case "sub":
                            ans = num1 - num2;
                            break;
                        case "divide":
                            if(num2 != 0){
                                ans = num1/num2;
                            } else {
                                Toast.makeText(getActivity(), "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        case "times":
                            ans = num1 * num2;
                            break;
                        case "pow":
                            ans = Math.pow(num1, num2);
                            break;
                        case "":
                            ans = num2;
                        default:
                            break;
                    }
                    num1 = 0;
                    num2 = 0;
                    op = "";
                    if ( ans > 0) {
                        BigDecimal bd = new BigDecimal(String.valueOf(ans)).setScale(10, BigDecimal.ROUND_FLOOR);
                        ans = bd.doubleValue();
                    } else {
                        BigDecimal bd = new BigDecimal(String.valueOf(ans)).setScale(10, BigDecimal.ROUND_CEILING);
                        ans = bd.doubleValue();
                    }
                    stringAns = Double.toString(ans);
                    numEntry.setText(stringAns);
                }


                if (mListener != null) {
                    mListener.onFragmentInteraction(name);
                }

                Log.d("CalcFragment", "Logged Name: " + name);
            }
        });

        return calcInflater;
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(name);
//        }
//
//        Log.d("CalcFragment", "Logged Name: " + name);
//    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String name);
    }
}
