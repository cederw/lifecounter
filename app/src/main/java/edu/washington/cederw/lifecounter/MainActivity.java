package edu.washington.cederw.lifecounter;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    private int p1 = 20;
    private int p2 = 20;
    private int p3 = 20;
    private int p4 = 20;
    private int p5 = 20;
    private int p6 = 20;
    private int p7 = 20;
    private int p8 = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.button2);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.button3);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button4);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.button5);
        four.setOnClickListener(this); // calling onClick() method
        Button five = (Button) findViewById(R.id.button6);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.button7);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.button8);
        seven.setOnClickListener(this); // calling onClick() method
        Button eight = (Button) findViewById(R.id.button9);
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.button10);
        nine.setOnClickListener(this);
        Button ten = (Button) findViewById(R.id.button11);
        ten.setOnClickListener(this); // calling onClick() method
        Button eleven = (Button) findViewById(R.id.button12);
        eleven.setOnClickListener(this);
        Button twelve = (Button) findViewById(R.id.button13);
        twelve.setOnClickListener(this);
        Button thirteen = (Button) findViewById(R.id.button14);
        thirteen.setOnClickListener(this); // calling onClick() method
        Button fourteen = (Button) findViewById(R.id.button15);
        fourteen.setOnClickListener(this);
        Button fifteen = (Button) findViewById(R.id.button16);
        fifteen.setOnClickListener(this);
        Button sixteen = (Button) findViewById(R.id.button17);
        sixteen.setOnClickListener(this); // calling onClick() method
        Button seventeen = (Button) findViewById(R.id.button18);
        seventeen.setOnClickListener(this);
        Button eighteen = (Button) findViewById(R.id.button19);
        eighteen.setOnClickListener(this);
        Button nineteen = (Button) findViewById(R.id.button20);
        nineteen.setOnClickListener(this); // calling onClick() method
        Button twenty = (Button) findViewById(R.id.button21);
        twenty.setOnClickListener(this);
        Button twentyone = (Button) findViewById(R.id.button22);
        twentyone.setOnClickListener(this);
        Button twentytwo = (Button) findViewById(R.id.button23);
        twentytwo.setOnClickListener(this); // calling onClick() method
        Button twentythree = (Button) findViewById(R.id.button24);
        twentythree.setOnClickListener(this);
        Button twentyfour = (Button) findViewById(R.id.button25);
        twentyfour.setOnClickListener(this);
        Button twentyfive = (Button) findViewById(R.id.button26);
        twentyfive.setOnClickListener(this); // calling onClick() method
        Button twentysix = (Button) findViewById(R.id.button27);
        twentysix.setOnClickListener(this);
        Button twentysever = (Button) findViewById(R.id.button28);
        twentysever.setOnClickListener(this);
        Button twentyight = (Button) findViewById(R.id.button29);
        twentyight.setOnClickListener(this);
        Button twentynine = (Button) findViewById(R.id.button30);
        twentynine.setOnClickListener(this); // calling onClick() method
        Button thirty = (Button) findViewById(R.id.button31);
        thirty.setOnClickListener(this);
        Button thirtyone = (Button) findViewById(R.id.button32);
        thirtyone.setOnClickListener(this);
        Button thirtytwo = (Button) findViewById(R.id.button33);
        thirtytwo.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        Resources res = getResources();

        switch (v.getId()) {

            case R.id.button2:
                // do your code
                p1++;
                changeLife(R.id.textView4, p1);
                break;

            case R.id.button3:
                // do your code
                p1--;
                changeLife(R.id.textView4, p1);
                if(p1<=0){
                    lose(res.getString(R.string.player1));
                }
                break;

            case R.id.button4:
                // do your code
                p1+=5;
                changeLife(R.id.textView4, p1);
                break;
            case R.id.button5:
                // do your code
                p1-=5;
                changeLife(R.id.textView4, p1);
                if(p1<=0){
                    lose(res.getString(R.string.player1));
                }
                break;

            case R.id.button6:
                // do your code
                p2++;
                changeLife(R.id.textView5, p2);
                break;

            case R.id.button7:
                // do your code
                p2--;
                changeLife(R.id.textView5, p2);
                if(p2<=0){
                    lose(res.getString(R.string.player2));
                }
                break;
            case R.id.button8:
                // do your code
                p2+=5;
                changeLife(R.id.textView5, p2);
                break;


            case R.id.button9:
                // do your code
                p2-=5;
                changeLife(R.id.textView5, p2);
                if(p2<=0){
                    lose(res.getString(R.string.player2));
                }
                break;

            case R.id.button10:
                // do your code
                p3++;
                changeLife(R.id.textView6, p3);
                break;
            case R.id.button11:
                // do your code
                p3--;
                changeLife(R.id.textView6, p3);
                if(p3<=0){
                    lose(res.getString(R.string.player3));
                }
                break;

            case R.id.button12:
                // do your code
                p3+=5;
                changeLife(R.id.textView6, p3);
                break;

            case R.id.button13:
                // do your code
                p3-=5;
                changeLife(R.id.textView6, p3);
                if(p3<=0){
                    lose(res.getString(R.string.player3));
                }
                break;
            case R.id.button14:
                // do your code
                p4++;
                changeLife(R.id.textView7, p4);
                break;

            case R.id.button15:
                // do your code
                p4--;
                changeLife(R.id.textView7, p4);
                if(p4<=0){
                    lose(res.getString(R.string.player4));
                }
                break;

            case R.id.button16:
                // do your code
                p4+=5;
                changeLife(R.id.textView7, p4);
                break;
            case R.id.button17:
                // do your code
                p4-=5;
                changeLife(R.id.textView7, p4);
                if(p4<=0){
                    lose(res.getString(R.string.player4));
                }
                break;

            case R.id.button18:
                // do your code
                p5++;
                changeLife(R.id.textView8, p5);
                break;

            case R.id.button19:
                // do your code
                p5--;
                changeLife(R.id.textView8, p5);
                if(p5<=0){
                    lose(res.getString(R.string.player5));
                }
                break;

            case R.id.button20:
                // do your code
                p5+=5;
                changeLife(R.id.textView8, p5);

                break;
            case R.id.button21:
                // do your code
                p5-=5;
                changeLife(R.id.textView8, p5);
                if(p5<=0){
                    lose(res.getString(R.string.player5));
                }
                break;

            case R.id.button22:
                // do your code
                p6++;
                changeLife(R.id.textView9, p6);
                break;

            case R.id.button23:
                // do your code
                p6--;
                changeLife(R.id.textView9, p6);
                if(p6<=0){
                    lose(res.getString(R.string.player6));
                }
                break;
            case R.id.button24:
                // do your code
                p6+=5;
                changeLife(R.id.textView9, p6);

                break;

            case R.id.button25:
                // do your code
                p6-=5;
                changeLife(R.id.textView9, p6);
                if(p6<=0){
                    lose(res.getString(R.string.player6));
                }
                break;

            case R.id.button26:
                // do your code
                p7++;
                changeLife(R.id.textView10, p7);
                break;
            case R.id.button27:
                // do your code
                p7--;
                changeLife(R.id.textView10, p7);
                if(p7<=0){
                    lose(res.getString(R.string.player7));
                }
                break;

            case R.id.button28:
                // do your code
                p7+=5;
                changeLife(R.id.textView10, p7);

                break;

            case R.id.button29:
                // do your code
                p7-=5;
                changeLife(R.id.textView10, p7);
                if(p7<=0){
                    lose(res.getString(R.string.player7));
                }
                break;

            case R.id.button30:
                // do your code
                p8++;
                changeLife(R.id.textView11, p8);
                break;
            case R.id.button31:
                // do your code
                p8--;
                changeLife(R.id.textView11, p8);
                if(p8<=0){
                    lose(res.getString(R.string.player8));
                }
                break;

            case R.id.button32:
                // do your code
                p8+=5;
                changeLife(R.id.textView11, p8);
                break;

            case R.id.button33:
                // do your code
                p8-=5;
                changeLife(R.id.textView11, p8);
                if(p8<=0){
                    lose(res.getString(R.string.player8));
                }
                break;

            default:
                break;
        }
    }

    private void lose(String player){
        TextView result = (TextView) findViewById(R.id.textView);
        result.setText(player +" LOSES");
    }

    private void changeLife(int id, int life){
        TextView result = (TextView) findViewById(id);
        result.setText(" Life: "+ life);
    }


}
