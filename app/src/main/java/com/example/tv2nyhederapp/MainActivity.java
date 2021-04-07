package com.example.tv2nyhederapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.tv2nyhederapp.businessLogic.Nyhedsindslag;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nyhedsindslag n1 = new Nyhedsindslag();
        n1.setOverskrift("Mit kæreste Eje Special - Kahler samling");
        n1.setTeaserText("Sille og Steffen er taget på tur i 2 specialprogrammer af Mit kæreste Eje Special - Kahler samling part 1");
        n1.setLinkTilStillbillede("MitkæresteEjeSpecialKahlerSamlingPart1.png");
        n1.setLinkTilVideo("MitkæresteEjeSpecialKahlerSamlingPart1.mp4");
        n1.setUdgivelsesdato(new Date());
        n1.setSlettet(false);
        n1.setUdgivgetEllerEj(false);


        Log.d("Debug", "Nyhed 1 overskrift " + n1.getOverskrift() + " Nyhed 1 TeaserText " + n1.getTeaserText() +
                " Nyhed 1 Link til Billede " + n1.getLinkTilStillbillede() + " Nyhed 1 Link Til Video " + n1.getLinkTilVideo() +
                "Nyhed 1  udgivelse Dato " + n1.getUdgivelsesdato().toString()  +  " Nyhed 1 er udgivet " + n1.isUdgivgetEllerEj()
               +"Nyhed 1 slette " + n1.isSlettet());

        Nyhedsindslag n2 = new Nyhedsindslag("Mit kæreste Eje Special - Kahler samling part 2", "Sille og Steffen er taget på tur i 2 specialprogrammer af Mit kæreste Eje Special - Kahler samling part 2", "MitkæresteEjeSpecialKahlerSamlingPart2.png");

        Log.d("Debug", "Nyhed 2 overskrift " + n2.getOverskrift() + " Nyhed 2 TeaserText " + n2.getTeaserText() +
                " Nyhed 2 Link til Billede " + n2.getLinkTilStillbillede());


        TextView nyhed1View = findViewById(R.id.overskrift1);
        TextView nyhed2View = findViewById(R.id.overskrift2);


        nyhed1View.setText(n1.getOverskrift());
        nyhed2View.setText(n2.getOverskrift());





    }





}