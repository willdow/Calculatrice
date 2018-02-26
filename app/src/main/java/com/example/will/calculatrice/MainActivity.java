package com.example.will.calculatrice;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btClear, btInverse, btPourcent, btDiviser, btSept, btHuit, btNeuf,
            btMultiplier, btQuatre, btCinq, btSix, btMoins, btUn, btDeux, btTrois,
            btPlus, btZero, btVirgule, btEgal;

    private TextView tvEcran;

    private Float nombre1 = 0.0f;
    private Float nombre2 = 0.0f;
    private Float resultat = 0.0f;
    private String operateur = "";
    private  boolean point = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btClear = (Button) findViewById(R.id.buttonAC);
        this.btInverse = (Button) findViewById(R.id.buttonInverse);
        this.btPourcent = (Button) findViewById(R.id.buttonPourcent);
        this.btDiviser = (Button) findViewById(R.id.buttonDiv);
        this.btSept = (Button) findViewById(R.id.button7);
        this.btHuit = (Button) findViewById(R.id.button8);
        this.btNeuf = (Button) findViewById(R.id.button9);
        this.btMultiplier = (Button) findViewById(R.id.buttonMul);
        this.btQuatre = (Button) findViewById(R.id.button4);
        this.btCinq = (Button) findViewById(R.id.button5);
        this.btSix = (Button) findViewById(R.id.button6);
        this.btMoins = (Button) findViewById(R.id.buttonSub);
        this.btUn = (Button) findViewById(R.id.button1);
        this.btDeux = (Button) findViewById(R.id.button2);
        this.btTrois = (Button) findViewById(R.id.button3);
        this.btPlus = (Button) findViewById(R.id.buttonAdd);
        this.btZero = (Button) findViewById(R.id.button0);
        this.btVirgule = (Button) findViewById(R.id.buttonDot);
        this.btEgal = (Button) findViewById(R.id.buttonEqual);
        this.tvEcran = (TextView) findViewById(R.id.edt1) ;


        this.btClear.setOnClickListener(this);
        this.btInverse.setOnClickListener(this);
        this.btPourcent.setOnClickListener(this);
        this.btDiviser.setOnClickListener(this);
        this.btSept.setOnClickListener(this);
        this.btHuit.setOnClickListener(this);
        this.btNeuf.setOnClickListener(this);
        this.btMultiplier.setOnClickListener(this);
        this.btQuatre.setOnClickListener(this);
        this.btCinq.setOnClickListener(this);
        this.btSix.setOnClickListener(this);
        this.btMoins.setOnClickListener(this);
        this.btUn.setOnClickListener(this);
        this.btDeux.setOnClickListener(this);
        this.btTrois.setOnClickListener(this);
        this.btPlus.setOnClickListener(this);
        this.btZero.setOnClickListener(this);
        this.btVirgule.setOnClickListener(this);
        this.btEgal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.button1:
                tvEcran.setText(tvEcran.getText() +"1");
                break;
            case R.id.button2:
                tvEcran.setText(tvEcran.getText() +"2");
                break;
            case R.id.button3:
                tvEcran.setText(tvEcran.getText()+"3");
                break;
            case R.id.button4:
                tvEcran.setText(tvEcran.getText()+"4");
                break;
            case R.id.button5:
                tvEcran.setText(tvEcran.getText()+"5");
                break;
            case R.id.button6:
                tvEcran.setText(tvEcran.getText()+"6");
                break;
            case R.id.button7:
                tvEcran.setText(tvEcran.getText()+"7");
                break;
            case R.id.button8:
                tvEcran.setText(tvEcran.getText()+"8");
                break;
            case R.id.button9:
                tvEcran.setText(tvEcran.getText()+"9");
                break;
            case R.id.button0:
                tvEcran.setText(tvEcran.getText()+"0");
                break;
            case R.id.buttonDot:
                if(this.point == false)
                {
                    tvEcran.setText(tvEcran.getText()+".");
                    this.point = false;
                }
                break;
            case R.id.buttonAdd:
                try{
                    nombre1 = Float.parseFloat(this.tvEcran.getText().toString());
                }
                catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Erreur sur le format du nombre !", Toast.LENGTH_SHORT).show();
                    this.nombre1 = 0.0f;
                }
                this.tvEcran.setText("");
                this.operateur = "plus";
                this.point = false;

                break;
            case R.id.buttonSub:
                try{
                    nombre1 = Float.parseFloat(this.tvEcran.getText().toString());
                }
                catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Erreur sur le format du nombre !", Toast.LENGTH_SHORT).show();
                    this.nombre1 = 0.0f;
                }
                this.tvEcran.setText("");
                this.operateur = "moins";
                this.point = false;

                break;
            case R.id.buttonMul:
                try{
                    nombre1 = Float.parseFloat(this.tvEcran.getText().toString());
                }
                catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Erreur sur le format du nombre !", Toast.LENGTH_SHORT).show();
                    this.nombre1 = 0.0f;
                }
                this.tvEcran.setText("");
                this.operateur = "multiplier";
                this.point = false;

                break;
            case R.id.buttonDiv:
                try{
                    nombre1 = Float.parseFloat(this.tvEcran.getText().toString());
                }
                catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Erreur sur le format du nombre !", Toast.LENGTH_SHORT).show();
                    this.nombre1 = 0.0f;
                }
                this.tvEcran.setText("");
                this.operateur = "diviser";
                this.point = false;

                break;

            case R.id.buttonPourcent:
                try{
                    nombre1 = Float.parseFloat(this.tvEcran.getText().toString());
                }
                catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Pourcent :Erreur sur le format du nombre  !", Toast.LENGTH_SHORT).show();
                    this.nombre1 = 0.0f;
                }
                this.tvEcran.setText("");
                this.operateur = "pourcent";
                this.point = false;

                break;

            case R.id.buttonInverse:
                try{
                    nombre1 = Float.parseFloat(this.tvEcran.getText().toString());
                }
                catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Inverse :Erreur sur le format du nombre !", Toast.LENGTH_SHORT).show();
                    this.nombre1 = 0.0f;
                }
                this.tvEcran.setText("");
                this.operateur = "inverse";
                this.point = false;

                break;
            case R.id.buttonEqual:
                if (!this.operateur.equals("pourcent") && !(this.operateur.equals("inverse")))
                {
                    try{
                        nombre2 = Float.parseFloat(this.tvEcran.getText().toString());
                    }
                    catch (NumberFormatException exp)
                    {
                        Toast.makeText(this, "Erreur sur le format du nombre !", Toast.LENGTH_SHORT).show();
                        this.nombre2 = 0.0f;
                    }
                }

                switch (this.operateur)
                {
                    case "plus": this.resultat = this.nombre1 + this.nombre2; break;
                    case "moins": this.resultat = this.nombre1 - this.nombre2; break;
                    case "multiplier": this.resultat = this.nombre1 * this.nombre2; break;
                    case "diviser":
                        if (this.nombre2==0.0f)
                        {
                            Toast.makeText(this, "Erreur : Division par 0 impossible !", Toast.LENGTH_SHORT).show();
                            this.resultat = 0.0f ;
                        }
                        else {
                            this.resultat = this.nombre1 / this.nombre2;
                        }
                        break;
                    case "pourcent": this.resultat = this.nombre1 / 100; break;
                    case "inverse": this.resultat = 1/this.nombre1 ; break;

                }

                this.tvEcran.setText(""+this.resultat);
                break;
            case R.id.buttonAC:
                tvEcran.setText("");
                break;
        }

    }
}
