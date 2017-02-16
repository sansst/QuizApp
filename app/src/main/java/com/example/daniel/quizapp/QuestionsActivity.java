package com.example.daniel.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.daniel.quizapp.R.string.question7;
import static com.example.daniel.quizapp.R.string.question8;

public class QuestionsActivity extends AppCompatActivity {

    int question1,question3,question4,question6,question7,question8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        question1 = 0;
        question3 = 0;
        question4 = 0;
        question6 = 0;
        question7 = 0;
        question8 = 0;

    }

    /////////////////////////////////////////////QUESTION 1////////////////////////////////////////

    private void unfocusQuestion1(int x) {
        if(x!=0) {
            if(x == 1) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonAbelardo);
                RB.setChecked(false);
            }
            else if (x == 2) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonLuisEnrique);
                RB.setChecked(false);
            }
            else if (x == 3) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonZidane);
                RB.setChecked(false);
            }
            else if (x == 4) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonGuardiola);
                RB.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    //abelardo is number 1
    public void radioButtonAbelardo(View view) {
        if (question1 != 1) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonAbelardo);
            RB.setChecked(true);
            unfocusQuestion1(question1);
            question1 = 1;
        }
    }

    /**
     *
     * @param view
     */
    //Luis Enrique is number 2
    public void radioButtonLuisEnrique(View view) {
        if (question1 != 2) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonLuisEnrique);
            RB.setChecked(true);
            unfocusQuestion1(question1);
            question1 = 2;
        }
    }

    /**
     *
     * @param view
     */
    //Zidane is number 3
    public void radioButtonZidane(View view) {
        if (question1 != 3) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonZidane);
            RB.setChecked(true);
            unfocusQuestion1(question1);
            question1 = 3;
        }

    }

    /**
     *
     * @param view
     */
    //Guardiola is number 4
    public void radioButtonGuardiola(View view) {
        if (question1 != 4) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonGuardiola);
            RB.setChecked(true);
            unfocusQuestion1(question1);
            question1 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 3////////////////////////////////////////

    private void unfocusQuestion3(int x) {
        if(x!=0) {
            if(x == 1) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldo);
                RB.setChecked(false);
            }
            else if (x == 2) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRomário);
                RB.setChecked(false);
            }
            else if (x == 3) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonEto);
                RB.setChecked(false);
            }
            else if (x == 4) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldinho);
                RB.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonRonaldo(View view) {
        if (question3 != 1) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldo);
            RB.setChecked(true);
            unfocusQuestion3(question3);
            question3 = 1;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonRomario(View view) {
        if (question3 != 2) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRomário);
            RB.setChecked(true);
            unfocusQuestion3(question3);
            question3 = 2;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonEto(View view) {
        if (question3 != 3) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonEto);
            RB.setChecked(true);
            unfocusQuestion3(question3);
            question3 = 3;
        }

    }

    /**
     *
     * @param view
     */
    public void radioButtonRonaldinho(View view) {
        if (question3 != 4) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldinho);
            RB.setChecked(true);
            unfocusQuestion3(question3);
            question3 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 4////////////////////////////////////////

    private void unfocusQuestion4(int x) {
        if(x!=0) {
            if(x == 1) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonFigo);
                RB.setChecked(false);
            }
            else if (x == 2) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldinho4);
                RB.setChecked(false);
            }
            else if (x == 3) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldo4);
                RB.setChecked(false);
            }
            else if (x == 4) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonEto4);
                RB.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonFigo(View view) {
        if (question4 != 1) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonFigo);
            RB.setChecked(true);
            unfocusQuestion4(question4);
            question4 = 1;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonRonaldinho4(View view) {
        if (question4 != 2) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldinho4);
            RB.setChecked(true);
            unfocusQuestion4(question4);
            question4 = 2;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonRonaldo4(View view) {
        if (question4 != 3) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonRonaldo4);
            RB.setChecked(true);
            unfocusQuestion4(question4);
            question4 = 3;
        }

    }

    /**
     *
     * @param view
     */
    public void radioButtonEto4(View view) {
        if (question4 != 4) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonEto4);
            RB.setChecked(true);
            unfocusQuestion4(question4);
            question4 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 6////////////////////////////////////////

    private void unfocusQuestion6(int x) {
        if(x!=0) {
            if(x == 1) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonSporting);
                RB.setChecked(false);
            }
            else if (x == 2) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonAtletico);
                RB.setChecked(false);
            }
            else if (x == 3) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonEspañol);
                RB.setChecked(false);
            }
            else if (x == 4) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonHercules);
                RB.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonSporting(View view) {
        if (question6 != 1) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonSporting);
            RB.setChecked(true);
            unfocusQuestion6(question6);
            question6 = 1;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonAtletico(View view) {
        if (question6 != 2) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonAtletico);
            RB.setChecked(true);
            unfocusQuestion6(question6);
            question6 = 2;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonEspañol(View view) {
        if (question6 != 3) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonEspañol);
            RB.setChecked(true);
            unfocusQuestion6(question6);
            question6 = 3;
        }

    }

    /**
     *
     * @param view
     */
    public void radioButtonHercules(View view) {
        if (question6 != 4) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonHercules);
            RB.setChecked(true);
            unfocusQuestion6(question6);
            question6 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 7////////////////////////////////////////

    private void unfocusQuestion7(int x) {
        if(x!=0) {
            if(x == 1) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonMessi);
                RB.setChecked(false);
            }
            else if (x == 2) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonSuarez);
                RB.setChecked(false);
            }
            else if (x == 3) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonIbrahimovic);
                RB.setChecked(false);
            }
            else if (x == 4) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonIniesta);
                RB.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonMessi(View view) {
        if (question7 != 1) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonMessi);
            RB.setChecked(true);
            unfocusQuestion7(question7);
            question7 = 1;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonSuarez(View view) {
        if (question7 != 2) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonSuarez);
            RB.setChecked(true);
            unfocusQuestion7(question7);
            question7 = 2;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonIbrahimovic(View view) {
        if (question7 != 3) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonIbrahimovic);
            RB.setChecked(true);
            unfocusQuestion7(question7);
            question7 = 3;
        }

    }

    /**
     *
     * @param view
     */
    public void radioButtonIniesta(View view) {
        if (question7 != 4) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonIniesta);
            RB.setChecked(true);
            unfocusQuestion7(question7);
            question7 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 8////////////////////////////////////////

    private void unfocusQuestion8(int x) {
        if(x!=0) {
            if(x == 1) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonSporting8);
                RB.setChecked(false);
            }
            else if (x == 2) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonVillarreal);
                RB.setChecked(false);
            }
            else if (x == 3) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonMadrid);
                RB.setChecked(false);
            }
            else if (x == 4) {
                RadioButton RB = (RadioButton) findViewById(R.id.radioButtonBcn);
                RB.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonSporting8(View view) {
        if (question8 != 1) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonSporting8);
            RB.setChecked(true);
            unfocusQuestion8(question8);
            question8 = 1;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonVillarreal(View view) {
        if (question8 != 2) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonVillarreal);
            RB.setChecked(true);
            unfocusQuestion8(question8);
            question8 = 2;
        }
    }

    /**
     *
     * @param view
     */
    public void radioButtonMadrid(View view) {
        if (question8 != 3) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonMadrid);
            RB.setChecked(true);
            unfocusQuestion8(question8);
            question8 = 3;
        }

    }

    /**
     *
     * @param view
     */
    public void radioButtonBcn(View view) {
        if (question8 != 4) {
            RadioButton RB = (RadioButton) findViewById(R.id.radioButtonBcn);
            RB.setChecked(true);
            unfocusQuestion8(question8);
            question8 = 4;
        }

    }

    public void buttonSubmit(View view) {
        int result = 0;
        if(question1 == 2) ++result;
        if(question3 == 4) ++result;
        if(question4 == 1) ++result;
        if(question6 == 3) ++result;
        if(question7 == 2) ++result;
        if(question8 == 4) ++result;


        TextView TV = (TextView) findViewById(R.id.EditViewQuestion2);
        String TVText = TV.getText().toString();


        if(TVText.equalsIgnoreCase("camp nou")) ++result;

        CheckBox CB1 = (CheckBox) findViewById(R.id.checkBoxBarcelonistas);
        CheckBox CB2 = (CheckBox) findViewById(R.id.checkBoxCules);
        CheckBox CB3 = (CheckBox) findViewById(R.id.checkBoxMerengues);
        CheckBox CB4 = (CheckBox) findViewById(R.id.CheckBoxPepineros);
        if (CB3.isChecked() || CB4.isChecked()) {
            if(CB1.isChecked() && CB2.isChecked()) {
                Log.d("hola","aficion correcta");
                ++result;
            }
        }

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("result",result);
        startActivity(i);
    }
}
