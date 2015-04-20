package edu.washington.cederw.lifecounter;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    private int playerCount = 2;

    //i should have stored these in an array
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

        //buttons for all 8 players
        Button add = (Button) findViewById(R.id.button);
        add.setOnClickListener(this); // calling onClick() method
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

        //hide the extra players

        LinearLayout lThree = (LinearLayout) findViewById(R.id.three);
        lThree.setVisibility(View.GONE);
        lThree = (LinearLayout) findViewById(R.id.four);
        lThree.setVisibility(View.GONE);
        lThree = (LinearLayout) findViewById(R.id.five);
        lThree.setVisibility(View.GONE);
        lThree = (LinearLayout) findViewById(R.id.six);
        lThree.setVisibility(View.GONE);
        lThree = (LinearLayout) findViewById(R.id.seven);
        lThree.setVisibility(View.GONE);
        lThree = (LinearLayout) findViewById(R.id.eight);
        lThree.setVisibility(View.GONE);


    }

    //please tell me there is a better way to have one event listener
    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        Resources res = getResources();

        switch (v.getId()) {

            case R.id.button:
                // do your code
                if(playerCount>=8){
                    break;
                }
                changePlayers();
                break;

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
                changeLife(R.id.textView7, p3);
                break;
            case R.id.button11:
                // do your code
                p3--;
                changeLife(R.id.textView7, p3);
                if(p3<=0){
                    lose(res.getString(R.string.player3));
                }
                break;

            case R.id.button12:
                // do your code
                p3+=5;
                changeLife(R.id.textView7, p3);
                break;

            case R.id.button13:
                // do your code
                p3-=5;
                changeLife(R.id.textView7, p3);
                if(p3<=0){
                    lose(res.getString(R.string.player3));
                }
                break;
            case R.id.button14:
                // do your code
                p4++;
                changeLife(R.id.textView9, p4);
                break;

            case R.id.button15:
                // do your code
                p4--;
                changeLife(R.id.textView9, p4);
                if(p4<=0){
                    lose(res.getString(R.string.player4));
                }
                break;

            case R.id.button16:
                // do your code
                p4+=5;
                changeLife(R.id.textView9, p4);
                break;
            case R.id.button17:
                // do your code
                p4-=5;
                changeLife(R.id.textView9, p4);
                if(p4<=0){
                    lose(res.getString(R.string.player4));
                }
                break;

            case R.id.button18:
                // do your code
                p5++;
                changeLife(R.id.textView11, p5);
                break;

            case R.id.button19:
                // do your code
                p5--;
                changeLife(R.id.textView11, p5);
                if(p5<=0){
                    lose(res.getString(R.string.player5));
                }
                break;

            case R.id.button20:
                // do your code
                p5+=5;
                changeLife(R.id.textView11, p5);

                break;
            case R.id.button21:
                // do your code
                p5-=5;
                changeLife(R.id.textView11, p5);
                if(p5<=0){
                    lose(res.getString(R.string.player5));
                }
                break;

            case R.id.button22:
                // do your code
                p6++;
                changeLife(R.id.textView13, p6);
                break;

            case R.id.button23:
                // do your code
                p6--;
                changeLife(R.id.textView13, p6);
                if(p6<=0){
                    lose(res.getString(R.string.player6));
                }
                break;
            case R.id.button24:
                // do your code
                p6+=5;
                changeLife(R.id.textView13, p6);

                break;

            case R.id.button25:
                // do your code
                p6-=5;
                changeLife(R.id.textView13, p6);
                if(p6<=0){
                    lose(res.getString(R.string.player6));
                }
                break;

            case R.id.button26:
                // do your code
                p7++;
                changeLife(R.id.textView15, p7);
                break;
            case R.id.button27:
                // do your code
                p7--;
                changeLife(R.id.textView15, p7);
                if(p7<=0){
                    lose(res.getString(R.string.player7));
                }
                break;

            case R.id.button28:
                // do your code
                p7+=5;
                changeLife(R.id.textView15, p7);

                break;

            case R.id.button29:
                // do your code
                p7-=5;
                changeLife(R.id.textView15, p7);
                if(p7<=0){
                    lose(res.getString(R.string.player7));
                }
                break;

            case R.id.button30:
                // do your code
                p8++;
                changeLife(R.id.textView17, p8);
                break;
            case R.id.button31:
                // do your code
                p8--;
                changeLife(R.id.textView17, p8);
                if(p8<=0){
                    lose(res.getString(R.string.player8));
                }
                break;

            case R.id.button32:
                // do your code
                p8+=5;
                changeLife(R.id.textView17, p8);
                break;

            case R.id.button33:
                // do your code
                p8-=5;
                changeLife(R.id.textView17, p8);
                if(p8<=0){
                    lose(res.getString(R.string.player8));
                }
                break;

            default:
                break;
        }
    }

    //announce a loss
    private void lose(String player){
        TextView result = (TextView) findViewById(R.id.textView);
        result.setText(player +" LOSES");
    }

    //update the life helper method
    private void changeLife(int id, int life){
        TextView result = (TextView) findViewById(id);
        result.setText(" Life: "+ life);
    }

    //add a new player
    private void changePlayers(){
        switch(playerCount){
            case 2:
                LinearLayout lThree = (LinearLayout) findViewById(R.id.three);
                lThree.setVisibility(View.VISIBLE);
                playerCount++;
                break;
            case 3:
                lThree = (LinearLayout) findViewById(R.id.four);
                lThree.setVisibility(View.VISIBLE);
                playerCount++;
                break;
            case 4:
                lThree = (LinearLayout) findViewById(R.id.five);
                lThree.setVisibility(View.VISIBLE);
                playerCount++;
                break;
            case 5:
                lThree = (LinearLayout) findViewById(R.id.six);
                lThree.setVisibility(View.VISIBLE);
                playerCount++;
                break;
            case 6:
                lThree = (LinearLayout) findViewById(R.id.seven);
                lThree.setVisibility(View.VISIBLE);
                playerCount++;
                break;
            case 7:
                lThree = (LinearLayout) findViewById(R.id.eight);
                lThree.setVisibility(View.VISIBLE);
                playerCount++;
                break;
            default:
                break;

        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.

        savedInstanceState.putInt("playerCount", playerCount);
        savedInstanceState.putInt("p1", p1);
        savedInstanceState.putInt("p2", p2);
        savedInstanceState.putInt("p3", p3);
        savedInstanceState.putInt("p4", p4);
        savedInstanceState.putInt("p5", p5);
        savedInstanceState.putInt("p6", p6);
        savedInstanceState.putInt("p7", p7);
        savedInstanceState.putInt("p8", p8);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        //my code cant just set the number of players, you have to add them one by one x.x
        int pCount = savedInstanceState.getInt("playerCount");
        for(int i=2;i<pCount;i++){
            changePlayers();
        }

        p1 = savedInstanceState.getInt("p1");
        changeLife(R.id.textView4, p1);
        p2 = savedInstanceState.getInt("p2");
        changeLife(R.id.textView5, p2);
        p3 = savedInstanceState.getInt("p3");
        changeLife(R.id.textView7, p3);
        p4 = savedInstanceState.getInt("p4");
        changeLife(R.id.textView9, p4);
        p5 = savedInstanceState.getInt("p5");
        changeLife(R.id.textView11, p5);
        p6 = savedInstanceState.getInt("p6");
        changeLife(R.id.textView13, p6);
        p7 = savedInstanceState.getInt("p7");
        changeLife(R.id.textView15, p7);
        p8 = savedInstanceState.getInt("p8");
        changeLife(R.id.textView17, p8);

    }

}
