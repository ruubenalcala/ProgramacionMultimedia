package com.example.aplicacionsonido;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    //ATRIBUTOS
    private SoundPool sp;
    private int sonidoDeReproduccion;
    private MediaPlayer mediaPlayer;
    private Button playSoundPoolButton;
    private Button playMediaPlayerButton;


    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playSoundPoolButton = findViewById(R.id.bt_soundpool);
        playMediaPlayerButton = findViewById(R.id.bt_mediaplayer);

        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonidoDeReproduccion = sp.load(this, R.raw.sound_short, 1);

        mediaPlayer = MediaPlayer.create(this, R.raw.sound_long);
    }

    public void audioSoundPool(View view){
        sp.play(sonidoDeReproduccion, 1, 1, 1, 0, 1.0f);
    }
    public void audioMediaPlayer(View view){
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(1.0f));
        mediaPlayer.start();
    }
}