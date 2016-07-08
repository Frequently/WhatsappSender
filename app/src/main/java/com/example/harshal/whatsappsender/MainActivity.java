package com.example.harshal.whatsappsender;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button sendthrough_whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendthrough_whatsapp = (Button) findViewById(R.id.button);

        sendthrough_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Uri uri = Uri.parse("smsto:" + "+919879612488");
                Intent sharingIntent = new Intent(Intent.ACTION_SENDTO,uri);

                sharingIntent.setType("text/plain");

                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                sharingIntent.setPackage("com.whatsapp");
                String shareBody = "BODY TEXT";

                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
                        "Hello");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);

                startActivity(sharingIntent);

              /*  Uri mUri = Uri.parse("smsto:+919879612488");
                Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
                mIntent.setPackage("com.whatsapp");
                mIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                mIntent.setType("text/plain");
                startActivity(mIntent);*/

/*

                try {

                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);

                    smsIntent.setData(Uri.parse("smsto:"));
                    smsIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address"  , new String ("+919428385880"));
                    smsIntent.putExtra("sms_body"  , "Hi ");
                    startActivity(smsIntent);

                    Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                }

                catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "SMS failed, please try again.", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            */
            }


        });

    }
}
