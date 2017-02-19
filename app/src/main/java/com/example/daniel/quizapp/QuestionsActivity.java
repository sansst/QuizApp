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

    //Variables to know which option is marked
    int question1,question3,question4,question6,question7,question8;

    //Variables to get the views of the buttons.
    //Question1
    RadioButton RBAbelardo, RBLuisEnrique,RBZidane,RBGuardiola;
    //Question3
    RadioButton RBRonaldo,RBRomario,RBEto,RBRonaldinho;
    //Question4
    RadioButton RBFigo,RBRonaldinho4,RBRonaldo4,RBEto4;
    //Question6
    RadioButton RBSporting,RBAtlettico,RBEspañol,RBHercules;
    //Question7
    RadioButton RBMessi,RBSuarez,RBIbrahimovic,RBIniesta;
    //Question8
    RadioButton RBSporting8,RBVillarreal,RBBcn,RBMadrid;
    //Question2
    TextView TV;
    //Question5
    CheckBox CB1;
    CheckBox CB2;
    CheckBox CB3;
    CheckBox CB4;



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
        RBAbelardo = (RadioButton) findViewById(R.id.radioButtonAbelardo);
        RBLuisEnrique = (RadioButton) findViewById(R.id.radioButtonLuisEnrique);
        RBZidane = (RadioButton) findViewById(R.id.radioButtonZidane);
        RBGuardiola = (RadioButton) findViewById(R.id.radioButtonGuardiola);
        RBRonaldo = (RadioButton) findViewById(R.id.radioButtonRonaldo);
        RBRomario = (RadioButton) findViewById(R.id.radioButtonRomário);
        RBEto = (RadioButton) findViewById(R.id.radioButtonEto);
        RBRonaldinho = (RadioButton) findViewById(R.id.radioButtonRonaldinho);
        RBFigo = (RadioButton) findViewById(R.id.radioButtonFigo);
        RBRonaldinho4 = (RadioButton) findViewById(R.id.radioButtonRonaldinho4);
        RBRonaldo4 = (RadioButton) findViewById(R.id.radioButtonRonaldo4);
        RBEto4 = (RadioButton) findViewById(R.id.radioButtonEto4);
        RBSporting = (RadioButton) findViewById(R.id.radioButtonSporting);
        RBAtlettico = (RadioButton) findViewById(R.id.radioButtonAtletico);
        RBEspañol = (RadioButton) findViewById(R.id.radioButtonEspañol);
        RBHercules = (RadioButton) findViewById(R.id.radioButtonHercules);
        RBMessi = (RadioButton) findViewById(R.id.radioButtonMessi);
        RBSuarez = (RadioButton) findViewById(R.id.radioButtonSuarez);
        RBIbrahimovic = (RadioButton) findViewById(R.id.radioButtonIbrahimovic);
        RBIniesta = (RadioButton) findViewById(R.id.radioButtonIniesta);
        RBSporting8 = (RadioButton) findViewById(R.id.radioButtonSporting8);
        RBVillarreal = (RadioButton) findViewById(R.id.radioButtonVillarreal);
        RBMadrid = (RadioButton) findViewById(R.id.radioButtonMadrid);
        RBBcn = (RadioButton) findViewById(R.id.radioButtonBcn);
        TV = (TextView) findViewById(R.id.EditViewQuestion2);
        CB1 = (CheckBox) findViewById(R.id.checkBoxBarcelonistas);
        CB2 = (CheckBox) findViewById(R.id.checkBoxCules);
        CB3 = (CheckBox) findViewById(R.id.checkBoxMerengues);
        CB4 = (CheckBox) findViewById(R.id.CheckBoxPepineros);
    }

    /////////////////////////////////////////////QUESTION 1////////////////////////////////////////

    private void unfocusQuestion1(int x) {
        if(x!=0) {
            if(x == 1) {
                RBAbelardo.setChecked(false);
            }
            else if (x == 2) {
                RBLuisEnrique.setChecked(false);
            }
            else if (x == 3) {
                RBZidane.setChecked(false);
            }
            else if (x == 4) {
                RBGuardiola.setChecked(false);
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
            RBAbelardo.setChecked(true);
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
            RBLuisEnrique.setChecked(true);
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
            RBZidane.setChecked(true);
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
            RBGuardiola.setChecked(true);
            unfocusQuestion1(question1);
            question1 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 3////////////////////////////////////////

    private void unfocusQuestion3(int x) {
        if(x!=0) {
            if(x == 1) {
                RBRonaldo.setChecked(false);
            }
            else if (x == 2) {
                RBRomario.setChecked(false);
            }
            else if (x == 3) {
                RBEto.setChecked(false);
            }
            else if (x == 4) {
                RBRonaldinho.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonRonaldo(View view) {
        if (question3 != 1) {
            RBRonaldo.setChecked(true);
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
            RBRomario.setChecked(true);
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
            RBEto.setChecked(true);
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
            RBRonaldinho.setChecked(true);
            unfocusQuestion3(question3);
            question3 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 4////////////////////////////////////////

    private void unfocusQuestion4(int x) {
        if(x!=0) {
            if(x == 1) {
                RBFigo.setChecked(false);
            }
            else if (x == 2) {
                RBRonaldinho4.setChecked(false);
            }
            else if (x == 3) {
                RBRonaldo4.setChecked(false);
            }
            else if (x == 4) {
                RBEto4.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonFigo(View view) {
        if (question4 != 1) {
            RBFigo.setChecked(true);
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
            RBRonaldinho4.setChecked(true);
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
            RBRonaldo4.setChecked(true);
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
            RBEto4.setChecked(true);
            unfocusQuestion4(question4);
            question4 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 6////////////////////////////////////////

    private void unfocusQuestion6(int x) {
        if(x!=0) {
            if(x == 1) {
                RBSporting.setChecked(false);
            }
            else if (x == 2) {
                RBAtlettico.setChecked(false);
            }
            else if (x == 3) {
                RBEspañol.setChecked(false);
            }
            else if (x == 4) {
                RBHercules.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonSporting(View view) {
        if (question6 != 1) {
            RBSporting.setChecked(true);
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
            RBAtlettico.setChecked(true);
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
            RBEspañol.setChecked(true);
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
            RBHercules.setChecked(true);
            unfocusQuestion6(question6);
            question6 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 7////////////////////////////////////////

    private void unfocusQuestion7(int x) {
        if(x!=0) {
            if(x == 1) {
                RBMessi.setChecked(false);
            }
            else if (x == 2) {
                RBSuarez.setChecked(false);
            }
            else if (x == 3) {
                RBIbrahimovic.setChecked(false);
            }
            else if (x == 4) {
                RBIniesta.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonMessi(View view) {
        if (question7 != 1) {
            RBMessi.setChecked(true);
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
            RBSuarez.setChecked(true);
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
            RBIbrahimovic.setChecked(true);
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
            RBIniesta.setChecked(true);
            unfocusQuestion7(question7);
            question7 = 4;
        }

    }

    /////////////////////////////////////////////QUESTION 8////////////////////////////////////////

    private void unfocusQuestion8(int x) {
        if(x!=0) {
            if(x == 1) {
                RBSporting8.setChecked(false);
            }
            else if (x == 2) {
                RBVillarreal.setChecked(false);
            }
            else if (x == 3) {
                RBMadrid.setChecked(false);
            }
            else if (x == 4) {
                RBBcn.setChecked(false);
            }
        }
    }

    /**
     * sets the radio button of Abelardo as the answer
     * @param view
     */
    public void radioButtonSporting8(View view) {
        if (question8 != 1) {
            RBSporting8.setChecked(true);
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
            RBVillarreal.setChecked(true);
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
            RBMadrid.setChecked(true);
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
            RBBcn.setChecked(true);
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


        String TVText = TV.getText().toString();


        if(TVText.equalsIgnoreCase("camp nou")) ++result;

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
