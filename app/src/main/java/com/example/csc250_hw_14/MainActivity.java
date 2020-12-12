package com.example.csc250_hw_14;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

@SuppressWarnings("StatementWithEmptyBody")
public class MainActivity extends AppCompatActivity {
    private String Number_of_Rolls = "";
    private int diceCheck = 0;
    private int amount = 0;
    private String show_calculations = "";
    private int dice_sum = 0;
    private String finalDisplay = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(View v)
    {
        if(v.getId() == R.id.button1) //button 1
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "1";

                //System.out.println("Button 1 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button2) //button 2
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "2";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button3) //button 3
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "3";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button4) //button 4
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "4";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button5) //button 5
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "5";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button6) //button 6
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "6";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button7) //button 7
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "7";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button7) //button 7
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "7";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button8) //button 8
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "8";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button9) //button 9
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "9";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button0) //button 0
        {
            if (diceCheck == 1)
            {
                //only allow button to be pressed if dice as not been selected
            }
            else if (Number_of_Rolls.equals(""))
            {
                //only allow button to be pressed if dice as not been selected
                //and don't allow if no numbers in front
            }
            else
            {
                Number_of_Rolls = Number_of_Rolls + "0";

                //System.out.println("Button 2 pressed");
                TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
                //currentDice.setText(R.string.current_dice_string);
                currentDice.setText(Number_of_Rolls);
            }
        }
        else if(v.getId() == R.id.button_clearAll) //button clear all
        {
            Number_of_Rolls = "";
            diceCheck = 0;
            amount = 0;
            show_calculations = "";
            dice_sum = 0;
            finalDisplay = "";
            //System.out.println("Button 'clear' pressed");
            TextView currentDice = this.findViewById(R.id.textView_CurrentDice);
            currentDice.setText(R.string.current_dice_string);
            TextView finalDisp = this.findViewById(R.id.textView_finalDisplay);
            finalDisp.setText(R.string.Final_Display);
            TextView calc = this.findViewById(R.id.textView_DisplayCalculation);
            calc.setText(R.string.Display_Calculation_TextView);

            //currentDice.setText(Number_of_Rolls);
        }
        else if(v.getId() == R.id.button_roll) //button clear all
        {
            if(Number_of_Rolls.equals(""))
            {
                //don't roll id nothing has been entered
            }
            else if (diceCheck == 0)
            {
                //no need to roll if die has not been selected
            }
            else
            {
                int total = 0;
                String[] initial_split = Number_of_Rolls.split(" ");
                String Selected_Die = initial_split[1].trim();
                //System.out.println("string part 1: " + initial_split[0]);
                int[] results_Arr = new int[amount];
                Random rand = new Random();
                int randRoll = 0;

                for (int i = 0; i < amount; i++)
                {
                    if (Selected_Die.equals("D4"))
                    {
                        randRoll = rand.nextInt(4) + 1;
                    }
                    else if (Selected_Die.equals("D6"))
                    {
                        randRoll = rand.nextInt(6) + 1;
                    }
                    else if (Selected_Die.equals("D8"))
                    {
                        randRoll = rand.nextInt(8) + 1;
                    }
                    else if (Selected_Die.equals("D10"))
                    {
                        randRoll = rand.nextInt(10) + 1;
                    }
                    else if (Selected_Die.equals("D12"))
                    {
                        randRoll = rand.nextInt(12) + 1;
                    }
                    else if (Selected_Die.equals("D20"))
                    {
                        randRoll = rand.nextInt(20) + 1;
                    }
                    results_Arr[i] = randRoll;
                    //System.out.println(results_Arr[i]);

                    if (i == 0)
                    {
                        show_calculations = show_calculations + results_Arr[i];
                        dice_sum = dice_sum + results_Arr[i];
                    }
                    else if (i == amount-1)
                    {
                        show_calculations = show_calculations + results_Arr[i] + " =";
                        dice_sum = dice_sum + results_Arr[i];
                    }
                    else
                    {
                        show_calculations = show_calculations + " + " + results_Arr[i];
                        dice_sum = dice_sum + results_Arr[i];
                    }

                }
                finalDisplay = Integer.toString(dice_sum);

                TextView showCalc = this.findViewById(R.id.textView_DisplayCalculation);
                showCalc.setText(show_calculations);

                TextView showTotal = this.findViewById(R.id.textView_finalDisplay);
                showTotal.setText(finalDisplay);
            }
        }//end roll button
    } //end onButtonClicked()
    public void diePressed(View dv)
    {
        if (dv.getId() == R.id.button_D4) //four sided dice
        {
            if(Number_of_Rolls.equals(""))
            {
                return;
            }
            else if (diceCheck == 1)
            {
                return;
            }
            else
            {
            diceCheck = 1;
            amount = Integer.parseInt(Number_of_Rolls);
            Number_of_Rolls = Number_of_Rolls + " " + "D4";
            TextView diceType = this.findViewById(R.id.textView_CurrentDice);
            //diceType.setText(R.string.Display_Calculation_TextView);
            diceType.setText(Number_of_Rolls);
            }
        }//end button D4
        if (dv.getId() == R.id.button_D6) //six sided dice
        {
            if(Number_of_Rolls.equals(""))
            {
                return;
            }
            else if (diceCheck == 1)
            {
                return;
            }
            else
            {
                diceCheck = 1;
                amount = Integer.parseInt(Number_of_Rolls);
                Number_of_Rolls = Number_of_Rolls + " " + "D6";
                TextView diceType = this.findViewById(R.id.textView_CurrentDice);
                //diceType.setText(R.string.Display_Calculation_TextView);
                diceType.setText(Number_of_Rolls);
            }
        }//end button D6
        if (dv.getId() == R.id.button_D8) //eight sided dice
        {
            if(Number_of_Rolls.equals(""))
            {
                return;
            }
            else if (diceCheck == 1)
            {
                return;
            }
            else
            {
                diceCheck = 1;
                amount = Integer.parseInt(Number_of_Rolls);
                Number_of_Rolls = Number_of_Rolls + " " + "D8";
                TextView diceType = this.findViewById(R.id.textView_CurrentDice);
                //diceType.setText(R.string.Display_Calculation_TextView);
                diceType.setText(Number_of_Rolls);
            }
        }//end button D8
        if (dv.getId() == R.id.button_D10) //ten sided dice
        {
            if(Number_of_Rolls.equals(""))
            {
                return;
            }
            else if (diceCheck == 1)
            {
                return;
            }
            else
            {
                diceCheck = 1;
                amount = Integer.parseInt(Number_of_Rolls);
                Number_of_Rolls = Number_of_Rolls + " " + "D10";
                TextView diceType = this.findViewById(R.id.textView_CurrentDice);
                //diceType.setText(R.string.Display_Calculation_TextView);
                diceType.setText(Number_of_Rolls);
            }
        }//end button D10
        if (dv.getId() == R.id.button_D12) //twelve sided dice
        {
            if(Number_of_Rolls.equals(""))
            {
                return;
            }
            else if (diceCheck == 1)
            {
                return;
            }
            else
            {
                diceCheck = 1;
                amount = Integer.parseInt(Number_of_Rolls);
                Number_of_Rolls = Number_of_Rolls + " " + "D12";
                TextView diceType = this.findViewById(R.id.textView_CurrentDice);
                //diceType.setText(R.string.Display_Calculation_TextView);
                diceType.setText(Number_of_Rolls);
            }
        }//end button D12
        if (dv.getId() == R.id.button_D20) //twenty sided dice
        {
            if(Number_of_Rolls.equals(""))
            {

            }
            else if (diceCheck == 1)
            {

            }
            else
            {
                diceCheck = 1;
                amount = Integer.parseInt(Number_of_Rolls);
                Number_of_Rolls = Number_of_Rolls + " " + "D20";
                TextView diceType = this.findViewById(R.id.textView_CurrentDice);
                //diceType.setText(R.string.Display_Calculation_TextView);
                diceType.setText(Number_of_Rolls);
            }
        }//end button D20
    } //end diePressed()
} //end MainActivity class