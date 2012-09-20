package fr.ippon.tatami;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.DroidGap;

public class TatamiActivity extends DroidGap
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("https://tatami.ippon.fr");
    }
}
