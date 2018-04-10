package com.example.sufiyananis.calculator;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    TextView tx;
    int a;
    int eqis=0;
    double b,c,d;
    Button bt;
    Button bdiv,bpl,bsb,bmul;
    String op,nop;
    Stack<Double> stack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        tx = (TextView)findViewById(R.id.txt);
        bt = (Button)findViewById(R.id.ba);
        bdiv = (Button)findViewById(R.id.bdiv);
        bpl = (Button)findViewById(R.id.bpl);
        bsb = (Button)findViewById(R.id.bsub);
        bmul = (Button)findViewById(R.id.bmul);
        a = Integer.parseInt(tx.getText().toString());
        tx.setText("0");
        op="";
        nop="";

        stack = new Stack<Double>();
    }
    public void Onclick1(View v){
        String s = tx.getText().toString();

        if(s!="0" &&  nop!="yes") {
            tx.setText(s + "1");
        }
        else {
            tx.setText("1");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick2(View v){
        String s = tx.getText().toString();

        if(s!="0" && nop!="yes") {
            tx.setText(s+"2");
        }
        else {
            tx.setText("2");
            bt.setText("C");
            nop="no";
        }
    }

    public void Onclick3(View v){
        String s = tx.getText().toString();
        if(s!="0" && nop!="yes") {
            tx.setText(s + "3");
        }
        else {
            tx.setText("3");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick4(View v){
        String s = tx.getText().toString();
        if(s!="0" && nop!="yes") {
            tx.setText(s + "4");
        }
        else {
            tx.setText("4");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick5(View v){
        String s = tx.getText().toString();
        if(s!="0" && nop!="yes") {
            tx.setText(s + "5");
        }
        else {
            tx.setText("5");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick6(View v){
        String s = tx.getText().toString();
        if(s!="0" && nop!="yes") {
            tx.setText(s + "6");
        }
        else {
            tx.setText("6");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick7(View v){
        String s = tx.getText().toString();
        if(s!="0" && nop!="yes") {
            tx.setText(s + "7");
        }
        else {
            tx.setText("7");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick8(View v){
        String s = tx.getText().toString();
        if(s!="0" && nop!="yes") {
            tx.setText(s + "8");
        }
        else {
            tx.setText("8");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick9(View v){
        String s = tx.getText().toString();
        if(s!="0" && nop!="yes") {
            tx.setText(s + "9");
        }
        else {
            tx.setText("9");
            bt.setText("C");
            nop="no";
        }
    }
    public void Onclick0(View v){
        String s = tx.getText().toString();
        if(s!="0" &&  nop!="yes") {
            tx.setText(s + "0");
        }
        else
            tx.setText("0");
    }


    public void Onclickac(View v){
        String s = tx.getText().toString();
        tx.setText("0");
        op="";
        bt.setText("AC");
        eqis=0;
        if(stack.empty()){
            bt.setText("AC");
        }else
            stack.pop();

    }

    public void Onclickpr(View v){
        double a = Double.parseDouble(tx.getText().toString());
        double b = a/100;
        tx.setText(b+"");

    }
    public void Onclicksg(View v){
        double a = Double.parseDouble(tx.getText().toString());
        if(a>0){
            tx.setText("-"+a);
        }
        else if (a<0){
            String s = a+"";
            tx.setText(s.substring(1));
        }
        else{
            tx.setText("0");
        }

    }
    public void Onclickplus(View v){
        op="+";
        nop="yes";
        if(eqis==0){
            stack.push( Double.parseDouble(tx.getText().toString()));

            eqis=1;
        }
        else{
            stack.push(Double.parseDouble(tx.getText().toString()));

            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = fst+snd;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
    }
    public void Onclicksub(View v){
        op="-";
        nop="yes";
        if(eqis==0){
            stack.push( Double.parseDouble(tx.getText().toString()));

            eqis=1;
        }
        else{
            stack.push(Double.parseDouble(tx.getText().toString()));

            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = snd-fst;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
    }

    public void Onclickmul(View v){
        op="*";
        nop="yes";
        if(eqis==0){
            stack.push( Double.parseDouble(tx.getText().toString()));

            eqis=1;
        }
        else{
            stack.push(Double.parseDouble(tx.getText().toString()));

            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = fst*snd;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
    }
    public void Onclickbk(View v){
        String s = tx.getText().toString();
        String s1="";
        int length = s.length()-1;
        if(s!="0"){
    for(int i=0;i<length;i++)
            s1=s1+s.charAt(i);
    tx.setText(s1);
        }
    }
    public void Onclickdiv(View v){
        op="/";
        nop="yes";
        if(eqis==0){
            stack.push( Double.parseDouble(tx.getText().toString()));

            eqis=1;
        }
        else{
            stack.push(Double.parseDouble(tx.getText().toString()));

            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = snd/fst;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
    }
    public void Onclickeq(View v){
        stack.push(Double.parseDouble(tx.getText().toString()));
        String s = tx.getText().toString();
        if(op=="+"){
            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = snd+fst;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
        else if(op=="-"){
            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = snd-fst;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
        else if(op=="*"){
            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = snd*fst;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
        else if(op=="/"){
            double fst = stack.pop();
            double snd = stack.pop();
            double thrd = snd/fst;
            stack.push(thrd);
            tx.setText(thrd+"");
        }
        else {
            tx.setText(s);
        }
        op="=";
        nop="yes";
    }

}
