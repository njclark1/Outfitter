package com.example.outfitter;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Wardrobe extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView hatView;
    ImageView shirtView;
    ImageView pantView;
    ImageView shoeView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wardrobe);

        hatView = findViewById(R.id.hatView);
        shirtView = findViewById(R.id.shirtView);
        pantView = findViewById(R.id.pantView);
        shoeView = findViewById(R.id.shoeView);

        Spinner hatSpinner = findViewById(R.id.hatSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Hats, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hatSpinner.setAdapter(adapter);
        hatSpinner.setOnItemSelectedListener(this);

        Spinner shirtSpinner = findViewById(R.id.shirtSpinner);
        ArrayAdapter<CharSequence> shirtAdapter = ArrayAdapter.createFromResource(this, R.array.Shirts, android.R.layout.simple_spinner_item);
        shirtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shirtSpinner.setAdapter(shirtAdapter);
        shirtSpinner.setOnItemSelectedListener(this);

        Spinner pantSpinner = findViewById(R.id.pantSpinner);
        ArrayAdapter<CharSequence> pantAdapter = ArrayAdapter.createFromResource(this, R.array.Pants, android.R.layout.simple_spinner_item);
        pantAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pantSpinner.setAdapter(pantAdapter);
        pantSpinner.setOnItemSelectedListener(this);

        Spinner shoeSpinner = findViewById(R.id.shoeSpinner);
        ArrayAdapter<CharSequence> shoeAdapter = ArrayAdapter.createFromResource(this, R.array.Shoes, android.R.layout.simple_spinner_item);
        shoeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shoeSpinner.setAdapter(shoeAdapter);
        shoeSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //image assets
        String bootsImage = "https://lh3.googleusercontent.com/zqltpmt1P_fi-54iOgbwHfe0d3K6HnH3agilaP4bD7Zd5mY6cvpCNsz_SJcq7CDRBQ7foxI5DUUnoTf0PVOi4chdGN5z0TDDxYyDRXfLFzoiJrTGOlpLgAJrgR8ZkRLvtxu5D7kcMyfQAYZw0aiSsSZp2cyTgDlwurFwr1gIANDw7IzYzKfVnitOD4J0ZVLIQnT85x5JXVSTHYkl4aRQp2iRhGP-W4tw0D-5yQTUEbS8r9vElLxoFB1R6i2gAqKVOXB6P_X1VU6ybPpv5BNJM6G35NkSR8rSqu7uc2952KrLsghkYZ-mItJxBHZd41-smIAJf71EtseB5PSLsQgwOkJQmZKMpR8ooWUdhywwAA8OsCD670tCLIuv1WeoaEeprdXYe7wsyj5sjUIBsh5h1vUPpZBzGdVdl8AT8NM5W2QTOVdDMME_LNJN2KcgOrHpsgc-HfJBLoS1XQ1gPAUVVyZXgWY1NbC8AbjXy5X-YeCoLSZJq7VPD4gA3rbEy3Z-vsG6TzUxehm61YannDL2t3ZBDWFG379VzhIQZXLnIMR_s5V1Ez3L8cTFUyeMOoMDXvRgMR84pUbHqkraHBPkEKm6n8vrizq6UYdkXYjvXiLh0Op-p89G0KHrDslaON3Fpcqq1IRc848PPNsjlnbstVX8S670p078B6FMY8UJZ7cYAaxfGG5EzP2GRG88O1xmZztQm3rXmC0hdbPrut-cPnmb=w433-h577-no?authuser=0";
        String shortsImage = "https://lh3.googleusercontent.com/dBOJxPiJ4ph_TexQamo-f0-LM9GRIMKyLEGFRjWddGNEUmeh6SbjADMJj8xmNFyZ6UEK-jLbt9eJiG97DVbG-LKllcrm2CPULY3KH5OlEcat1suqbX8j6dVG5Ac4SiLrrOrO0TJADuSFejPQhHmsZv97ZSZc2dn7EpuodTLKWuLS7w9zqGTlkDcrVAkvrdU9P_qV1aRPOB_nMevk5QGW4o9X28o8CZGz2mQwWBOev6_06bOp4lWUhIXlGrzkYlv7ZET3lJicAUiIwYXK2E5jaINJi_1OAy3NhFfuvOmgjU1mUJt_Hadoquv3kbm49f8h8_ctbD_sWYrk7avWVB_rDulOojJo1zQjBrHgdsT8EMYZcms1jb9xgh6IVNGG_ykErbvMnzZtmwjqmol2jGSNNdwULbST8-w86-_FFcgAyhX6fRzJrbLYN-u9r17MvJBh-vaAlnb-Z79QIdMHoKhiZ6wyF9sHSIxzasx3jDFQfaF-b6xl7IlhrhXB53zr-zeJTEUnQQ9DhNGOw6ZXfIasL4AeaMAAILmpqK1ohN5UqtnwyLpmvQHbyg_l4CK6-iYvo3DHhfNjWY6P6dCSOee58lcrLjxP4NKw6amrZ7G7tBEiXmwOFyt3Z132t18kUv_PpG7wEyJoPe804FbF2G2N6rFwrfOuyxRT9O4nyBaevQmt5grajzVy8kis_RJptmCWbRXeTfEZMUrhKz1bgSnv6Y7J=w433-h577-no?authuser=0";
        String jacketImage = "https://lh3.googleusercontent.com/ajM4GqcOFedSWlyO1Me8J9oXXxevUf7H9FB5H1P0OKh_uHWzYwEBFwHz9GYvQkayleeVj76L4bH9c8PTEG2zP7FxkNd4zUB0peuhUd06EhKrNhMBo-ITSQtEz9x9yXNzAMQPwUFdp6aJ2tx3BBP1qII93y0mRlCTvnH35ukEcdSnoeVL9DQV9IoKphXDzI_uh5fsq4gIE6QOBJHGVW67Vp8fTpIplPow9aHQlpxZMwWr4ksCxKfPoHnYExT3Wd2_Gp1cvgG8aEHYPvK5DKXOR0MQR7hF1obTFLQovzysLqccA1Zolyr8ySSUR8lj4phSQ9z7Sunp1812kXsCu-_r7XgmBsgtdgEgcbDj9W3p5XizVV2D0wtf1g5WRHnkRwRMQ7qHE6mG-wkbpAgAAgGmt5Bb0Btd1kvyYjwKVvkMwiwKa1g6sIRqT1Z_F7so3DGHMzz9TF0mMBy8N5tFwwoqzYYBbAo3bK84NITgc9z3UWqfneetyvoF2NlisCqg0HmbhN9Z8fTUltTcucLW2wjR4De_cAop8hyg6VamWzdn1Jr-g7Ptz1-Ce6ZKPKYTTEpQcQC-RfkxOoeS7JvDLXoKZ6C1AbZjE6HYQLqoHJRps5CcZ6sTUrFBOU_SypwaT3qe_V34aQN4ONpxIGjGH_nf7sSWuced6owRLJs8UV1BvLIC2Od4pIoxhetcaY8L_XOznJ_YekWoDlSBr3G3x8lUOdsM=w433-h577-no?authuser=0";
        String longsleeveShirt = "https://lh3.googleusercontent.com/IGrQloXDJeUBxQ8xnL14AClhDzJlPxt_ZU48ozu5Oomj5gnu7UWZEwDl-L0x2-LRWpduYPSZi8cs4CPbg4FuqmJN-NGsvBrYlacM1vU3XJwqvNjjGcl2yYxDbmsmb0SkX7tR0SBSxdva-uZ_CDI_X--I_5PJwOjsH5N2-dwhwcQax6HO2XSYUWXRzwqyEUjDwXyB1ERSY0AHlD7I4iTvjyXp3OWJBDLpF_JmFj0_b2CB7IuitAvMui5Zqcv8QS1aPt0R3gVMs7iHTiaF9frIVjBAuZXycjN56j6goSaMw99hgDc-TtSkbLLjk3Ek4UmIAV5hVPKtVPvNTcsvOc9T4fjm1ZeVvtYiy-snZCO9CeeBV-6X_d0QE2Tl8OL9WBmTnwBNnsv1z5xtExZqVjow404AxIuNpEyEc6PjlEeoLgltg9j9N7nUjCvtUBFiqorblZCeuXrDQ2FBEYoKQJDg12c1CHhLu_DrZ2ItYCNDSqae8nAXpDsFVzmimeLLfbhmNRySbsJqGPhYM6ZLTfIJGbsSydDQ1tJ84whPqHDYe1_Q7CIy3FQmAyaM2zoZWCUI-grvp69mnM7RMDjBcPsirh065OySB-eNyjD5vS8Dk5XiTv8JUqYaLE7dFp2Qxk0pPD5ga-f2K1QKv-_FD5VQUeSIPzDcuVYkZFTOj4LCuPs-NhsCq8t0eGIec3UlebzcmPj2NzGiCPbAVM0gYtxCWUXf=w287-h423-no?authuser=0";
        String happyPlaceholder = "https://lh3.googleusercontent.com/cTkVdu88uunam0d75JKFeQJ5fO-HxRH2NoUASXKaCuV-svZf2ivaR1Rtt63DGAWdLcVEU-gJ2wt0DNlOr2d3FtJMhLJvNXEiil2FV0-TYwVUCgGrWdzyP8O9DADepqQXLQV1FflbOMG7zBW1msKCMWD6pWlYIBn7JkJRjrNLmVwSN6NmNN0-SE-gXO0KOggLsv4HF50EcYR9ScXcwJasPE-pMOXfd5z-v7sS7zJqge-1J6C45YYZWFFX2SY-OPImdU0G6EOpZclw3gF8_V0FrkiHeMPXFNPmjrfyMafq4-1XB9ULOuZw-mNL1l31OwTtmCcuvs8E5HLKg1YC6g7fL1LDweKf2HDdN8PAFAi9MudsYkTjzsktta9mWIsv71ALUb6Q7ZvPDLx5Fqc0uslNk3PQVXzkEcITDvPz5r43pZUUOAodWNHhkV0o0PCraEGeFRk2UIOEufJZpucOfwiBxGx3-w8p9qZ5y13RNR4noOoCjSLH6LFkQOZwGHvyyj_Ab5aYmk8QeM7Pud4FLRr9_4il7uSeYpTs1nL1SGdyxPa0k9EmR1DpKw_0UA3hjGwoqLWbapZlxznTuNqNkKF37m_gHsyY9o5MoVh34GU3oCHBRqXf03Hc30o98_6VT2pysG58COPhfkRAO30Bmh4GKTc1MszUqiBHu5chHIWUz77MF-cbiT38I-uGU58YpPsY_6LWqp5raOiJr4JT8jAkCPN5=w433-h577-no?authuser=0";
        String PSHat = "https://lh3.googleusercontent.com/m_VbEOQtoyCKiyju32vH8CgPRc2H1NvonwIcjXrrem7Y92VTsao2RzwW0zJWGYw8urN4la6QrIdg8B3Ey6YKliyGyLIlACG2MJK-HE-lFV4Hcqw8gDN-0e_vQ_JrVDfgakkCy3AD2HxRftvvmPMasaadQuwW2f8Ymq7EfQxZnupl7kezyPbnicCSt8YCAgYOZDbBl0zLXnfqSSQ9iSKapSel4bVy5AXv1svQJcWoE2z9SOJ56Y5qCLCPFzol4mammmG_5pMQuhzLFH0FU4r-3R3Ma8xxmoJTthyLHv5gRI3UXI8FECQ-oDxZpO63gaOXFAJS0AHGXVXib5B3VHeHrJvv0qqS6PIot2NbXkwnbBSaI8u9KWIfMuKwQ3mNnp6TCPrXYXQl9gVpyF8-UWI1fRvvqUAAOsMkGFVbxewVz-oKqAk2tIbhh198nZUnRTMBfvLWwwAvXfJu_kNLfztPUqAyF6a2JS7goyKVXV8Os2fCoO-YbcfpVDCxLG9dYn26dgW1uIXgF1CW9kw4Vyzkld43XB2PMrkgEBbkrnkuLZyoNWZOHRMpBJOk_OQ0a7ehHs6YWBBB33ZsIxNbADoqRkHp0aYDZAUicTUHmd6Q9mgz30nvjWKGRNRTvJjGS5ajGNjzpNnEz2XDnAjzLsFvCD1j1OgvJF5AJmnRewBULUttW4nqY7bt-Vvkn2g1ORjYjvYR505CyC5-R3GtN0fG9ul_=w424-h438-no?authuser=0";

        switch (parent.getId()) {
            case R.id.hatSpinner:
                if (position == 1) {
                    Glide.with(this).load(PSHat).into(hatView);
                } else if (position == 2) {
                    Glide.with(this).load(happyPlaceholder).into(hatView);
                }
                break;
            case R.id.shirtSpinner:
                if (position == 1) {
                    Glide.with(this).load(longsleeveShirt).into(shirtView);
                } else if (position == 2) {

                    Glide.with(this).load(jacketImage).into(shirtView);               }
                break;
            case R.id.pantSpinner:
                if (position == 1) {
                    Glide.with(this).load(shortsImage).into(pantView);
                } else if (position == 2) {
                    Glide.with(this).load(happyPlaceholder).into(pantView);
                }
                break;
            case R.id.shoeSpinner:
                if (position == 1) {
                    Glide.with(this).load(bootsImage).into(shoeView);
                } else if (position == 2) {
                    Glide.with(this).load(happyPlaceholder).into(shoeView);
                }
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(), "nothing selected", Toast.LENGTH_LONG).show();
    }
}